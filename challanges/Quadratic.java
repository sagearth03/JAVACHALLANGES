package challanges;

import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a ,b ,c;
        float d, r1,r2;
        System.out.println("Please enter the coefficients of the Quadratic Equation respectively: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        d=((b*b)-(4*a*c));
        
        if(d>=0 || d>0){
            System.out.println("Roots are Real");
            r1 =(-b+(float)(Math.sqrt(d)))/(2*a);
            r2 =(-b-(float)(Math.sqrt(d)))/(2*a);
            System.out.println("Roots are: "+r1+"\n"+r2);
        }
        else{
             System.out.println("Roots are Imaginary");
         }
        
    }
}
