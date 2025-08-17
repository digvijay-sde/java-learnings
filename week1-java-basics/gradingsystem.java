import java.util.Scanner;

public class gradingsystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grading system:\n"+"Enter your marks percentage:");

        float marks = sc.nextFloat(+);
        if (marks>=90) {
            System.out.println("Grade A");
            
        }
    }
}