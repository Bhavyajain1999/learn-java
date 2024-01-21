import java.util.Scanner;

public class exercise4 {
  // to take number
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number  ");
        int num = input.nextInt();;
        return num;
    }
    // multiplication table for a given number
//    public static void multiplication(int i){
//        int num = 1;
//        while(num<11){
//            int x = i * num ;
//            System.out.println(i + "*" + num + "=" + x );
//            num++;
//
//        }
//    }
//    public static void main(String[] args) {
//        int a = readNumber();
//        multiplication(a);
//
//    }

    // sum of odd number till N
//    public static int oddSum(int i){
//        int num = 1;
//        int sum = 0;
//        while(num <= i){
//            sum = sum + num ;
//            num = num + 2 ;
//
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        System.out.println("sum of odd number till N is " +  oddSum(a));
//    }
        // calculate the factorial value of given number

//    public static int factorial(int i){
//        int num = 1;
//        int product = 1;
//        while(num <= i){
//            product = product * num ;
//            num++;
//        }
//        return product;
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        System.out.println("factorial value is " + factorial(a) );
//    }

    // sum of digits of given number
//    public static int sumOfdigits(int i){
//
//        int sum = 0;
//
//        while(i != 0 ){
//
//            int remainder = i%10;
//            sum = sum + remainder;
//            i = i / 10;
//
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        System.out.println("sum of digit is " + sumOfdigits(a) );
//    }


//    // Method to calculate the LCM using while loop
//    public static int calculateLCM(int num1, int num2) {
//        int largerNumber = (num1 > num2) ? num1 : num2;
//        int lcm = largerNumber;
//
//        while (true) {
//            if (lcm % num1 == 0 && lcm % num2 == 0) {
//                break;
//            }
//            lcm += largerNumber;
//        }
//
//        return lcm;
//    }
//
//    // Method to calculate the HCF using while loop
//    public static int calculateHCF(int num1, int num2) {
//        while (num2 != 0) {
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//
//        return num1;
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        int b = readNumber();
//        System.out.println("LCM OF a and b is "+calculateLCM(a,b));
//        System.out.println("HCF OF a and b is "+calculateHCF(a,b));
//    }


    // check whether it is prime number
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        int i = 2;
//        while (i <= Math.sqrt(n)) {
//            if (n % i == 0) {
//                return false;
//            }
//            i++;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        if (isPrime(a)){
//            System.out.println(a + " is prime number");
//        }
//        else {
//            System.out.println(a + " is not prime number");
//        }
//    }

    //REVERSE THE NUMBER and check whether it is pallindrome or not
//    public static int reverseNumber(int n) {
//        int reversedNumber = 0;
//
//        while (n != 0) {
//            int digit = n % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            n /= 10;
//        }
//
//        return reversedNumber;
//    }
//    public static void  checkPalindrome(int i, int j){
//        if (i == j){
//            System.out.println("number is palindrome");
//        }
//        else {
//            System.out.println("number is not a palindrome");
//        }
//
//    }
//    public static void main(String[] args) {
//        int a = readNumber();
//        System.out.println("reversed number is " + reverseNumber(a));
//        int b =reverseNumber(a);
//        checkPalindrome(b,a);
//    }

// number is armstrong number or not
//    public static void checkArmstrong(int i ){
//        double orginalNumber = i;
//        int numberOfdigits = String.valueOf(i).length();
//        double a = 0;
//        while (i != 0){
//            int j = i%10;
//                 a = a + Math.pow(j,numberOfdigits) ;
//                    i = i/10 ;
//
//        }
//        System.out.println(a);
//        if (a == orginalNumber){
//            System.out.println(" Number is armstrong number ");
//        }
//        else {
//            System.out.println("number is not armstrong number");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        checkArmstrong(a);
//    }


    // print fibonacci series

//    public static void  fibonacciSeries(int i){
//        int a = 0;
//        int b = 1;
//        int c = 0 ;
//
//
//        while ( a <= i){
//            System.out.print(a + ",");
//
//            c = a + b ;
//            a = b;
//            b = c;
//        }
//    }
//
//    public static void main(String[] args) {
//        int a = readNumber();
//        fibonacciSeries(a);
//    }


}
