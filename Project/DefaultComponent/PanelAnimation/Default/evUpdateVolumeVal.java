/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: Mariusz
	Component	: DefaultComponent
	Configuration 	: PanelAnimation
	Model Element	: evUpdateVolumeVal
//!	Generated Date	: Sun, 31, May 2015 
	File Path	: DefaultComponent/PanelAnimation/Default/evUpdateVolumeVal.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evUpdateVolumeVal.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evUpdateVolumeVal(int) 
public class evUpdateVolumeVal extends RiJEvent implements AnimatedEvent {
    
    public static final int evUpdateVolumeVal_Default_id = 18625;		//## ignore 
    
    public int p_volume;
    
    // Constructors
    
    public  evUpdateVolumeVal() {
        lId = evUpdateVolumeVal_Default_id;
    }
    public  evUpdateVolumeVal(int p_p_volume) {
        lId = evUpdateVolumeVal_Default_id;
        p_volume = p_p_volume;
    }
    
    public boolean isTypeOf(long id) {
        return (evUpdateVolumeVal_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evUpdateVolumeVal");
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
          msg.add("p_volume", p_volume);
    }
    public String toString() {
          String s="evUpdateVolumeVal(";      
          s += "p_volume=" + AnimInstance.animToString(p_volume) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/PanelAnimation/Default/evUpdateVolumeVal.java
*********************************************************************/

