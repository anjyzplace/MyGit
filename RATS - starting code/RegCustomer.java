
/**
 * Write a description of class RegCustomer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegCustomer extends Customer
{
    // instance variables - replace the example below with your own
    private int creditLimit = 500;

    /**
     * Constructor for objects of class RegCustomer
     */
    public RegCustomer(int custID, String name, int creditLimit)
    {
        // initialise instance variables
    super(custID, name);
    this.creditLimit = creditLimit;
      }
    }



