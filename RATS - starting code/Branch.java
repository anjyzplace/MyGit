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
    HashMap<String, Customer> customers;
    HashMap<String, Job> jobs;
    
    // constructor
    public Branch(String location){
    staffs = new HashMap<String, Staff>();
    customers = new HashMap<String, Customer>();
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
        return "Yes";
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
     
     /*
      * * Add Customer
      * **
      * ***
      */
     
    public void addCustomer( String custID,String name){
        Customer cs = new Customer(custID, name);
        customers.put(custID, cs);
        
    } 
    
    public void addCustomer(String custID, String name, int creditLimit ){
        Customer cs = new RegCustomer(custID, name, creditLimit);
        customers.put(custID, cs);
        
    } 
    
    public String addJob( String cust,boolean onSite, boolean sHand, String lang){
        Job jb = new Job( cust, onSite, sHand, lang);
       // Look for Customer
       //if()
        jobs.put( cust, jb);
     return "Yes";                                    
    }
    public String getAllJobs(){
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
    
    
    
    
    
    
}



