public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;

        int a = num % 10;
        int b = (num/10) % 10;
        int c = (num/100) % 10;

        int r = (a*100) + (b*10) + c ;
        System.out.println("Reversed Number: "+ r);
    }
}
