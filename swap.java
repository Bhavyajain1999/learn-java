import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        // int a = 4;
        // int b = 5;
        // System.out.println("value of a is " + a);
        // System.out.println("value of b is " + b);

        // int c = a;
        // a = b;
        // b = c;

        // System.out.println("now after swapping value of a is " + a);
        // System.out.println("now after swapping value of b is " + b);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b which you want to swap");
        System.out.println("Enter Value of a ");
        int a = input.nextInt();
        System.out.println("Enter the value of b ");
        int b = input.nextInt();

        int c = a;
            a = b;
            b = c;

            System.out.println("now after swapping value of a is " + a);
            System.out.println("now after swapping value of b is " + b);



    }
    
}