import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int a = n;
        while(n != 0){
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if(sum == a){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
