
/**
 *Abstract Class of Staff
 * 
 * @author 14114580 
 * @version 1.00
 */
public abstract class Staff
{
    // instance variables - replace the example below with your own
    private String id;
    private String name;
    private boolean hOnly;
    private boolean sHand;
    public String status= "Available";
    private String lang;
    public double rate;
    private String email;

    /**
     * Constructor for objects of class Staff
     */
    public Staff(String id,String name)
    {
        // initialise instance variables
        this.id =id;
        this.name=name;
       
    }
    /**
     * Gets the Name of the Staff
     */
    public String getName(){
        
        return name;
    }
    
     public String getID(){
        
        return id;
    }
    public String getStatus(){
        
        return status;
    }
    /**
     * Set the status of the Staff as avaialble
     * 
     */
      public void setAsAvaialble(){
        
        status= "Available";
    }
    /**
     * Set the status of the Staff as "on job"
     */
     public void setAsOnJob(){
        
        status= "on job";
    }
    /**
     * Gets the per hour rate of the Staff as double
     */
    
     public double getRate(){
        
        return rate;
    }
    /**
     * Set email of staff
     * @param email as String
     */
     public void setEmail(String email){
        this.email=email;
    }
    /**
     * Return email of Staff
     */
     public String getEmail(){
        
        return email;
    }


}
