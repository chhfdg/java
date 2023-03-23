import java.util.Scanner;

public class LcmGcdCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

       
        int[] values = new int[n];
        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }

        
        int lcm = calculateLCM(values);
        int gcd = calculateGCD(values);

      
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    
    public static int calculateLCM(int[] values) {
        int lcm = values[0];
        for (int i = 1; i < values.length; i++) {
            lcm = lcm * values[i] / calculateGCD(new int[] {lcm, values[i]});
        }
        return lcm;
    }

   
    public static int calculateGCD(int[] values) {
        int gcd = values[0];
        for (int i = 1; i < values.length; i++) {
            gcd = calculateGCD(gcd, values[i]);
        }
        return gcd;
    }

   
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
