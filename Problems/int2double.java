/* Convert an integer to a double and vice versa.
 * using wrapper classes Integer & Double
 */

 package Problems;

public class int2double {
    public static void main(String[] args){
        int i = 95; 
        double d = 33.67;
        System.out.printf("Original int is %d and original double is %f", i, d);

        int convertedI = (int) Math.round(d);
        double convertedD = Double.valueOf(i);

        System.out.printf("Converted int is now %f and converted double is %d", 
        convertedD, convertedI);

    }    
}
