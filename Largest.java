import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter a Third Number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater number");
        }
        else if(b>c && b>c){
            System.out.println("b is greater number");
        }
        else{
            System.out.println("c is greater number");
        }
        sc.close();
    }
}
