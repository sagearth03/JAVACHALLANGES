package challanges;
import java.util.Scanner;
public class Area_Of_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height and base of the triangle: ");
        float h,b,area;
        h = sc.nextFloat();
        b = sc.nextFloat();
        area = (b*h)/2;
        System.out.println("Area of the triangle is: "+area);
    }
    
}

