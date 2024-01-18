import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String Name = input.nextLine();
        System.out.println("welcome to coding world " + Name);
        int a = input.nextInt();
        System.out.println("Please enter number a");
        int b = input.nextInt();
        System.out.println("Please enter number b");
        int c = a + b ;
        System.out.println("sum of a and b is " + c);

    }
}
