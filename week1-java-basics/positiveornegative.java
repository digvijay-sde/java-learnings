import java.util.Scanner;

public class positiveornegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");

        int number = sc.nextInt()
        

        if(number==0){
            System.out.println("The number is zero,neither positive or negative");
        }
        else if(number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }

    }
}