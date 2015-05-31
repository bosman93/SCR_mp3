/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: PanelAnimation
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.evNextBtnPress");
            Class.forName("Default.evNextBtnReleased");
            Class.forName("Default.evNextSong");
            Class.forName("Default.evPlayPause");
            Class.forName("Default.evPrevBtnPress");
            Class.forName("Default.evPrevBtnReleased");
            Class.forName("Default.evPrevSong");
            Class.forName("Default.evUpdateSongTime");
            Class.forName("Default.evUpdateVolumeVal");
            Class.forName("Default.evVolumeDn");
            Class.forName("Default.evVolumeMute");
            Class.forName("Default.evVolumeUp");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static Player p_Player = null;
    protected static SongNavigationController p_SongNavigationController = null;
    protected static VolumeController p_VolumeController = null;
    
    //## configuration DefaultComponent::PanelAnimation 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        p_Player = new Player(RiJMainThread.instance());
        p_Player.startBehavior();
        p_SongNavigationController = new SongNavigationController(RiJMainThread.instance());
        p_SongNavigationController.startBehavior();
        p_VolumeController = new VolumeController(RiJMainThread.instance());
        p_VolumeController.startBehavior();
        //#[ configuration DefaultComponent::PanelAnimation 
        //#]
        RiJOXF.Start();
        p_Player=null;
        p_SongNavigationController=null;
        p_VolumeController=null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/MainDefaultComponent.java
*********************************************************************/

