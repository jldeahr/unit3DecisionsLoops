
/**
 * Compares two strings
 * 
 * @author Matt Wright and Joe Deahr
 * @version (a version number or a date)
 */
public class StringCompare
{
    /**
     * Compares two default strings based on conditions prompted on canvas
     */
    public static void main()
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        /*Write the following conditions in Java:

        1) word1 is lexicographically greater than "aaa"
        2) word1 is lexicographically equal to word2
        3) word1 is lexicographically less than word2 
        4) word1 and word2 have the same three-letter prefix
        */
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("True 1");
        }
        
        if (word1.equals(word2))
        {
            System.out.println("True 2");
        }
        
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("True 3");
        }
        
        if (word1.substring(0,3).compareTo(word2.substring(0,3)) == 0)
        {
            System.out.println("True 4");
        }
    }

}
