
import java.util.Scanner;
public class TransformAndConquerLCM {

    static Scanner input = new Scanner(System.in);

    protected static int gcd(int m, int n) {
        if (m == 0 || n == 0) {
            System.out.println("GCD(0, 0) is undefined");
            return 1;
        }

        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        System.out.println();
        System.out.println("Running algorithm:");
        while (n != 0) {
            int quotient = m / n;
            int remainder = m % n;

            System.out.println(m + ", " + n + " = " + quotient + " remainder (" + remainder + ")");

            m = n;
            n = remainder;
        }

        return m;
    }


    public static void main(String[] args) {
        int m = 0, n = 0;

        System.out.println("Variable m: ");
        m = input.nextInt();

        System.out.println("Variable n: ");
        n = input.nextInt();

        double gcd = gcd(m, n);
        double lcm = (m * n) / gcd;

        System.out.println();
        System.out.println("LCM(" + m + ", " + n + ") = (" + m + " * " + n + ") / " + gcd + " = " + lcm);
    }
}


