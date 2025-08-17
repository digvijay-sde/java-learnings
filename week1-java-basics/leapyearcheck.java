import java.util.Scanner;

public class leapyearcheck {
    public static void main(String[] args) {
        System.out.println("enter your year:");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year%400==0){
            System.out.println("its a leap year");
        }
        else if(year%4==0 && year%100!==0){}

    }
}
