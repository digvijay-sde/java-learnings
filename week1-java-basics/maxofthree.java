import java.util.Scanner;
public class maxofthree {
     
     System.out.println("enter your numbers:");

     Scanner sc = new Scanner(System.in);

     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();

     if(a>b && b>c){
        System.out.println("a is the greatest");
     }
     else if(b>a && b>c){
        System.out.println("b is the greatest");
     }
     else{
        System.out.println("c is the maximum");
     }
     
    }

     
      
          
    
