/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: evVolumeMute
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/Default/evVolumeMute.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evVolumeMute.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evVolumeMute() 
public class evVolumeMute extends RiJEvent implements AnimatedEvent {
    
    public static final int evVolumeMute_Default_id = 18619;		//## ignore 
    
    
    // Constructors
    
    public  evVolumeMute() {
        lId = evVolumeMute_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evVolumeMute_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evVolumeMute");
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
    }
    public String toString() {
          String s="evVolumeMute(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/Default/evVolumeMute.java
*********************************************************************/

