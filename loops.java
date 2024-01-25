import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        String pass;
//        System.out.println("please enter the size of array");
//        int num = readNumber();
//        int[] arr = inputArray(num);
//        System.out.println("please enter which number to count");
//        int numToCount = readNumber();
//        System.out.println("Count of " + numToCount + " is " + count(arr,numToCount) ) ;

//        System.out.println("biggest element in array is " +max(arr));


//        multiplication(num);


//        do{
//            System.out.println("please enter the password ");
//             pass = readstring();
//
//        }while (!isValidPassword(pass)) ;
//
//        do{
//            System.out.println("please enter the number ");
//             num = readNumber();
//
//        }while (!isValidNumber(num)) ;
//
//        if(isPrime(num)){
//            System.out.println("number is prime");
//        }else {
//            System.out.println("number is not prime");
//        }
    }

//    public static Boolean isPrime(int num) {
//        for(int j = 2; j < num; j++ ){
//            if(num % j == 0){
//                return false;
//            }
//
//        }
//         return true;
//    }

    //
//    private static boolean isValidNumber(int num) {
//        int a =1999;
//        if(num == a){return true;}
//            else{return  false;}
//    }
//
//    private static Boolean isValidPassword(String pass) {
//        int validPass = 6;
//        if(validPass == pass.length()){return true;}
//        else return false;
//    }
//
//    public static String readstring(){
//        Scanner input = new Scanner(System.in);
//
//        String Password = input.nextLine();
//        return Password;
//    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        return number;
    }
    public static int[] inputArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }


//    public static void multiplication(int i){
//
//        for (int j = 1; j<11; j++){
//            System.out.println(i + "*" + j + "=" + (i*j) );
//
//        }
//
//
//
//    }

//    public static int max(int[] a) {
//
//        int max = a[0];
//
//        for (int number : a) {
//            if (max <= number) {
//                max = number;
//            } else {
//                max = a[0];
//            }
//
//        }
//
//
//        return max;
//    }
//        public static int count(int[] a, int b) {
//
//        int count = 0;
//
//        for (int number : a) {
//            if (b == number) {
//                count ++ ;
//            }
//        }
//
//
//        return count;}
}
