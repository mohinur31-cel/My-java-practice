import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double time = sc.nextDouble();

        double velocity = (distance * 3.6) / time;

        System.out.println(velocity + " km/h");

        if (velocity < 60) {
            System.out.println("Too slow. Needs more changes.");
        } else if (velocity <= 90) {
            System.out.println("Velocity is okay. The car is ready!");
        } else {
            System.out.println("Too fast. Only a few changes should suffice.");
        }

        sc.close();
    }
}