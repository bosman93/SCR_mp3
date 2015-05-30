/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: evUpdateSongTime
//!	Generated Date	: Sat, 30, May 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/evUpdateSongTime.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evUpdateSongTime.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evUpdateSongTime(int,int) 
public class evUpdateSongTime extends RiJEvent implements AnimatedEvent {
    
    public static final int evUpdateSongTime_Default_id = 18616;		//## ignore 
    
    public int minutes;
    public int seconds;
    
    // Constructors
    
    public  evUpdateSongTime() {
        lId = evUpdateSongTime_Default_id;
    }
    public  evUpdateSongTime(int p_minutes, int p_seconds) {
        lId = evUpdateSongTime_Default_id;
        minutes = p_minutes;
        seconds = p_seconds;
    }
    
    public boolean isTypeOf(long id) {
        return (evUpdateSongTime_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evUpdateSongTime");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
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
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("minutes", minutes);
          msg.add("seconds", seconds);
    }
    public String toString() {
          String s="evUpdateSongTime(";      
          s += "minutes=" + AnimInstance.animToString(minutes) + " ";
          s += "seconds=" + AnimInstance.animToString(seconds) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/evUpdateSongTime.java
*********************************************************************/

