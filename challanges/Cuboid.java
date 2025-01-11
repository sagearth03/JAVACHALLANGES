package challanges;

import java.util.Scanner;

public class Cuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int l,b,h,vol,a;
        
        System.out.println("Please enter the height,length and breadth of the cuboid respectively:");
        
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        
        a = 2*((l*b)+(b*h)+(h*l));
        vol = l*b*h;
        
        System.out.println("Total Surface Area of the Cuboid is: "+a);
        System.out.println("Volume of the Cuboid is: "+vol);
        
    }
    
}
