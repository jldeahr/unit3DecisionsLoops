import java.util.Scanner;

/**
 * Write a description of class LeapYear here.
 * 
 * @author jldeahr
 * @version October 17, 2-014
 */
public class LeapYear
{
    public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        
        isLeapYear(year);
    }
    
    public static Boolean isLeapYear(int year)
    {
        if(year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
