/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Player
//!	Generated Date	: Sat, 30, May 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Player.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Player.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Player 
public class Player implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPlayer = new AnimClass("Default.Player",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int minutes = 0;		//## attribute minutes 
    
    protected int seconds = 0;		//## attribute seconds 
    
    protected SongNavigationController itsSongNavigationController;		//## link itsSongNavigationController 
    
    protected VolumeController itsVolumeController;		//## link itsVolumeController 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Active=1;
    public static final int Playing=2;
    public static final int Waiting=3;
    public static final int TimeUpdate=4;
    public static final int sendUpdate=5;
    public static final int Finish=6;
    public static final int Paused=7;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int Active_subState;		//## ignore 
    
    protected int Playing_subState;		//## ignore 
    
    protected int Playing_lastState;		//## ignore 
    
    public static final int Player_Timeout_Waiting_id = 1;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Player(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassPlayer.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getMinutes() {
        return minutes;
    }
    
    //## auto_generated 
    public void setMinutes(int p_minutes) {
        try {
        minutes = p_minutes;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getSeconds() {
        return seconds;
    }
    
    //## auto_generated 
    public void setSeconds(int p_seconds) {
        try {
        seconds = p_seconds;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public SongNavigationController getItsSongNavigationController() {
        return itsSongNavigationController;
    }
    
    //## auto_generated 
    public void __setItsSongNavigationController(SongNavigationController p_SongNavigationController) {
        itsSongNavigationController = p_SongNavigationController;
        if(p_SongNavigationController != null)
            {
                animInstance().notifyRelationAdded("itsSongNavigationController", p_SongNavigationController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSongNavigationController");
            }
    }
    
    //## auto_generated 
    public void _setItsSongNavigationController(SongNavigationController p_SongNavigationController) {
        if(itsSongNavigationController != null)
            {
                itsSongNavigationController.__setItsPlayer(null);
            }
        __setItsSongNavigationController(p_SongNavigationController);
    }
    
    //## auto_generated 
    public void setItsSongNavigationController(SongNavigationController p_SongNavigationController) {
        if(p_SongNavigationController != null)
            {
                p_SongNavigationController._setItsPlayer(this);
            }
        _setItsSongNavigationController(p_SongNavigationController);
    }
    
    //## auto_generated 
    public void _clearItsSongNavigationController() {
        animInstance().notifyRelationCleared("itsSongNavigationController");
        itsSongNavigationController = null;
    }
    
    //## auto_generated 
    public VolumeController getItsVolumeController() {
        return itsVolumeController;
    }
    
    //## auto_generated 
    public void __setItsVolumeController(VolumeController p_VolumeController) {
        itsVolumeController = p_VolumeController;
        if(p_VolumeController != null)
            {
                animInstance().notifyRelationAdded("itsVolumeController", p_VolumeController);
            }
        else
            {
                animInstance().notifyRelationCleared("itsVolumeController");
            }
    }
    
    //## auto_generated 
    public void _setItsVolumeController(VolumeController p_VolumeController) {
        if(itsVolumeController != null)
            {
                itsVolumeController.__setItsPlayer(null);
            }
        __setItsVolumeController(p_VolumeController);
    }
    
    //## auto_generated 
    public void setItsVolumeController(VolumeController p_VolumeController) {
        if(p_VolumeController != null)
            {
                p_VolumeController._setItsPlayer(this);
            }
        _setItsVolumeController(p_VolumeController);
    }
    
    //## auto_generated 
    public void _clearItsVolumeController() {
        animInstance().notifyRelationCleared("itsVolumeController");
        itsVolumeController = null;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(Playing_subState == state)
                {
                    return true;
                }
            if(Active_subState == state)
                {
                    return true;
                }
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            if(rootState_subState == Active)
                {
                    Active_add(animStates);
                }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Paused:
                {
                    res = Paused_takeEvent(id);
                }
                break;
                case Waiting:
                {
                    res = Waiting_takeEvent(id);
                }
                break;
                case TimeUpdate:
                {
                    res = TimeUpdate_takeEvent(id);
                }
                break;
                case Finish:
                {
                    res = Finish_takeEvent(id);
                }
                break;
                case sendUpdate:
                {
                    res = sendUpdate_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Active_add(AnimStates animStates) {
            animStates.add("ROOT.Active");
            switch (Active_subState) {
                case Paused:
                {
                    Paused_add(animStates);
                }
                break;
                case Playing:
                {
                    Playing_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Playing_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Playing");
            switch (Playing_subState) {
                case Waiting:
                {
                    Waiting_add(animStates);
                }
                break;
                case TimeUpdate:
                {
                    TimeUpdate_add(animStates);
                }
                break;
                case Finish:
                {
                    Finish_add(animStates);
                }
                break;
                case sendUpdate:
                {
                    sendUpdate_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Waiting_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Playing.Waiting");
        }
        
        //## statechart_method 
        public void TimeUpdate_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Playing.TimeUpdate");
        }
        
        //## statechart_method 
        public void sendUpdate_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Playing.sendUpdate");
        }
        
        //## statechart_method 
        public void Finish_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Playing.Finish");
        }
        
        //## statechart_method 
        public void Paused_add(AnimStates animStates) {
            animStates.add("ROOT.Active.Paused");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            Active_subState = RiJNonState;
            Playing_subState = RiJNonState;
            Playing_lastState = RiJNonState;
        }
        
        //## statechart_method 
        public int Paused_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPlayPause.evPlayPause_Default_id))
                {
                    res = PausedTakeevPlayPause();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Active_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void FinishEnter() {
        }
        
        //## statechart_method 
        public void sendUpdate_exit() {
            popNullConfig();
            sendUpdateExit();
            animInstance().notifyStateExited("ROOT.Active.Playing.sendUpdate");
        }
        
        //## statechart_method 
        public void Waiting_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Playing.Waiting");
            Playing_subState = Waiting;
            rootState_active = Waiting;
            WaitingEnter();
        }
        
        //## statechart_method 
        public void Active_exit() {
            switch (Active_subState) {
                case Paused:
                {
                    Paused_exit();
                }
                break;
                case Playing:
                {
                    Playing_exit();
                }
                break;
                default:
                    break;
            }
            Active_subState = RiJNonState;
            ActiveExit();
            animInstance().notifyStateExited("ROOT.Active");
        }
        
        //## statechart_method 
        public void Finish_exit() {
            popNullConfig();
            FinishExit();
            animInstance().notifyStateExited("ROOT.Active.Playing.Finish");
        }
        
        //## statechart_method 
        public void PausedEnter() {
        }
        
        //## statechart_method 
        public void sendUpdate_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Playing.sendUpdate");
            pushNullConfig();
            Playing_subState = sendUpdate;
            rootState_active = sendUpdate;
            sendUpdateEnter();
        }
        
        //## statechart_method 
        public void TimeUpdate_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Playing.TimeUpdate");
            pushNullConfig();
            Playing_subState = TimeUpdate;
            rootState_active = TimeUpdate;
            TimeUpdateEnter();
        }
        
        //## statechart_method 
        public int PlayingTakeevPlayPause() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            Playing_exit();
            Paused_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sendUpdateExit() {
        }
        
        //## statechart_method 
        public int TimeUpdate_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = TimeUpdateTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Playing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int TimeUpdateTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            TimeUpdate_exit();
            sendUpdate_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public void PlayingEntHist() {
            if(Playing_lastState == RiJNonState)
                {
                    animInstance().notifyTransitionStarted("1");
                    Waiting_entDef();
                    animInstance().notifyTransitionEnded("1");
                }
            else
                {
                    Playing_subState = Playing_lastState;
                    switch (Playing_subState) {
                        case Waiting:
                        {
                            Waiting_enter();
                        }
                        break;
                        case TimeUpdate:
                        {
                            TimeUpdate_enter();
                        }
                        break;
                        case Finish:
                        {
                            Finish_enter();
                        }
                        break;
                        case sendUpdate:
                        {
                            sendUpdate_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public void TimeUpdate_entDef() {
            TimeUpdate_enter();
        }
        
        //## statechart_method 
        public void ActiveExit() {
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Paused_exit() {
            PausedExit();
            animInstance().notifyStateExited("ROOT.Active.Paused");
        }
        
        //## statechart_method 
        public int sendUpdate_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = sendUpdateTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Playing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Player_Timeout_Waiting_id)
                {
                    animInstance().notifyTransitionStarted("2");
                    Waiting_exit();
                    TimeUpdate_entDef();
                    animInstance().notifyTransitionEnded("2");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Finish_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Playing.Finish");
            pushNullConfig();
            Playing_subState = Finish;
            rootState_active = Finish;
            FinishEnter();
        }
        
        //## statechart_method 
        public void WaitingEnter() {
            itsRiJThread.schedTimeout(1000, Player_Timeout_Waiting_id, this, "ROOT.Active.Playing.Waiting");
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int Waiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = WaitingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Playing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void PlayingEnter() {
        }
        
        //## statechart_method 
        public int Finish_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = FinishTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Playing_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void TimeUpdateExit() {
        }
        
        //## statechart_method 
        public void Playing_entHist() {
            PlayingEntHist();
        }
        
        //## statechart_method 
        public int Active_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Finish_entDef() {
            Finish_enter();
        }
        
        //## statechart_method 
        public void Waiting_exit() {
            WaitingExit();
            animInstance().notifyStateExited("ROOT.Active.Playing.Waiting");
        }
        
        //## statechart_method 
        public int Playing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPlayPause.evPlayPause_Default_id))
                {
                    res = PlayingTakeevPlayPause();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Active_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void Active_entDef() {
            Active_enter();
            
            animInstance().notifyTransitionStarted("0");
            Paused_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("4");
            Active_entDef();
            animInstance().notifyTransitionEnded("4");
        }
        
        //## statechart_method 
        public void Paused_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Paused");
            Active_subState = Paused;
            rootState_active = Paused;
            PausedEnter();
        }
        
        //## statechart_method 
        public void sendUpdate_entDef() {
            sendUpdate_enter();
        }
        
        //## statechart_method 
        public void TimeUpdateEnter() {
            //#[ state Active.Playing.TimeUpdate.(Entry) 
            seconds++;
            if(seconds >= 60) {
            	seconds = 0;
            	minutes++;
            }
            //#]
        }
        
        //## statechart_method 
        public void Playing_exit() {
            Playing_lastState = Playing_subState;
            switch (Playing_subState) {
                case Waiting:
                {
                    Waiting_exit();
                    Playing_lastState = Waiting;
                }
                break;
                case TimeUpdate:
                {
                    TimeUpdate_exit();
                    Playing_lastState = TimeUpdate;
                }
                break;
                case Finish:
                {
                    Finish_exit();
                    Playing_lastState = Finish;
                }
                break;
                case sendUpdate:
                {
                    sendUpdate_exit();
                    Playing_lastState = sendUpdate;
                }
                break;
                default:
                    break;
            }
            Playing_subState = RiJNonState;
            PlayingExit();
            animInstance().notifyStateExited("ROOT.Active.Playing");
        }
        
        //## statechart_method 
        public void Active_enter() {
            animInstance().notifyStateEntered("ROOT.Active");
            rootState_subState = Active;
            ActiveEnter();
        }
        
        //## statechart_method 
        public void FinishExit() {
        }
        
        //## statechart_method 
        public void PlayingExit() {
        }
        
        //## statechart_method 
        public void Paused_entDef() {
            Paused_enter();
        }
        
        //## statechart_method 
        public int FinishTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Finish_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void sendUpdateEnter() {
            //#[ state Active.Playing.sendUpdate.(Entry) 
            gen(new Default.evUpdateSongTime(minutes,seconds));
            //#]
        }
        
        //## statechart_method 
        public void WaitingExit() {
            itsRiJThread.unschedTimeout(Player_Timeout_Waiting_id, this);
        }
        
        //## statechart_method 
        public void Playing_entDef() {
            Playing_enter();
            
            animInstance().notifyTransitionStarted("5");
            Waiting_entDef();
            animInstance().notifyTransitionEnded("5");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int PausedTakeevPlayPause() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Paused_exit();
            Playing_enter();
            Playing_entHist();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void PausedExit() {
        }
        
        //## statechart_method 
        public void TimeUpdate_exit() {
            popNullConfig();
            TimeUpdateExit();
            animInstance().notifyStateExited("ROOT.Active.Playing.TimeUpdate");
        }
        
        //## statechart_method 
        public int sendUpdateTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            sendUpdate_exit();
            Finish_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Playing_enter() {
            animInstance().notifyStateEntered("ROOT.Active.Playing");
            Active_subState = Playing;
            PlayingEnter();
        }
        
        //## statechart_method 
        public void ActiveEnter() {
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Player.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPlayer; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("seconds", seconds);
        msg.add("minutes", minutes);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsVolumeController", false, true, itsVolumeController);
        msg.add("itsSongNavigationController", false, true, itsSongNavigationController);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Player.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Player.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Player.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Player.java
*********************************************************************/

