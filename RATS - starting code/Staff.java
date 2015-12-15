
/**
 * Write a description of class Staff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Staff
{
    // instance variables - replace the example below with your own
    private String id;
    private String name;
    private boolean hOnly;
    private boolean sHand;
    public String status= "Avaialble";
    private String lang;
    private double rate;

    /**
     * Constructor for objects of class Staff
     */
    public Staff(String id,String name)
    {
        // initialise instance variables
        this.id =id;
        this.name=name;
        System.out.println("Staff created is "+ status);
    }
    
//      public Staff(String id,String name,  boolean hOnly, boolean sHand)
//                                           
//     {
//         // initialise instance variables
//         this.id =id;
//         this.name=name;
//         this.hOnly=hOnly;
//         this.sHand=sHand;
//         
//     }
//     public void addStaff(String id,String name, boolean hOnly, boolean sHand,String lang, double rate)
//     {
//          this.id =id;
//         this.name=name;
//         this.hOnly=hOnly;
//         this.sHand=sHand;
//         this.lang=lang;
//         this.rate=rate;
//         
//         
//     }
    public String getName(){
        
        return name;
    }
    
     public String getID(){
        
        return id;
    }
    public String getStatus(){
        
        return status;
    }


}
