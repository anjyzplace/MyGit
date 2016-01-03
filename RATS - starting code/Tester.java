import java.util.Iterator;  
import java.util.Map.Entry;  

/**
 * Provide Testing data and scenraio for the RATS system.
 * 
 * @author 14114580 
 * @version 1.00
 */
public class Tester 
{
    // instance variables - replace the example below with your own
    Manager test = new Branch("Watford");
<<<<<<< HEAD
   // String cust = "Flo Recoveries Ltd";
    //String lang = "English";
=======
//     String cust = "Flo Recoveries Ltd";
//     String lang = "English";
>>>>>>> origin/master
    /**
     * Constructor for objects of class Test
     */
    public Tester()
    {
        // initialise instance variables
       
    }

    /**
     * A method to test classes and scenarios
     * 
     */
    public void doTest(){
<<<<<<< HEAD
        
        //Adds 10 Staffs to the Branch, tests Clerk, Typist and Translator Methods to add staff
        
=======
       // test.addJob(cust,true, true, lang);
>>>>>>> origin/master
        test.addStaff("CL1","Ann");
        test.addStaff("CL2","Bob");
        test.addStaff("TY1","Che", true, true);
        test.addStaff("TY2","Dan", true, false);
        test.addStaff("TY3","Eve", false, true);
        test.addStaff("TY4","Fez", false, false);
        test.addStaff("TR1","Gil", true, true,"French", 15.50);
        test.addStaff("TR2","Han", true, false,"French", 16.50);
        test.addStaff("TR3","Kit", false, true,"German", 17.50);
        test.addStaff("TR4","Lil", false, false,"German", 18.50);
<<<<<<< HEAD
        
            

        // Add 15 jobs, from 15 Customers
        test.addJob("CST1", true, true, "English");
        test.addJob("CST2", true, true, "English");
        test.addJob("CST3", true, true, "French");
        test.addJob("CST5", true, false, "English");
        test.addJob("CST4", true, true, "Spanish");
        test.addJob("CST7", true, true, "Portuguese");
        test.addJob("CST6", true, true, "English");
        test.addJob("CST8", true, true, "French");
        test.addJob("CST9", true, false, "English");
        test.addJob("CST10", true, true, "Mandarin");
        test.addJob("CST11", true, true, "English");
        test.addJob("CST12", true, true, "English");
        test.addJob("CST13", true, true, "French");
        test.addJob("CST14", true, false, "English");
        test.addJob("CST15", true, false, "English");
        
        //Sets email for one Typist
        test.setEmail("TY1", "dan.typist@watfordbranch.com");
        
        //Display Branch, Staff, Customer and Jobs.
        System.out.println(test.toString() );
        
        //5 jobs should be waiting as there are 10 Staff avaialble
        System.out.println("//5 jobs should be waiting as there are 10 Staff avaialble");
        System.out.println(test.getJobsWaiting() );
        System.out.println("*****************"+"\n" );
        
        
        
        // Test if ID identifies Staff. CL1 should be true, XL1 should be false.
         System.out.println("// Test if ID identifies Staff. CL1 should be true, XL1 should be false." );
         System.out.println("Is CL1 identified "+test.isStaff("CL1") );
         System.out.println("Is XL1 identified "+test.isStaff("XL1")+"\n"+"\n"  );
        
       
         
         //Remove Staff CL1,Staff CL1 should be deleted from the system 
         System.out.println("//Remove Staff CL1,Staff CL1 should be deleted from the system  " );
         System.out.println("//Staff CL1 should be deleted from the system "+"\n"  );
         test.removeStaff("CL1");
         System.out.println(test.getAllStaff() );
         
         //Set Job 100 ,106 and 108 as done in  4, 2 and 3 hours respectively 
         //Returns a value of 0 when done.
         System.out.println("//Set Job 100 ,106 and 108 as done in 30 hours respectively "+"\n" );
         System.out.println("Set Job 100 as done : Returns value :" + test.setJobDone(100,4));
         System.out.println("Set Job 106 as done : Returns value :" + test.setJobDone(106,2));
         System.out.println("Set Job 106 as done : Returns value :" + test.setJobDone(108,3)+"\n" );
         
         
         //Get the cost of  Job 100 ,106 and 108 as done in   4, 2 and 3 hours respectively
         // (rate*hours)+fee+charge;
         //Fixed charge is £20 if it requres shorthand
         // Job 100 was carried out by Typist(rate =12)(Staff TY3 , rate =12) thre fore cost is £93.0
         // Job 106 was carried out by Translator  (Staff TR4, rate =18.50) thre fore cost is £82.0
         // Job 108 requires no shorthand and was carried out by Translator  (Staff TR3, rate =17.50) therefore cost is £77.5
        System.out.println("//Get the cost of  Job 100 ,106 and 108as done in  4, 2 and 3  hours respectively" );
         System.out.println("The Job Cost for 100 is £" + test.getJobCost(100) );
         System.out.println("The Job Cost for 106 is £"+test.getJobCost(106) );
         System.out.println("The Job Cost for 108 is £"+test.getJobCost(108)+"\n"  );
         
       // Get the cost of a job which is not completed (waiting) should return a value of 0.0 as it has not been completed.
       System.out.println(" // Get the cost of a job which is not completed (waiting) should return a value of 0.0 as it has not been completed." );
       System.out.println("Th Cost for waiting Job 114 is £"+test.getJobCost(114) );
         
        
   
=======
        test.addJob("Ali", true, true, "English");
        test.addJob("Rich", true, true, "English");
        test.addJob("Chris", true, true, "English");
        test.addJob("Flo", true, true, "German");
        test.addJob("Deep", true, true, "French");
        //test.addCustomer("CT2", "Caste Celega");
//         Branch watford = new Branch("Wawtford");
//         watford.addCustomer("CT2", "Caste Celega");
//         watford.addCustomer("CT1", "Custar Cille", 500);
  //      System.out.println(test.addJob(cust,true, true, lang) );
>>>>>>> origin/master
        
    
    }
}
