
import java.io.*;
import java.util.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
/**
 * Homework4
 * Create class checkbook  
 * @author (Katherine)
 */
public class Checkbook
{
    //Money to spend
    private double checkbookBalance;
    //ArrayList from class Check
    private ArrayList<Check> checks;
    //the amount spent on a check
    private double amountfromCheck;
    //total amount of money spent on all checks written
    private double totalSpent;
    
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook ()
    {
        checkbookBalance = 2000;
        checks = new ArrayList<Check>();
    }
         
 /**
     * Add a check to checkbook
     */
    public void addCheck(Check newCheck)
    {
        amountfromCheck = newCheck.amount;
        checks.add(newCheck);
        checkbookBalance = checkbookBalance - amountfromCheck; 
        totalSpent = totalSpent + amountfromCheck;
    
    }
   public double returncheckbookBalance()
    {
        return checkbookBalance;
    
 }
  public double returnTotalSpent()
  {
      return totalSpent;
 }
  public void addBalance(double balance)
  {
      checkbookBalance = checkbookBalance + balance;
 } 
  public void printCheck()
  {
      System.out.println("Amount left:" + returncheckbookBalance());
      System.out.println("Total Spent:" + returnTotalSpent());
 }
 public static void main(String args[])
   {
     Check c1 = new Check(101,"Tuition","Metro", 1000);
     Check c2 = new Check(102,"Internet","CenturyLink",35);
     Check c3 = new Check(105, "Electricity","Xcel", 20);
     
    try{
FileOutputStream hw4 = new FileOutputStream("hw4.txt");
ObjectOutputStream out = new ObjectOutputStream(hw4);
out.writeObject(c1); 
out.writeObject(c2);
out.writeObject(c3);
out.flush();

}
catch (IOException e ) {
e.printStackTrace();
System.out.println("Unable to serialize the object");
 
}
}
}