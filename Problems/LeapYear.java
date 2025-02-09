/* Check if a given year is a leap year.
 * Leap years are:
 * 1.) Divisible by 4
 * 2.) Not Divisible by 100
 * 3.) Unless also divisible by 400
 */

package Problems;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a year: ");
        int year = Integer.parseInt(scan.nextLine());
        boolean leapYear = false;
        if(year % 400 == 0)
        {
            leapYear = true;
        }
        else if(year % 100 == 0)
        {
            leapYear = false;
        }
        else if(year % 4 == 0)
        {
            leapYear = true;
        }
        else leapYear = false;
        System.out.printf("%d %s a leap year\n", year, leapYear ? "is" : "is not");
    }
}
