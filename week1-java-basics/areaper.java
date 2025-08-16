import java.util.Scanner;
import java.lang.Math;

public class areaper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //area and permiter

        System.out.println("area of circle:");
        System.out.println("enter radius:");

        double radius = sc.nextFloat();
        double pi = Math.PI;
        double area = pi*radius*radius;
        double permiter = 2*pi*radius;

        System.out.println("area of circle is"+area+"\nperimter of circle is:"+permiter);
        
        System.out.println("area of rectangle:");
        

        
    }
}
