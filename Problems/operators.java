/* Perform basic arithmetic operations (+, -, *, /, %). */

package Problems;

public class operators {
    public static void main(String[] args){
        int a = 6;
        int b = 2;
        System.out.printf("%d + %d is ", a, b);
        System.out.println(a+b);
        System.out.printf("%d - %d is ", a, b);
        System.out.println(a-b);
        System.out.printf("%d * %d is ", a, b);
        System.out.println(a*b);
        if(b!=0){
            System.out.printf("%d / %d is ", a, b);
            System.out.println(a/b);
            System.out.printf("%d Mod %d is ", a, b);
            System.out.println(a%b);
        }
    }
}
