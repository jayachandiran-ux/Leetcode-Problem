import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        int p = sc.nextInt();
        System.out.println("Enter the Annual Intrest: ");
        int r = sc.nextInt();
        System.out.println("Enter the Time Duration: ");
        int t = sc.nextInt();

        int SI = (p*r*t)/100;
        System.out.println("Simple Intrest: " + SI);
        sc.close();
    }
}
