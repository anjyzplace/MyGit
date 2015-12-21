import java.util.Iterator;  
import java.util.Map.Entry;  
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    // instance variables - replace the example below with your own
    Manager test = new Branch("Watford");
//     String cust = "Flo Recoveries Ltd";
//     String lang = "English";
    /**
     * Constructor for objects of class Test
     */
    public Tester()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void doTest(){
       // test.addJob(cust,true, true, lang);
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
        
    
    }
}
