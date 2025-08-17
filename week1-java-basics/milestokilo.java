import java.util.Scanner;

public class milestokilo {

    public static void main(String[] args) {
        System.out.println("enter distance in miles:");
        Scanner sc = new Scanner(System.in);

        double miles = sc.nextDouble();
        double kilo = 1.60*miles;

        System.out.println("The distance in kilometers is:"+kilo);
    }
}