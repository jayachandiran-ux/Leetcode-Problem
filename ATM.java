import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int correctPin = 1234;
        int pin;
        int count = 0;

        do {
            System.out.print("Enter PIN: ");
            pin = sc.nextInt();
            count++;

            if (pin == correctPin) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong PIN");
            }

        } while (count < 3);

        if (pin != correctPin && count == 3) {
            System.out.println("Account Blocked");
        }
        sc.close();
    }
}