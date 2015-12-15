
/**
 * Write a description of class Job here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job
{
    // instance variables - replace the example below with your own
    public int id;
    Boolean home;

    /**
     * Constructor for objects of class Job
     */
    public Job()
    {
        // initialise instance variables
       id=100;
       
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
}
