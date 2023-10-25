package fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Please provide a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 1; i<=num; i++){
            System.out.println(fizzBuzz(i));
        }


    }
    public static String fizzBuzz(int i) {
        if (i%5==0 && i%3==0){
            return "FizzBuzz";
        }
        else if (i%3 == 0){
            return "Fizz";
        }
        else if (i%5 ==0){
            return "Buzz";
        }
        else{
            return Integer.toString(i);
        }
    }
}
