import java.util.Scanner;

public class divisibleby5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number10
        ");
        int number = sc.nextInt();

        if(number%5==0){
            System.out.println("divisble by 5");
        }
        else{
            System.out.println("not divisble by 5");
        }
    }
}