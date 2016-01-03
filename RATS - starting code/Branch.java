import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;  

/**
 * This class implements the Manager Interface 
 * 
 * 
 * @author 14114580 
 * @version 1.00
 */
public class Branch implements Manager
{
    public String location;
    HashMap<String, Staff> staffs; 
    HashMap<Integer, Customer> customers;
<<<<<<< HEAD
    HashMap<Integer, Job> jobs;
    public static int custID=1;
    public  static  int valjobID=100;
    private Customer customer;

    // constructor
    public Branch(String location){

        staffs = new HashMap<String, Staff>();
        customers = new HashMap<Integer, Customer>();
        jobs = new HashMap<Integer, Job>();
        this.location = location;

    }

    /**Returns the location of the branch as a String
     * @return the location of the branch as a String
     **/
=======
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
    
>>>>>>> origin/master
    public String getBranch(){

        return location;
    }

    /**Returns a String representation of the branch,including
     * its location and all its staff,customers and jobs
     * @return a String representation of the branch,including
     * its location and all its staff,customers and jobs
     **/
    public String toString(){

        String data;
        data = "THIS BRANCH IS "+ getBranch() + "\n\n" +
        "***********The Staff***********" + "\n" + 
        getAllStaff() + "\n"  + "\n" + 
        "***********The Customers***********" + "\n" + 
        getAllCustomers() + "\n" + "\n" +
        "***********The Jobs***********" + "\n" + 
        getAllJobs() + "\n" + "\n" +
        "";

        return data;

    }

    /**Returns a String representation of customers who have used the 
     * branch's services
     * @return a String representation of the customers who have used 
     * the branch's services 
     **/

    public String getAllCustomers(){
<<<<<<< HEAD
        StringBuilder builder = new StringBuilder();
        // Iterating Using entrySet() and Java iterator  

        Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
        while(it.hasNext())
        {

            Entry<Integer, Customer> entry = it.next();
            String name = entry.getValue().getName();
            int id = entry.getValue().getID(); 
            String numberAsString = Integer.toString(id);

            
            builder.append("CUSTOMER: "+ name+", has ID: "+ numberAsString +"\n");
            

        }
        return builder.toString();
=======
        
        // Iterating Using entrySet() and Java iterator  
	      
	      Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
	      while(it.hasNext())
	      {
	    	  Entry<Integer, Customer> entry = it.next();
	    	  System.out.println("Customer: " + entry.getValue().getName().toString() + " is  ID is: " + entry.getValue().getID() );
	    	  
	      }
	      String info = "Complete";
	      return info;
>>>>>>> origin/master
    }

    /** Allows a clerk to be added to the branch.The clerk's availability
     *  is set to "available"
     * @param id represents the employee code of the staff e.g TY333
     * @param name is the staff member's name 
     **/   
    public void addStaff(String id,String name){
        Staff st = new Clerk(id, name);
        staffs.put(id, st);

    }

    /**Allows a typist to be added to a branch.The typist's availability
     *  is set to "available".Staff must specify if they can only work at 
     *  home.If false, then staff can work on site or at home if required
     * @param id represents the employee code of the staff e.g TY333
     * @param name is the staff member's name 
     * @param hOnly true if a member of staff can only work at home,
     * fals if they can only work at home
     * @param sHand true if a member of staff can offer shorthand
     **/ 
    public void addStaff(String id,String name, boolean hOnly, boolean sHand) {
        Staff st = new Typist(id, name, true, true);
        staffs.put(id, st);

    }

    /** Allows a translator to be added to the branch.The translator's 
     *  availability is set to "available".Staff must specify if they 
     *  can only work at home.If false, then staff can work on site or 
     *  at home if required.
     * @param id represents the employee code of the staff e.g TY333
     * @param name is the staff member's name 
     * @param hOnly true if a member of staff can work on site, false 
     * if they can only work at home
     * @param sHand true if a member of staff can offer shorthand
     * @param lang is the language which the staff member can translate
     * @param rate is the hourly rate
     **/    

