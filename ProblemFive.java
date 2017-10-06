import java.util.Scanner;
/**
 * Write a description of class ProblemFive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemFive
{
    //******************************************
    // RightTriangle.java
    // 
    // Compute the length of the  hypotenuse of a right Triangle
    // given the lengths of the sides
    // *****************************************
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double side1, side2;  //lengths of the sides of a right triangle
        double hypotenuse;
        //Get the lengths of the sides as an input
        System.out.print("Please enter the length of the side of a right triangle.");
        side1 = keyboard.nextDouble();
        System.out.print("Please enter the length of the other side of the right triangle.");
        side2 = keyboard.nextDouble();
        hypotenuse = Math.pow(side1, 2) + Math.pow(side2, 2);
        hypotenuse = Math.sqrt(hypotenuse);
        System.out.print("Length of the hypotenuse: " + hypotenuse);
    }
}
