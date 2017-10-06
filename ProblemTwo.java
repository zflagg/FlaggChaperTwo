
/**
 * Write a description of class ProblemTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemTwo
{
    public static void main() {
        makeTable();
    }
    public static void makeTable() {
        makeHeader();
        makeColumns();
        populateRows();
    }
    public static void makeHeader() {
        System.out.println("-----------------------------");
        System.out.println("\tStudent Points");
        System.out.println("-----------------------------");
    }
    public static void makeColumns() {
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
    }
    public static void populateRows() {
        populateOneRow("Joe", 43, 7);
        populateOneRow("William", 50, 8);
        populateOneRow("Mary Sue", 10, 49);
    }
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t\t" + lab +"\t" + bonus + "\t" + (lab+bonus));
    }
}
