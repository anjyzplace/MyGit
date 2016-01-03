
/**
 * Write a description of class Job here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job
{
    // instance variables - replace the example below with your own
<<<<<<< HEAD
    public int jobID=0;
    Boolean home=true;;
=======
    public int jobID=100;
    public String id; //  ID of staff who picks up the job
    Boolean home;
>>>>>>> origin/master
    public String state = "waiting";
    boolean onSite;
    boolean sHand;
    public String cust;
    public String lang;
    public String staffOnJobID;
    private double charge=0;
    public double cost;
    private double fee =25;
    
    /**
     * Constructor for objects of class Job
     */
    public Job(String cust,boolean onSite, boolean sHand, String lang)
    {
        // initialise instance variables
       
       this.cust = cust;
       this.onSite=onSite;
       this.sHand=sHand;
       this.lang=lang;
<<<<<<< HEAD

       if(sHand==true){
           this.charge = 20;
       
    }
}
    
    public Job(String cust,boolean onSite, boolean sHand)
    {
        // initialise instance variables
       
       this.cust = cust;
       this.onSite=onSite;
       this.sHand=sHand;
       this.lang="English";
       
       if(sHand==true){
           double charge = 20;
       
    }
       
=======
       this.jobID=jobID;
>>>>>>> origin/master
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void jobLocation(Boolean home){
        
        System.out.println("This job will be done at home");
    }
    /**
     * Update Job Status to Ongoing
     */
    public void setAsOngoing(){
        
        state = "ongoing";
        
    }
    
    
     /**
     * Update Job Status to Waiting
     */
    public void setAsWaiting(){
        
        state = "waiting";
       
    }
    
    /**
     * Update Job Status to Done
     */
    public void setAsDone(){
        
        state = "done";
        
    }
    
    
     /**
     * Update Job Status to Done
     */
    public void setAsAvaialble(){
        
        state = "Available";
        
    }
    
<<<<<<< HEAD
    
    /**
     * Get JOb ID
     */
    public int getID(){
        
        return jobID;
    }
    
      /**
     * Get Job language
     */
    public String getLang(){
        
        return lang;
    }
    
      /**
     * Get Job language
     */
    public String getState(){
        
        return state;
    }
    
      /**
     * Get Job charge
     */
    public double getCharge(){
        
        return charge;
    }
    
      /**
     * Get Job Fee
     */
    public double getFee(){
        
        return fee;
    }
    
       /**
     *  Assign Staff
     */
    public void assignStaff(String staffOnJobID){
        
        this.staffOnJobID = staffOnJobID;
    }
    
        /**
     * Get Assigned Staff
     */
    public String getAssignedStaff(){
        
        return staffOnJobID;
    }
    
    /**
     * Get Customer who submitted the job
     */
    public String getCustomer(){
        
        return cust;
    }
    
      /**
     * Get Cost of the job done
     */
    public double getCost(){
        
        return cost;
    }
    
=======
     public int getID(){
        
        System.out.println("This job ID is "+jobID );
        return jobID;
        
    }
    
     public String getStatus(){
        
        System.out.println("This Status of this Job is "+state );
        return state;
        
    }
    
      public void assignJobToStaff( String id){
        //this.jobID=jobID;
        this.id=id;
        state="assigned";
        
        System.out.println("This job is Assigned");
    }
>>>>>>> origin/master
}
