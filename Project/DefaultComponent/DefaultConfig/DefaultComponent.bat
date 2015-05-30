echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1x64/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Default\evPrevBtnReleased.class del Default\evPrevBtnReleased.class
if exist Default\evNextBtnPress.class del Default\evNextBtnPress.class
if exist Default\evVolumeMute.class del Default\evVolumeMute.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\evVolumeDn.class del Default\evVolumeDn.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\evVolumeUp.class del Default\evVolumeUp.class
if exist Default\evUpdateSongTime.class del Default\evUpdateSongTime.class
if exist Default\evPrevBtnPress.class del Default\evPrevBtnPress.class
if exist Default\SongNavigationController.class del Default\SongNavigationController.class
if exist Default\Player.class del Default\Player.class
if exist Default\evNextBtnReleased.class del Default\evNextBtnReleased.class
if exist Default\VolumeController.class del Default\VolumeController.class
if exist Default\evPlayPause.class del Default\evPlayPause.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


