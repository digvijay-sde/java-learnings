import java.util.Scanner;

public class milestokilo {

    public static void main(String[] args) {
        System.out.println("enter distance in miles:");
        Scanner sc = new Scanner(System.in);

        double miles = sc.nextDouble();
        double kilo = 0.621*miles;

        System.out.println("");
    }
}