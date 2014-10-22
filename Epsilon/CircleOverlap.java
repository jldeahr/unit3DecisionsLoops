import java.util.Scanner;

/**
 * Tests whether two user inputted values overlap in a theoretical circle
 * 
 * @author Matt Wright and Joe Deahr 
 * @version 10/16/14
 */
public class CircleOverlap
{
    /**
     * Main method of the class
     */
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Input the radius of the first circle: ");
       double radius1 = in.nextDouble(); 
       double xcenter1 = 0;
       double ycenter1 = 0;
       System.out.print("Input the radius of the second circle: ");
       double radius2 = in.nextDouble(); 
       double xcenter2 = 40;
       double ycenter2 = 0;

       if (radius1 < radius2 + xcenter2)
       {
           System.out.println("Disjoint");
       }
       
       else if (radius1 >= radius2 + xcenter2)
       {
           System.out.println("Overlapping");
       }
       
       else
       {
           System.out.println("Mutually conjoined");
       }
   }
}
