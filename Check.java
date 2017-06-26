
/**
 **@author Katherine
 *Homework 3
 *Class Check
 */
public class Check
implements java.io.Serializable
{
    //checkNumber
    private int number;
    //what is the check for
    private String For;
    // Who you are paying
    private String payee;
    // amount you are paying
    public double amount;
    private String name = "Katherine";
  
    /**
     * Create a new check with a given check number
     */
    public Check(int checkNumber, String payingTo, String reason, double checkAmount)
    {
        number = checkNumber;
        For = reason;
        payee = payingTo;
        amount = checkAmount;
        
    }
    // second constructor for serialization
    public Check()
    {
        this.number = number;
        this.For = For;
        this.payee = payee;
        this.amount = amount;
    }
    /**
     * return the check number for a check
     */
    public int getNumber()
    {
        return number;
    }
    /**
     * return the payee information
     */
    
    public String getpayingTo()
    {
        return payee;
    }
    public double getcheckAmount()
    {
        return amount;
    }
    /**
    * Print out the check
    */
    public void printCheck()
    {
        System.out.println(name + "       " + number);
        System.out.println("Pay to the order of: " + payee + "      " + "$" + amount);
        System.out.println("For:   " + For);
    }
}