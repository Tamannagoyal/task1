import java.util.Scanner;

public class Buzznumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking for Buzz Number
        if (number % 10 == 7 || number % 7 == 0) {
            System.out.println(number + " is a Buzz Number.");
        } else {
            System.out.println(number + " is NOT a Buzz Number.");
        }

        sc.close();
    }
}
