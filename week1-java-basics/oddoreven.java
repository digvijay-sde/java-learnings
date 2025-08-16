import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to check:");
        
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println(number+"is even number");

        }
        else{
            System.out.println(number+"is odd number");
        }
        
    }
}
