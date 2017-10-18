
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public String word;
    public String backwards;
    private boolean isPalindrome;
    
    public Palindrome(String wd)
    {
        this.word = wd;
    }
    public boolean testPalindrome() {
        for (int i = 0; i< word.length(); i++) {
            System.out.println(word.substring(i, i+1));
        }
        for (int i = word.length(); i >= 0; i--) {
            backwards = backwards + word.substring(i);
        }
        System.out.println(backwards);
        if (word == backwards) {
            isPalindrome = true;
        }
        else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
