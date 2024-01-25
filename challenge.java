import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        int a = readNumber();
        int b = readNumber();

        minimum_number(a,b);
        CheckOddOrEven(a);
        absoluteValue(a);

        int score = readNumber();
        scoreCategory(score);
        int monthNumber = readNumber();
        month(monthNumber);

        System.out.println(" please enter 1 for addition");
        System.out.println(" please enter 2 for substraction");
        System.out.println(" please enter 3 for multiplication");
        System.out.println(" please enter 4 for division");
        int c = readNumber();
        calculator(a,b,c);


    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number  ");
        int num = input.nextInt();;
        return num;
    }
    public static  void minimum_number(int a , int b){
        int greaterNumber = (a < b ? a : b);
        System.out.println("minimum number is " + greaterNumber);
    }
    public  static void CheckOddOrEven(int a){
        String Check = (a % 2 == 0) ? "even" : "odd";
        System.out.println("Number given is " + Check);

    }
    public static  void absoluteValue(int a){
        int Value = ((a > 0) ? a : -a );
        System.out.println("absolute value is " + Value);
    }

    public static void scoreCategory(int score){
        String Category = (score > 80 ? "High": (score > 50 ? "moderate" : "low"));
        System.out.println("your grade based on your score is " + Category);
    }
    public static void month(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("gadhe sahi month dal");
        }
    }
    public static void calculator(int a, int b, int c) {

        switch (c) {
            case 1:
                System.out.println("addition of two number is " + (a+b));
                break;
            case 2:
                System.out.println("substraction of two number is " + (a-b));
                break;
            case 3:
                System.out.println("multiplication of two number is " + (a*b));
                break;
            case 4:
                System.out.println("division of two number is " + (a/b));
                break;

            default:
                System.out.println("gadhe sahi month dal");
        }
    }


}
