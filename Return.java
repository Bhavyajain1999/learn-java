import java.util.Scanner;

public class Return {

    public static void main(String[] args) {

        int a = readNumber();
        int b = readNumber();
        int sum =  sum(a,b);
        System.out.println("sum of number is " +sum);

    }
    public static int sum(int num1, int num2){
        int num3 = num1 + num2;
        return  num3;
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number  ");
        int num = input.nextInt();;
       return num;
    }

}
