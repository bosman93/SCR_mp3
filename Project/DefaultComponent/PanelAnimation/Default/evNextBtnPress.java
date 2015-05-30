/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: evNextBtnPress
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/Default/evNextBtnPress.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evNextBtnPress.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evNextBtnPress() 
public class evNextBtnPress extends RiJEvent implements AnimatedEvent {
    
    public static final int evNextBtnPress_Default_id = 18622;		//## ignore 
    
    
    // Constructors
    
    public  evNextBtnPress() {
        lId = evNextBtnPress_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evNextBtnPress_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evNextBtnPress");
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
          String s="evNextBtnPress(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/Default/evNextBtnPress.java
*********************************************************************/

