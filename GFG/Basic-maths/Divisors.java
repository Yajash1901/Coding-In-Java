import java.util.Scanner;
public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its Divisors : ");
        int n = sc.nextInt();
        printDivisors(n);
        sc.close();
    }

    public static void printDivisors(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
        i--; // step back to the last valid i
        for (; i >= 1; i--) {
            if (n % i == 0 && n / i != i) { // avoid duplicate when n is a perfect square
                System.out.print(" " + (n / i));
            }
        }
    }
}
/*
First loop (for(i=1; i*i<n; i++)):

Runs while i*i < n.

For n=30, it stops at i=5 (because 5*5 = 25 < 30, then i increments to 6, but 6*6 = 36 !< 30 → loop ends).

So after first loop: i = 6.

Second loop (for(; i>=1; i--)):

Starts with i=6 and goes down to 1.

At i=6, prints 30/6 = 5.

But you already printed 5 from the first loop (i=5) → duplicate.

🔧 Fix:

The issue is that your first loop goes until i*i < n.
Instead, you should go until i*i <= n and then carefully adjust the second loop. */