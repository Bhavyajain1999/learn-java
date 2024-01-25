import java.util.Scanner;

public class day6 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("please input number ");
          int a = input.nextInt();
          System.out.println(" please enter second number ");
          int b = input.nextInt();
          System.out.println("this program is for ternary operator");
          int greaterNumber = (a > b ? a : b);
          System.out.println("greatest numbr is " + greaterNumber);

     }



}
