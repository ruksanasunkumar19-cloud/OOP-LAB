import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {

            System.out.println("Number: " + i);

            sum = sum + i;

            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;

            factorial = factorial * i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Even numbers count = " + evenCount);
        System.out.println("Odd numbers count = " + oddCount);
        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}