
/**
 * Write a description of class Clerk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clerk extends Staff
{
    // instance variables - replace the example below with your own
    double rate = 8;

    /**
     * Constructor for objects of class Clerk
     */
    public Clerk(String id,String name)
    {
        // initialise instance variables
        super(id, name);
    }
     /**
     * Gets the per hour rate of the Staff as double
     */
    
     public double getRate(){
        
        return rate;
    }

    
}
