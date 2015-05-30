/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: SongNavigationController
//!	Generated Date	: Sat, 30, May 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/SongNavigationController.java
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
// Default/SongNavigationController.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class SongNavigationController 
public class SongNavigationController implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSongNavigationController = new AnimClass("Default.SongNavigationController",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int rewindDirection = 1;		//## attribute rewindDirection 
    
    protected final int rewindInterval = 1000;		//## attribute rewindInterval 
    
    protected final int rewindMinStartTime = 2000;		//## attribute rewindMinStartTime 
    
    protected int rewindStep = 10000;		//## attribute rewindStep 
    
    protected Player itsPlayer;		//## link itsPlayer 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Waiting=1;
    public static final int SettingForward=2;
    public static final int SettingBackward=3;
    public static final int SavingTimestamp2=4;
    public static final int SavingTimestamp1=5;
    public static final int Rewinding=6;
    public static final int ChangingSong=7;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int SongNavigationController_Timeout_SavingTimestamp1_id = 1;		//## ignore 
    
    public static final int SongNavigationController_Timeout_Rewinding_id = 2;		//## ignore 
    
    
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
    public  SongNavigationController(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSongNavigationController.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getRewindDirection() {
        return rewindDirection;
    }
    
    //## auto_generated 
    public void setRewindDirection(int p_rewindDirection) {
        rewindDirection = p_rewindDirection;
    }
    
    //## auto_generated 
    public final int getRewindInterval() {
        return rewindInterval;
    }
    
    //## auto_generated 
    public final int getRewindMinStartTime() {
        return rewindMinStartTime;
    }
    
    //## auto_generated 
    public int getRewindStep() {
        return rewindStep;
    }
    
    //## auto_generated 
    public void setRewindStep(int p_rewindStep) {
        rewindStep = p_rewindStep;
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
                itsPlayer.__setItsSongNavigationController(null);
            }
        __setItsPlayer(p_Player);
    }
    
    //## auto_generated 
    public void setItsPlayer(Player p_Player) {
        if(p_Player != null)
            {
                p_Player._setItsSongNavigationController(this);
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
                case Waiting:
                {
                    Waiting_add(animStates);
                }
                break;
                case SavingTimestamp1:
                {
                    SavingTimestamp1_add(animStates);
                }
                break;
                case SettingBackward:
                {
                    SettingBackward_add(animStates);
                }
                break;
                case SettingForward:
                {
                    SettingForward_add(animStates);
                }
                break;
                case SavingTimestamp2:
                {
                    SavingTimestamp2_add(animStates);
                }
                break;
                case ChangingSong:
                {
                    ChangingSong_add(animStates);
                }
                break;
                case Rewinding:
                {
                    Rewinding_add(animStates);
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
                case Waiting:
                {
                    res = Waiting_takeEvent(id);
                }
                break;
                case SavingTimestamp1:
                {
                    res = SavingTimestamp1_takeEvent(id);
                }
                break;
                case SettingBackward:
                {
                    res = SettingBackward_takeEvent(id);
                }
                break;
                case SettingForward:
                {
                    res = SettingForward_takeEvent(id);
                }
                break;
                case SavingTimestamp2:
                {
                    res = SavingTimestamp2_takeEvent(id);
                }
                break;
                case ChangingSong:
                {
                    res = ChangingSong_takeEvent(id);
                }
                break;
                case Rewinding:
                {
                    res = Rewinding_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Waiting_add(AnimStates animStates) {
            animStates.add("ROOT.Waiting");
        }
        
        //## statechart_method 
        public void SettingForward_add(AnimStates animStates) {
            animStates.add("ROOT.SettingForward");
        }
        
        //## statechart_method 
        public void SettingBackward_add(AnimStates animStates) {
            animStates.add("ROOT.SettingBackward");
        }
        
        //## statechart_method 
        public void SavingTimestamp2_add(AnimStates animStates) {
            animStates.add("ROOT.SavingTimestamp2");
        }
        
        //## statechart_method 
        public void SavingTimestamp1_add(AnimStates animStates) {
            animStates.add("ROOT.SavingTimestamp1");
        }
        
        //## statechart_method 
        public void Rewinding_add(AnimStates animStates) {
            animStates.add("ROOT.Rewinding");
        }
        
        //## statechart_method 
        public void ChangingSong_add(AnimStates animStates) {
            animStates.add("ROOT.ChangingSong");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void ChangingSongEnter() {
        }
        
        //## statechart_method 
        public void SavingTimestamp1_exit() {
            SavingTimestamp1Exit();
            animInstance().notifyStateExited("ROOT.SavingTimestamp1");
        }
        
        //## statechart_method 
        public void SettingForward_enter() {
            animInstance().notifyStateEntered("ROOT.SettingForward");
            pushNullConfig();
            rootState_subState = SettingForward;
            rootState_active = SettingForward;
            SettingForwardEnter();
        }
        
        //## statechart_method 
        public void RewindingExit() {
            itsRiJThread.unschedTimeout(SongNavigationController_Timeout_Rewinding_id, this);
        }
        
        //## statechart_method 
        public void SavingTimestamp1Exit() {
            itsRiJThread.unschedTimeout(SongNavigationController_Timeout_SavingTimestamp1_id, this);
        }
        
        //## statechart_method 
        public void SavingTimestamp1_enter() {
            animInstance().notifyStateEntered("ROOT.SavingTimestamp1");
            rootState_subState = SavingTimestamp1;
            rootState_active = SavingTimestamp1;
            SavingTimestamp1Enter();
        }
        
        //## statechart_method 
        public void SavingTimestamp2_enter() {
            animInstance().notifyStateEntered("ROOT.SavingTimestamp2");
            pushNullConfig();
            rootState_subState = SavingTimestamp2;
            rootState_active = SavingTimestamp2;
            SavingTimestamp2Enter();
        }
        
        //## statechart_method 
        public void SettingBackward_exit() {
            popNullConfig();
            SettingBackwardExit();
            animInstance().notifyStateExited("ROOT.SettingBackward");
        }
        
        //## statechart_method 
        public int RewindingTakeevNextBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            Rewinding_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp1TakeevPrevBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            SavingTimestamp1_exit();
            ChangingSong_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void SavingTimestamp2Exit() {
        }
        
        //## statechart_method 
        public int SettingForward_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = SettingForwardTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void SettingForward_entDef() {
            SettingForward_enter();
        }
        
        //## statechart_method 
        public void Waiting_enter() {
            animInstance().notifyStateEntered("ROOT.Waiting");
            rootState_subState = Waiting;
            rootState_active = Waiting;
            WaitingEnter();
        }
        
        //## statechart_method 
        public void ChangingSong_exit() {
            ChangingSongExit();
            animInstance().notifyStateExited("ROOT.ChangingSong");
        }
        
        //## statechart_method 
        public void RewindingEnter() {
            itsRiJThread.schedTimeout(rewindInterval, SongNavigationController_Timeout_Rewinding_id, this, "ROOT.Rewinding");
        }
        
        //## statechart_method 
        public int SettingBackwardTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            SettingBackward_exit();
            SavingTimestamp1_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            SavingTimestamp2_exit();
            Rewinding_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void SavingTimestamp2_entDef() {
            SavingTimestamp2_enter();
        }
        
        //## statechart_method 
        public int SettingForwardTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            SettingForward_exit();
            SavingTimestamp1_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPrevBtnReleased.evPrevBtnReleased_Default_id))
                {
                    res = SavingTimestamp2TakeevPrevBtnReleased();
                }
            else if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = SavingTimestamp2TakeNull();
                }
            else if(event.isTypeOf(evNextBtnReleased.evNextBtnReleased_Default_id))
                {
                    res = SavingTimestamp2TakeevNextBtnReleased();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int WaitingTakeevPrevBtnPress() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            Waiting_exit();
            SettingBackward_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Waiting_entDef() {
            Waiting_enter();
        }
        
        //## statechart_method 
        public void Rewinding_exit() {
            RewindingExit();
            animInstance().notifyStateExited("ROOT.Rewinding");
        }
        
        //## statechart_method 
        public int SavingTimestamp1TakeevNextBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            SavingTimestamp1_exit();
            ChangingSong_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int ChangingSong_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp1TakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == SongNavigationController_Timeout_SavingTimestamp1_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    SavingTimestamp1_exit();
                    SavingTimestamp2_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void WaitingEnter() {
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
        public int Rewinding_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPrevBtnReleased.evPrevBtnReleased_Default_id))
                {
                    res = RewindingTakeevPrevBtnReleased();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = RewindingTakeRiJTimeout();
                }
            else if(event.isTypeOf(evNextBtnReleased.evNextBtnReleased_Default_id))
                {
                    res = RewindingTakeevNextBtnReleased();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void SettingForwardEnter() {
            //#[ state SettingForward.(Entry) 
            rewindDirection = 1;
            //#]
        }
        
        //## statechart_method 
        public int Waiting_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPrevBtnPress.evPrevBtnPress_Default_id))
                {
                    res = WaitingTakeevPrevBtnPress();
                }
            else if(event.isTypeOf(evNextBtnPress.evNextBtnPress_Default_id))
                {
                    res = WaitingTakeevNextBtnPress();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evPrevBtnReleased.evPrevBtnReleased_Default_id))
                {
                    res = SavingTimestamp1TakeevPrevBtnReleased();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = SavingTimestamp1TakeRiJTimeout();
                }
            else if(event.isTypeOf(evNextBtnReleased.evNextBtnReleased_Default_id))
                {
                    res = SavingTimestamp1TakeevNextBtnReleased();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void SettingForwardExit() {
        }
        
        //## statechart_method 
        public void SettingBackwardExit() {
        }
        
        //## statechart_method 
        public void Waiting_exit() {
            WaitingExit();
            animInstance().notifyStateExited("ROOT.Waiting");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Waiting_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void ChangingSongExit() {
        }
        
        //## statechart_method 
        public void Rewinding_enter() {
            animInstance().notifyStateEntered("ROOT.Rewinding");
            rootState_subState = Rewinding;
            rootState_active = Rewinding;
            RewindingEnter();
        }
        
        //## statechart_method 
        public int SavingTimestamp2TakeevPrevBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            SavingTimestamp2_exit();
            ChangingSong_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void SettingBackward_enter() {
            animInstance().notifyStateEntered("ROOT.SettingBackward");
            pushNullConfig();
            rootState_subState = SettingBackward;
            rootState_active = SettingBackward;
            SettingBackwardEnter();
        }
        
        //## statechart_method 
        public void SettingBackward_entDef() {
            SettingBackward_enter();
        }
        
        //## statechart_method 
        public void SettingForward_exit() {
            popNullConfig();
            SettingForwardExit();
            animInstance().notifyStateExited("ROOT.SettingForward");
        }
        
        //## statechart_method 
        public int RewindingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == SongNavigationController_Timeout_Rewinding_id)
                {
                    animInstance().notifyTransitionStarted("11");
                    Rewinding_exit();
                    Rewinding_entDef();
                    animInstance().notifyTransitionEnded("11");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void SavingTimestamp2Enter() {
        }
        
        //## statechart_method 
        public void Rewinding_entDef() {
            Rewinding_enter();
        }
        
        //## statechart_method 
        public void SavingTimestamp1Enter() {
            itsRiJThread.schedTimeout(rewindMinStartTime, SongNavigationController_Timeout_SavingTimestamp1_id, this, "ROOT.SavingTimestamp1");
        }
        
        //## statechart_method 
        public void WaitingExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void ChangingSong_enter() {
            animInstance().notifyStateEntered("ROOT.ChangingSong");
            rootState_subState = ChangingSong;
            rootState_active = ChangingSong;
            ChangingSongEnter();
        }
        
        //## statechart_method 
        public void ChangingSong_entDef() {
            ChangingSong_enter();
        }
        
        //## statechart_method 
        public void SavingTimestamp1_entDef() {
            SavingTimestamp1_enter();
        }
        
        //## statechart_method 
        public int SettingBackward_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = SettingBackwardTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void SettingBackwardEnter() {
            //#[ state SettingBackward.(Entry) 
            rewindDirection = -1;
            //#]
        }
        
        //## statechart_method 
        public int RewindingTakeevPrevBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            Rewinding_exit();
            Waiting_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int SavingTimestamp2TakeevNextBtnReleased() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            SavingTimestamp2_exit();
            ChangingSong_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void SavingTimestamp2_exit() {
            popNullConfig();
            SavingTimestamp2Exit();
            animInstance().notifyStateExited("ROOT.SavingTimestamp2");
        }
        
        //## statechart_method 
        public int WaitingTakeevNextBtnPress() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Waiting_exit();
            SettingForward_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            return SongNavigationController.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSongNavigationController; 
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
        
        msg.add("rewindMinStartTime", rewindMinStartTime);
        msg.add("rewindInterval", rewindInterval);
        msg.add("rewindDirection", rewindDirection);
        msg.add("rewindStep", rewindStep);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsPlayer", false, true, itsPlayer);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(SongNavigationController.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SongNavigationController.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SongNavigationController.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/SongNavigationController.java
*********************************************************************/

