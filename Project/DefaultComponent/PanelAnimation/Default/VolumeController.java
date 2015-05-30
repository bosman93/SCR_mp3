/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: VolumeController
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/Default/VolumeController.java
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
// Default/VolumeController.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class VolumeController 
public class VolumeController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassVolumeController = new AnimClass("Default.VolumeController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int VOL_MAX = 100;		//## attribute VOL_MAX 
    
    protected boolean isMuted = false;		//## attribute isMuted 
    
    protected int temp_volume = 0;		//## attribute temp_volume 
    
    protected int volume = 50;		//## attribute volume 
    
    protected Player itsPlayer;		//## link itsPlayer 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int VolumeWaiting=1;
    public static final int VolumeUp=2;
    public static final int VolumeMute=3;
    public static final int VolumeDn=4;
    public static final int Done=5;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int VolumeController_Timeout_Done_id = 1;		//## ignore 
    
    
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
    public  VolumeController(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassVolumeController.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation mute() 
    public void mute() {
        try {
            animInstance().notifyMethodEntered("mute",
               new ArgData[] {
               });
        
        //#[ operation mute() 
        if (isMuted) {
        	volume = temp_volume;
        	isMuted = false;
        } else {
        	temp_volume = volume;
        	volume = 0;
        	isMuted = true;
        }
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation volumeDn() 
    public void volumeDn() {
        try {
            animInstance().notifyMethodEntered("volumeDn",
               new ArgData[] {
               });
        
        //#[ operation volumeDn() 
        if (volume > 0) {
        	volume--;
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation volumeUp() 
    public void volumeUp() {
        try {
            animInstance().notifyMethodEntered("volumeUp",
               new ArgData[] {
               });
        
        //#[ operation volumeUp() 
        if (volume < VOL_MAX){
        	volume++;
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getVOL_MAX() {
        return VOL_MAX;
    }
    
    //## auto_generated 
    public void setVOL_MAX(int p_VOL_MAX) {
        VOL_MAX = p_VOL_MAX;
    }
    
    //## auto_generated 
    public boolean getIsMuted() {
        return isMuted;
    }
    
    //## auto_generated 
    public void setIsMuted(boolean p_isMuted) {
        try {
        isMuted = p_isMuted;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public int getTemp_volume() {
        return temp_volume;
    }
    
    //## auto_generated 
    public void setTemp_volume(int p_temp_volume) {
        temp_volume = p_temp_volume;
    }
    
    //## auto_generated 
    public int getVolume() {
        return volume;
    }
    
    //## auto_generated 
    public void setVolume(int p_volume) {
        try {
        volume = p_volume;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public Player getItsPlayer() {
        return itsPlayer;
    }
    
    //## auto_generated 
    public void __setItsPlayer(Player p_Player) {
        itsPlayer = p_Player;
        if(p_Player != null)
            {
                animInstance().notifyRelationAdded("itsPlayer", p_Player);
            }
        else
            {
                animInstance().notifyRelationCleared("itsPlayer");
            }
    }
    
    //## auto_generated 
    public void _setItsPlayer(Player p_Player) {
        if(itsPlayer != null)
            {
                itsPlayer.__setItsVolumeController(null);
            }
        __setItsPlayer(p_Player);
    }
    
    //## auto_generated 
    public void setItsPlayer(Player p_Player) {
        if(p_Player != null)
            {
                p_Player._setItsVolumeController(this);
            }
        _setItsPlayer(p_Player);
    }
    
    //## auto_generated 
    public void _clearItsPlayer() {
        animInstance().notifyRelationCleared("itsPlayer");
        itsPlayer = null;
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
            switch (rootState_subState) {
                case VolumeWaiting:
                {
                    VolumeWaiting_add(animStates);
                }
                break;
                case VolumeUp:
                {
                    VolumeUp_add(animStates);
                }
                break;
                case VolumeDn:
                {
                    VolumeDn_add(animStates);
                }
                break;
                case VolumeMute:
                {
                    VolumeMute_add(animStates);
                }
                break;
                case Done:
                {
                    Done_add(animStates);
                }
                break;
                default:
                    break;
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
                case VolumeWaiting:
                {
                    res = VolumeWaiting_takeEvent(id);
                }
                break;
                case VolumeUp:
                {
                    res = VolumeUp_takeEvent(id);
                }
                break;
                case VolumeDn:
                {
                    res = VolumeDn_takeEvent(id);
                }
                break;
                case VolumeMute:
                {
                    res = VolumeMute_takeEvent(id);
                }
                break;
                case Done:
                {
                    res = Done_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void VolumeWaiting_add(AnimStates animStates) {
            animStates.add("ROOT.VolumeWaiting");
        }
        
        //## statechart_method 
        public void VolumeUp_add(AnimStates animStates) {
            animStates.add("ROOT.VolumeUp");
        }
        
        //## statechart_method 
        public void VolumeMute_add(AnimStates animStates) {
            animStates.add("ROOT.VolumeMute");
        }
        
        //## statechart_method 
        public void VolumeDn_add(AnimStates animStates) {
            animStates.add("ROOT.VolumeDn");
        }
        
        //## statechart_method 
        public void Done_add(AnimStates animStates) {
            animStates.add("ROOT.Done");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void VolumeDn_exit() {
            popNullConfig();
            VolumeDnExit();
            animInstance().notifyStateExited("ROOT.VolumeDn");
        }
        
        //## statechart_method 
        public int VolumeUp_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = VolumeUpTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void VolumeWaitingEnter() {
        }
        
        //## statechart_method 
        public void VolumeMute_exit() {
            popNullConfig();
            VolumeMuteExit();
            animInstance().notifyStateExited("ROOT.VolumeMute");
        }
        
        //## statechart_method 
        public void VolumeMuteExit() {
        }
        
        //## statechart_method 
        public int VolumeDnTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            VolumeDn_exit();
            Done_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VolumeUp_entDef() {
            VolumeUp_enter();
        }
        
        //## statechart_method 
        public void VolumeWaiting_exit() {
            VolumeWaitingExit();
            animInstance().notifyStateExited("ROOT.VolumeWaiting");
        }
        
        //## statechart_method 
        public int DoneTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == VolumeController_Timeout_Done_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    Done_exit();
                    VolumeWaiting_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Done_enter() {
            animInstance().notifyStateEntered("ROOT.Done");
            rootState_subState = Done;
            rootState_active = Done;
            DoneEnter();
        }
        
        //## statechart_method 
        public void VolumeDn_enter() {
            animInstance().notifyStateEntered("ROOT.VolumeDn");
            pushNullConfig();
            rootState_subState = VolumeDn;
            rootState_active = VolumeDn;
            VolumeDnEnter();
        }
        
        //## statechart_method 
        public int Done_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = DoneTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void VolumeDnExit() {
        }
        
        //## statechart_method 
        public void VolumeUpEnter() {
            //#[ state VolumeUp.(Entry) 
            volumeUp();
            //#]
        }
        
        //## statechart_method 
        public void VolumeUp_enter() {
            animInstance().notifyStateEntered("ROOT.VolumeUp");
            pushNullConfig();
            rootState_subState = VolumeUp;
            rootState_active = VolumeUp;
            VolumeUpEnter();
        }
        
        //## statechart_method 
        public int VolumeWaiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evVolumeMute.evVolumeMute_Default_id))
                {
                    res = VolumeWaitingTakeevVolumeMute();
                }
            else if(event.isTypeOf(evVolumeDn.evVolumeDn_Default_id))
                {
                    res = VolumeWaitingTakeevVolumeDn();
                }
            else if(event.isTypeOf(evVolumeUp.evVolumeUp_Default_id))
                {
                    res = VolumeWaitingTakeevVolumeUp();
                }
            
            return res;
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
        public void VolumeMute_enter() {
            animInstance().notifyStateEntered("ROOT.VolumeMute");
            pushNullConfig();
            rootState_subState = VolumeMute;
            rootState_active = VolumeMute;
            VolumeMuteEnter();
        }
        
        //## statechart_method 
        public void VolumeMute_entDef() {
            VolumeMute_enter();
        }
        
        //## statechart_method 
        public void VolumeUpExit() {
        }
        
        //## statechart_method 
        public void DoneEnter() {
            //#[ state Done.(Entry) 
            System.out.println("[DEBUG] Current volume: " + volume + "\n");
            //#]
            itsRiJThread.schedTimeout(100, VolumeController_Timeout_Done_id, this, "ROOT.Done");
        }
        
        //## statechart_method 
        public void VolumeUp_exit() {
            popNullConfig();
            VolumeUpExit();
            animInstance().notifyStateExited("ROOT.VolumeUp");
        }
        
        //## statechart_method 
        public void VolumeWaiting_enter() {
            animInstance().notifyStateEntered("ROOT.VolumeWaiting");
            rootState_subState = VolumeWaiting;
            rootState_active = VolumeWaiting;
            VolumeWaitingEnter();
        }
        
        //## statechart_method 
        public void VolumeWaiting_entDef() {
            VolumeWaiting_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            VolumeWaiting_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int VolumeMuteTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            VolumeMute_exit();
            Done_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Done_exit() {
            DoneExit();
            animInstance().notifyStateExited("ROOT.Done");
        }
        
        //## statechart_method 
        public int VolumeMute_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = VolumeMuteTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int VolumeUpTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            VolumeUp_exit();
            Done_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int VolumeWaitingTakeevVolumeMute() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            VolumeWaiting_exit();
            VolumeMute_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int VolumeDn_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = VolumeDnTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void VolumeDnEnter() {
            //#[ state VolumeDn.(Entry) 
            volumeDn();
            //#]
        }
        
        //## statechart_method 
        public int VolumeWaitingTakeevVolumeDn() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            VolumeWaiting_exit();
            VolumeDn_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void Done_entDef() {
            Done_enter();
        }
        
        //## statechart_method 
        public void DoneExit() {
            itsRiJThread.unschedTimeout(VolumeController_Timeout_Done_id, this);
        }
        
        //## statechart_method 
        public void VolumeDn_entDef() {
            VolumeDn_enter();
        }
        
        //## statechart_method 
        public void VolumeMuteEnter() {
            //#[ state VolumeMute.(Entry) 
            mute();
            //#]
        }
        
        //## statechart_method 
        public int VolumeWaitingTakeevVolumeUp() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            VolumeWaiting_exit();
            VolumeUp_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void VolumeWaitingExit() {
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
            return VolumeController.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassVolumeController; 
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
        
        msg.add("volume", volume);
        msg.add("VOL_MAX", VOL_MAX);
        msg.add("temp_volume", temp_volume);
        msg.add("isMuted", isMuted);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsPlayer", false, true, itsPlayer);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(VolumeController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            VolumeController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            VolumeController.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/Default/VolumeController.java
*********************************************************************/

