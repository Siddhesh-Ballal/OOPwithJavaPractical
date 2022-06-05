import java.util.Scanner;

public class GCD_of_2_numbers {
    public static int GCD(int a, int b) {
        int max, gcd;
        if (a >= b)
            max = a;
        else
            max = b;

        for (int i = max; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                return gcd;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter 1st number: ");
        n1 = i.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = i.nextInt();

        int gcd = GCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " = " + gcd);
    }
}
