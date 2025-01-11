package challanges;
import java.util.Scanner;

public class HeronsFormula {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float area,s;
        System.out.print("Please enter the sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a+b>c && b+c>a && a+c>b){
        s = (a+b+c)/2f;
        float z =s*(s-a)*(s-b)*(s-c); 
        
        area = (float)Math.sqrt(z);
         System.out.println("Area of the triangle is: "+area);
        }
        else{
            System.out.println("Invalid Traingle Sides");
        }  
    }
}
