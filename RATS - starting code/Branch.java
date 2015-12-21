import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;  
/**
 * This class implements the behaviour expected from the RATS
 * system required for 2COM0057 Deferred/Referred Coursework 
 * 2007/8
 * 
 * @author A.A.Marczyk 
 * @version 07/03/08
 */
public class Branch implements Manager
{
    public String location;
    HashMap<String, Staff> staffs; 
    HashMap<Integer, Customer> customers;
    HashMap<String, Job> jobs;
    public int custID=1;
    public int jobID=100;
    
    // constructor
    public Branch(String location){
    staffs = new HashMap<String, Staff>();
    customers = new HashMap<Integer, Customer>();
    jobs = new HashMap<String, Job>();
    this.location = location;
    
    }
    
    public String getBranch(){
        return location;
    }
    
    public String toString(){
    return "Yes";
    
    }
    
    
    public String getAllCustomers(){
        
        // Iterating Using entrySet() and Java iterator  
	      
	      Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
	      while(it.hasNext())
	      {
	    	  Entry<Integer, Customer> entry = it.next();
	    	  System.out.println("Customer: " + entry.getValue().getName().toString() + " is  ID is: " + entry.getValue().getID() );
	    	  
	      }
	      String info = "Complete";
	      return info;
    }
    
    public void addStaff(String id,String name){
        Staff st = new Clerk(id, name);
        staffs.put(id, st);
        
    }
    
    public void addStaff(String id,String name, boolean hOnly, boolean sHand) {
        Staff st = new Typist(id, name, true, true);
        staffs.put(id, st);
       
    }
    
    public void addStaff(String id,String name, boolean hOnly,boolean sHand,String lang, double rate){
        Staff st = new Translator(id, name, hOnly, sHand, lang, rate);
        staffs.put(id, st);
        
    }
    public void setEmail(String id, String email){
    }
    public boolean isStaff(String stfId){
        return true;
    }
    public void removeStaff(String depId){
    }
    
     public String getAllStaff(){
         
         return "Yes";
     }

     
    public void addCustomer( int custID,String name){
        Customer cs = new Customer(custID, name);
        customers.put(custID, cs);
        
    } 
    
    public void addCustomer(int custID, String name, int creditLimit ){
        Customer cs = new RegCustomer(custID, name, creditLimit);
        customers.put(custID, cs);
        
    } 
    
    public Boolean isWithinCreditLimit(String custID){
        
        return true;
        
    }
    
     public String addJob( String cust, boolean onSite, boolean sHand, String lang){
         
          System.out.println("ID for job before addition is " +jobID);
         // If cusomter does not already exist, the customer is added to the database.
         Customer cs = new Customer(custID, cust);
         customers.put(custID, cs);
         
         //If custoemr is not over credit Limt, the job is added to a collection of jobs.
        //         Iterator<Entry<String, Customer>> it = customers.entrySet().iterator(); 
        //         if()
         
         System.out.println("New Customer Created, ID is "+custID+" and Customer Name is "+ cust);
         custID++;
         
         System.out.println("The Next avaialble Customer ID is "+custID);
        Job jb = new Job( cust, onSite, sHand, lang);
      
        
       // Look for Customer
       //if()
        jobs.put( cust, jb);
        jobID++;
        System.out.println("New Job added for Customer "+cust+" with ID " +jobID);
     return "Yes";                                    
    }
    public String getAllJobs(){
        // Iterating Using entrySet() and Java iterator  
	      
	      Iterator<Entry<String, Job>> it = jobs.entrySet().iterator(); 
	      while(it.hasNext())
	      {
	    	  Entry<String, Job> entry = it.next();
	    	  System.out.println("Job ID: " + entry.getValue().getID()+ " is " + entry.getValue().getStatus()  );
	    	  
	      }
        return "Yes";
    }
    public String getJobsWaiting(){
        return "Yes";
    }
    public double getJobCost(int jNo){
        return 0.00;
    }
    public int setJobDone(int jNo, int hours){
        return 1;
    }
    public int checkJobsWaiting(){
                
    return 0;    
    
    }
    /**
     * Iterate through the HashMap of Staff
     * 
     * 
     */
    public void showAllStaff(){
        
        // Iterating Using entrySet() and Java iterator  
	      
	      Iterator<Entry<String, Staff>> it = staffs.entrySet().iterator(); 
	      while(it.hasNext())
	      {
	    	  Entry<String, Staff> entry = it.next();
	    	  System.out.println("Staff: " + entry.getValue().getName().toString() + " is " + entry.getValue().getStatus() + ", ID is: " + entry.getValue().getID() );
	    	  
	      }
        
    }
    
     public void showLimitAllCustomers(){
        
        // Iterating Using entrySet() and Java iterator  
	      
	      Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
	      while(it.hasNext())
	      {
	    	  Entry<Integer, Customer> entry = it.next();
	    	  System.out.println("Customer " + entry.getValue().getName().toString() + " has a Credit Limit of " + entry.getValue().getLimit() + ", ID is: " + entry.getValue().getID() );
	    	  
	      }
        
    }
    /*
     * Assign job to Staff
     */
    public void assignJobToStaff(int jobID, String staffId)
    {
        Job job = jobs.get(jobID);
        job.assignJobToStaff (staffId);
    }
    
    
    
    
    
    
}



