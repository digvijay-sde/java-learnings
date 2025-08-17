import java.util.Scanner;

public class gradingsystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grading system:\n"+"Enter your marks percentage:");

        float marks = sc.nextFloat();
        if(marks<=100 && marks>=0){
        if (marks>=90) {
            System.out.println("Grade A");
            
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else if(marks>=40){
            System.out.println("Grade E");
        }
        else (marks<40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Enter valid marks");
        }
        System.out.println("\n for"+marks+"%");
    }
    else{
        System.out.println("enter valid marks.");
    }
    }
}