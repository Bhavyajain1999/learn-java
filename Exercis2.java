//arithmatic operator
//product of floating point number
// perimeter of rectangle
//area of triangle
// simple interest and compound interest
//fahrenite to celsius

import java.util.Scanner;

public class Exercis2 {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        // System.out.println("Please enter number a");
        // int a = input.nextInt();    
        // System.out.println("Please enter number b");
        // int b = input.nextInt();
        // System.out.println("sum of two number is " +(a+b));
        // System.out.println("Product of two number is "+(a*b));
        // System.out.println("difference of two number is " +(a-b));
        // System.out.println("division of two number is " +(a/b));
        // System.out.println("Remainder when a is divided by b " +(a%b));

        // System.out.println("Please enter number c");
        // float c = input.nextFloat();    
        // System.out.println("Please enter number d");
        // float d = input.nextFloat();

        // float product = c * d ;
        // System.out.println(product);

        // System.out.println("Please enter length l");
        // int l = input.nextInt();    
        // System.out.println("Please enter breadth b");
        // int b = input.nextInt();
        // int perimeter = 2*(l+b) ;
        // System.out.println("perimeter of rectangle is " +perimeter);

        // System.out.println("Please enter height h ");
        // int h = input.nextInt();    
        // System.out.println("Please enter base b ");
        // int b = input.nextInt();
        // int area = (h*b)/2 ;
        // System.out.println("area of triangle is " +area);

        // System.out.println("Please enter principle p");
        // int p = input.nextInt();    
        // System.out.println("Please enter rate r");
        // int r = input.nextInt();
        // System.out.println("Please enter time t");
        // int t = input.nextInt();
        // int simpleInterest = (p*r*t)/100 ;
        // System.out.println("simple interest is " +simpleInterest);

        // System.out.println("Please enter principle p");
        // double p = input.nextDouble();    
        // System.out.println("Please enter rate r");
        // double r = input.nextDouble();
        // System.out.println("Please enter time t");
        // double t = input.nextDouble();
        // double compoundInterest = p * (Math.pow((1 + r/100), t));
        // System.out.println("compound interest is " +compoundInterest);

        System.out.println("Please enter fahrenite f");
        double f = input.nextDouble();    
        
        double c = (f - 32)*(5)/(9);
        System.out.println("fahrenite in celcius " +c);
    



        

    }
    
}
