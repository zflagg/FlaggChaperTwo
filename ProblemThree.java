
/**
 * Write a description of class ProblemThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemThree
{
    public static void main(String[] args) {
        System.out.println("This is a long string that is the " +
                            "concentration of two shorter strings.");
        //I think this will print on one line
        //I was right
        
        System.out.println("The first computer was invented aout" + 55 +
                                "years ago.");
        //This will treat the number as a string and just insert it in the string
        System.out.println("8 plus 5 is " + 8 + 5);
        //this will answer 85
        System.out.println("8 plus 5 is " + (8 + 5));
        //this will answer 13 like it should
        System.out.println(8 + 5 + " equals 8 plus 5.");
        //this will also answer 13 because the numbers aren't treated as strings yet
        
    }
}
