//Assginment operator //

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class operators {
    public static void main(String[] args){
        // int myInt = 9; //assignment operator//
        // int newInt = 10; //assignment of new operator//
        // int exInt = myInt;
        // System.out.println(myInt);
        // System.out.println(newInt);
        //  System.out.println(exInt);
        //  Boolean chk = (myInt == exInt);
        //  System.out.println(chk);
        // System.out.println(myInt + newInt);
        // System.out.println(newInt - myInt);
        // System.out.println(myInt * newInt);
        // System.out.println(newInt / myInt);

        //conditonal operator
        Scanner input = new Scanner(System.in);
        // System.out.println("please enter value of a");
        // int a = input.nextInt();
        // System.out.println("please enter value of b");
        // int b = input.nextInt();
        // if (a == b){
        //     System.out.println("a is equal to b ");
        //  } else {
        //     System.out.println("a is not equal to b");
        //  }   
         //relational operator

         // > , < , ==, <=, >=, != (not equal)

        //  if (a > b){
        //     System.out.println("a is greater than b ");
        //  } else {
        //     System.out.println("a is not greater than b");
        //  }   

        //  if (a < b){
        //     System.out.println("a is less than  b ");
        //  } else {
        //     System.out.println("a is greater than b");
        //  }   

        //  if (a >= b){
        //     System.out.println("a is equal to b ");
        //  } else {
        //     System.out.println("a is not equal to b");
        //  }   

        //  if (a != b){
        //     System.out.println("a is not equal to b ");
        //  } else {
        //     System.out.println("a is equal to b");
        //  }   
         
        //logical operator &&, || , !

        System.out.println("please enter gender if you are female then true otherwise false ");
        boolean gender = input.nextBoolean();

        System.out.println("please enter age ");
        int age = input.nextInt(); 
        
        

        if(age < 5){
            System.out.println("you got 75% discount");}
            else if(gender == true){
                System.out.println("you got 50% discount");  
            } 
            else if (age > 60 && gender == false){
                System.out.println("you got 25% discount");
            }
            else{
                System.out.println("you got no discount");
           }
        

        }

    }
