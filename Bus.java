public class Bus {
    public static void main(String[] args) {
        int time = 0;{
            while(time < 20)
            {
                System.out.println("Waiting for bus...");
                time = time + 5;
            }
            System.out.println("Bus Arrived");
        }
    }
}
