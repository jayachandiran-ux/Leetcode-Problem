import java.util.Scanner;
public class largestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("CAPITAL LETTERS");
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("small letters");
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("NUMBERS");
        }
        else{
            System.out.println("Special Characters");
        }
        sc.close();
    }
}
