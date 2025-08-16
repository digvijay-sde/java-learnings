import java.util.Scanner;

public class celtofarhn {
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");

        float celsius = sc.nextFloat();
        float farhenite = (celsius*9)/5 + (32);
        
        
    }

}