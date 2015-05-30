/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: evNextBtnReleased
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/Default/evNextBtnReleased.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evNextBtnReleased.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evNextBtnReleased() 
public class evNextBtnReleased extends RiJEvent implements AnimatedEvent {
    
    public static final int evNextBtnReleased_Default_id = 18624;		//## ignore 
    
    
    // Constructors
    
    public  evNextBtnReleased() {
        lId = evNextBtnReleased_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evNextBtnReleased_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evNextBtnReleased");
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
          String s="evNextBtnReleased(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/Default/evNextBtnReleased.java
*********************************************************************/

