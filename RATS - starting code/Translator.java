
/**
 * Write a description of class Translator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Translator extends Staff
{
    // instance variables - replace the example below with your own
    private boolean hOnly;
    private boolean sHand;
    private String lang;
    private double rate;
    /**
     * Constructor for objects of class Translator
     */
    public Translator(String id,String name, boolean hOnly,boolean sHand,String lang, double rate) 
    {
        // initialise instance variables
        super (id, name);
         this.hOnly=hOnly;
        this.sHand=sHand;
        this.lang=lang;
        this.rate =rate;
    }

    
}
