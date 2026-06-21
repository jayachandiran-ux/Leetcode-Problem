import java.util.Scanner;
public class UglyNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n > 0){
            while(n % 2 == 0){
                n = n/2;
            }
            while(n % 3 == 0){
                n = n/3;
            }
            while(n % 5 == 0){
                n = n/5;
            }
        }
        if(n == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
