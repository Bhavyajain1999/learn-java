public class bitwise {public static void main(String[] args) {
    

    

// 1. Bitwise AND of two numbers:
// ```java

        int num1 = 5;
        int num2 = 3;
        int result = num1 & num2;
        System.out.println("Bitwise AND: " + result);
 


// 2. Bitwise OR of two numbers:
// ```java

        int num3 = 5;
        int num4 = 3;
        int result1 = num3 | num4;
        System.out.println("Bitwise OR: " + result1);
    

// 3. Bitwise XOR of two numbers:
// ```java

        int num5 = 5;
        int num6 = 3;
        int result2 = num1 ^ num2;
        System.out.println("Bitwise XOR: " + result2);

// 4. Bitwise complement of a number:
// ```java

        int num7 = 5;
        int result3 = ~num7;
        System.out.println("Bitwise Complement: " + result3);
   

// 5. Use of left shift operator:
// ```java

        int num8 = 5;
        int result4 = num8 << 2;
        System.out.println("Left Shift Operator: " + result4);
    

// 6. Use of right shift operator:
// ```java

        int num9 = 16;
        int result5 = num8 >> 2;
        System.out.println("Right Shift Operator: " + result5);
   

// 7. Check if a given number is even or odd using bitwise operators:
// ```java

        int num10 = 7;
        if ((num10 & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

    