    public void addStaff(String id,String name, boolean hOnly,boolean sHand,String lang, double rate){
        Staff st = new Translator(id, name, hOnly, sHand, lang, rate);
        staffs.put(id, st);

    }

    /** Sets email for a typist
     * @param id represents the staff id
     * @param email is the email address
     */ 
    public void setEmail(String id, String email){
        Staff st = staffs.get(id);
        st.setEmail(email);
        staffs.put(id, st);

    }

    /** Returns true if the staff with the staff identifier 
     * can be found in the system, false otherwise.
     * @param stfId represents the staff identifier 
     * @return returns true if the staff with the staff identifier 
     * can be found, false otherwise.
     **/
    public boolean isStaff(String stfId){
        try {
            Iterator<Entry<String, Staff>> it = staffs.entrySet().iterator(); 

            while(it.hasNext())
            {

                Entry<String, Staff> entry = it.next();

                if(entry.getValue().getID().equals(stfId) ){

                    return true ;
                }
            }

        } catch (NoSuchElementException nse) {

            return false ;

        }

        return false;
    }

    /** Removes a staff from the branch.
     * pre-condition: isStaff(depId)
     * @param stfId represents the staff identifier 
     **/
    public void removeStaff(String depId){

        staffs.remove(depId);
    }
<<<<<<< HEAD

    /** Returns a String representation of all the staffs  
     * @return returns a String representation of all staffs 
     **/

    public String getAllStaff(){

        StringBuilder builder = new StringBuilder();
        // Iterating Using entrySet() and Java iterator  

        Iterator<Entry<String, Staff>> it = staffs.entrySet().iterator(); 
        while(it.hasNext())
        {
            Entry<String, Staff> entry = it.next();
            builder.append("STAFF: "+ entry.getValue().getName().toString()+", with ID: "+ entry.getValue().getID() +", with Email: "+ entry.getValue().getEmail() +", State: "+ entry.getValue().getStatus()+"\n");

        }
        return builder.toString();
    }

    /**
     * * Add Customer with Constructor 1
     * **
     * ***
     */

=======
    
     public String getAllStaff(){
         
         return "Yes";
     }

     
>>>>>>> origin/master
    public void addCustomer( int custID,String name){
        Customer cs = new Customer(custID, name);
        customers.put(custID, cs);
        custID++;

    } 
<<<<<<< HEAD

    /**
     * * Add Customer with credit Limit constructor
     * **
     * ***
     */

