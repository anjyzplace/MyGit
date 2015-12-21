
/**
 * Write a description of class Job here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job
{
    // instance variables - replace the example below with your own
    public int jobID=100;
    public String id; //  ID of staff who picks up the job
    Boolean home;
    public String state = "waiting";
    boolean onSite;
    boolean sHand;
    public String cust;
    public String lang;
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
       this.jobID=jobID;
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
        System.out.println("This job is Ongoing");
    }
    
    /**
     * Update Job Status to Ongoing
     */
    public void setAsDone(){
        
        state = "done";
        System.out.println("This job is Completed");
    }
    
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
}
