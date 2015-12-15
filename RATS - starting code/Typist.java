
/**
 * Write a description of class StaffTypist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Typist extends Staff
{
    // instance variables - replace the example below with your own
    private boolean hOnly;
    private boolean sHand;

    /**
     * Constructor for objects of class StaffTypist
     */
   
    public Typist(String id,String name,  boolean hOnly, boolean sHand)
    {
        // initialise instance variables
        super ( id, name);
        this.hOnly=hOnly;
        this.sHand=sHand;
    }

    
    
}