    public void addCustomer(int custID, String name, int creditLimit ){

=======
    
    public void addCustomer(int custID, String name, int creditLimit ){
>>>>>>> origin/master
        Customer cs = new RegCustomer(custID, name, creditLimit);
        customers.put(custID, cs);
        custID++;

    } 

    /** Finds the customer and if the customer is not in the system,
     *  adds the customer.If the customer is over their credit limit, 
     *  "Customer over credit limit is returned and the job is not 
     *  accepted.If the job is accepted it gets a number sequentially 
     *  from 100.If a suitable staff member is available,the state of 
     *  the job is set to "on going",the selected staff member is added
     *  to the job and the staff's set to "on job".If a staff member is
     *  not available,the job's state is state is set to "waiting".If 
     *  suitable staff cannot be found,"Job waiting" is returned, else
     *  "Staff allocated:" together with the staff details.
     * @param cust is the name of the customer
     * @param onSite true if job is on customer's site, false if 
     *      required to work at home
     * @param sHand true if shorthand is required, false otherwise
     * @param lang should the "English" if no translation required, 
     *      otherwise the name of the language
     * @return returns"Customer over credit limit", or if the job is 
     * possible,the job number with either "Job waiting" if no staff is
     * available, or "staff allocated:" together with the staff details
     **/ 
    public String addJob( String cust, boolean onSite, boolean sHand, String lang){

        //Search for Customer adding the Job
        String search = newsearch(cust);

        //Check if Customer is a regular Customer
        String regular = isRegular(cust);

        //Check if Customer is Within Limit
        String withinLimit = isWithinLimit(cust);

        //Add Customer if Customer has  not been added.
        if(search.equals("Not Found")){
            addCustomer(custID, cust);
            custID++;
            withinLimit = "Yes";

        } 
       
        //Assing Job ID and assing Job to Staff 
        if (withinLimit.equals("Yes")){
       

            // Adds Job
            Job jb = new Job(cust, onSite, sHand, lang);
            jb.jobID=valjobID;
            jobs.put(valjobID, jb);
      

            // Select the next avaialble staff
            String idnext = nextAvaialbleStaff();

            if(idnext==null){
                Job jb2= jobs.get(valjobID);
                jb2.setAsWaiting();
                int jbID=jb2.getID();
                valjobID++;
                return "Job waiting"; 
                
            }else {
                Job jb2= jobs.get(valjobID);

                jb2.setAsOngoing();
                jb2.assignStaff(idnext);
                jobs.put(valjobID, jb2);

                Staff st = staffs.get(idnext);

                //Change status of the Staff
                st.status="On Job";
                valjobID++;
                return "staff allocated:"; 
               
                

            }
        } else {
            return "Customer over credit limit"; 
        }
        
           }

    
<<<<<<< HEAD
    /**
     *  Display all jobs
     */

    public String getAllJobs(){
        StringBuilder builder = new StringBuilder();
        // Iterating Using entrySet() and Java iterator  
        String allJobs="null";
        Iterator<Entry<Integer, Job>> it = jobs.entrySet().iterator(); 
        while(it.hasNext())
        {

            Entry<Integer, Job> entry = it.next();

            builder.append("Job:  ID "+ entry.getValue().jobID+" from "+ entry.getValue().getCustomer() +" requiring "+ entry.getValue().getLang()  +" Language, has been allocated to StaffID: "+ entry.getValue().getAssignedStaff() +"\n");
        }

        return builder.toString();
=======
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
>>>>>>> origin/master
    }

    public String getJobsWaiting(){
        StringBuilder builder = new StringBuilder();

        // Iterating Using entrySet() and Java iterator  

        Iterator<Entry<Integer, Job>> it = jobs.entrySet().iterator(); 
        while(it.hasNext())
        {

            Entry<Integer, Job> entry = it.next();
            String status = entry.getValue().getState();
            if(status.equals("waiting")){
                builder.append("JobID: "+ entry.getValue().jobID+" requiring "+ entry.getValue().getLang() +" is waiting "+"\n");

            }

        }

        return builder.toString();
    }

    /***
     * Check the cost of a job
     * @Param JobID
     * @Return Double value of Job Cost
     * 
     */

    public double getJobCost(int jNo){

        Job jb = jobs.get(jNo);
        String state = jb.getState();

        if (state.equals("done")){
            double cost =jb.getCost();
            return cost;

        }else{

            return 0.00;
        }

    }
    //  return -1;

    /**
     * Set Job as done
     * @Param job ID
     * @Param hours
     * @return 0 or -1
     */
    public int setJobDone(int jNo, int hours){

         
        Job jb = jobs.get(jNo);
        String state = jb.getState();

        if (state.equals("ongoing")){
            jb.setAsDone();
            String staffid = jb.getAssignedStaff();
            Staff st = staffs.get(staffid);

            st.setAsAvaialble();
            double rate = st.getRate();

            double charge = jb.getCharge();

            double fee =jb.getFee();

            double cost = (rate*hours)+fee+charge;

            jb.cost=cost;
            return 0;
        }
        return -1;
    }


    /**
     * Checks the list of jobs and reurns the job number of the fist job for whicha  staff member is now avaialble.
     * If such a job is found the state of the job is set to on-going, the selected staff is added to the job information
     * and the staff's state is set to on job.
     * @return int 0
     * 
     *
     */

    public int checkJobsWaiting(){

        // Iterating Using entrySet() and Java iterator  
        Iterator<Entry<Integer, Job>> it = jobs.entrySet().iterator(); 

        while(it.hasNext())
        {
            Entry<Integer, Job> entry = it.next();

            //Find assigned staff
            String id = entry.getValue().getAssignedStaff();

            //Check state of assigned staff
            Staff st = staffs.get(id);
            String avaial = st.getStatus();
            //String avaial = entry.getValue().getAssignedStaff();

            if(avaial.equals("Available")){
                //if such a job is found, the state of the job is set to "on going"
                String cust = entry.getValue().getCustomer();
                Job jb2= jobs.get(cust);

                jb2.setAsOngoing();
                int jobID =  jb2.getID();

                //The selected staff is added to the job information
                jb2.assignStaff(id);

                //The staff's state is set to "on job"
                st.setAsOnJob();

                //jobs.put(cust, jb2);

                return jobID;

            }else {

                it.next();

            }

        }
        return 0; 
    }

    /**
     * Search for Customer using 
     * @param String Cust = Customer Name
     * @Return "Found" or "Not Found"
     *  @Exception  NoSuchElementException is captured if Customer is not found.
     */   

    public String newsearch (String cust){

        try {
            Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 

            while(it.hasNext())
            {

                Entry<Integer, Customer> entry = it.next();

                if(entry.getValue().getName().equals(cust) ){

                    return "Found" ;
                }
            }

        } catch (NoSuchElementException nse) {

            return "Not Found" ;

        }
        return "Not Found" ;
    }

    /**
     * Search if Customer is Regular
     * @param String Cust = Customer Name
     * @Return "Regular" or "Not Regular"
     * @Exception  NoSuchElementException is captured if Customer is not found.
     */   
    public String isRegular (String cust){

        try {
            Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
            Entry<Integer, Customer> entry = it.next();
            if(entry.getValue().isRegular()==true){

                return "Regular" ;
            }else{

               
                return "Not Regular" ;
            }
        } catch (NoSuchElementException nse) {
            return "Not Regular" ;
        }
    }

    
    /**
     * Convert Customer to Regular Customer
     * 
     * 
     */
    public void toRegular (int custID){

        try {

            Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 

            Entry<Integer, Customer> entry = it.next();
            Customer cs = customers.get(custID);
            cs.regular=true;
            cs.set500Limit();

            customers.put(custID, cs);

             
        } catch (NoSuchElementException nse) {
        }
    }

    /**
     * Method to Check it customer is within Limit
     * 
     * 
     */
    public String isWithinLimit (String cust){
        try {
            Iterator<Entry<Integer, Customer>> it = customers.entrySet().iterator(); 
            Entry<Integer, Customer> entry = it.next();

            if((entry.getValue().isRegular()==true) && (entry.getValue().getLimit()>=500 )){
                return "Yes";
            }else if ((entry.getValue().isRegular()==false) && (entry.getValue().getLimit()>=100 )) {

                return "Yes";
            }else {

                return "No";

            
            } 
        }catch (NoSuchElementException nse) {

            return "No" ;
        }

    }

    /**
     * Get next avaialble staff
     */ 

    public String nextAvaialbleStaff(){
        String next=null;

        // Iterating Using entrySet() and Java iterator  

        Iterator<Entry<String, Staff>> it = staffs.entrySet().iterator(); 

        while(it.hasNext())
        {
            Entry<String, Staff> entry = it.next();
            String avaial = entry.getValue().getStatus();
            String id = entry.getValue().getID();

            if(avaial.equals("Available")){

                next = id;
            }else {

            }

        }

        return next;

    }

    
<<<<<<< HEAD

=======
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
    
    
    
    
    
>>>>>>> origin/master
    
}
