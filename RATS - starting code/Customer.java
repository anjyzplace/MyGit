
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
    Boolean regular= false;
    private int custID;
    private int creditLimit = 100;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int custID, String name)
    {
        // initialise instance variables
       this.custID=custID;
       this.name = name;
       this.creditLimit = creditLimit;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return custID;
    }
    public int getLimit(){
        return creditLimit;
    }
    
    public boolean isRegular(){
        return regular;
    }

    public void set500Limit(){
  
        this.creditLimit = 500;
    }
    
}
