
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    Boolean regular;
    private String custID;
    private int creditLimit = 100;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String custID, String name)
    {
        // initialise instance variables
       this.custID=custID;
       this.name = name;
       this.creditLimit = creditLimit;
    }

//     public Customer(String custID, String name){
//     this.custID =custID;
//     this.name= name;
//     creditLimit = 500;
//     }
    
}
