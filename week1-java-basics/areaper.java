import java.util.Scanner;
import java.lang.path;

public class areaper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //area and permiter

        System.out.println("area of circle:");
        System.out.println("enter radius:");

        double radius = sc.nextFloat();
        double pi = Math.PI;
        doube area = pi*radius*radius;
        float permiter = 2*pi*radius;

        System.out.println("area of circle is"+area+"\nperimter of circle is:"+permiter);
        
        

        
    }
}
