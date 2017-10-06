import java.util.Scanner;
/**
 * Write a description of class ProblemSix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemSix
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int coverage = 350;  //paint covers 350 sq ft/gal
        double length, width, height;
        System.out.println("Length?");
        length = keyboard.nextDouble();
        System.out.println("Width?");
        width = keyboard.nextDouble();
        System.out.println("Height?");
        height = keyboard.nextDouble();
        double surfaceArea;
        surfaceArea = (2*length*width) + (2*length*height) + (2*width*height);
        double gallonsNeeded;
        gallonsNeeded = Math.ceil(surfaceArea/coverage);
        System.out.println("You'll need " + gallonsNeeded + " gallons.");
    }
}
