package Phase2.number_Guessing;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int upperRange = 1;
        int lowerRange = 100;
        int num = ran.nextInt(upperRange,lowerRange+1);
        boolean correctGuessedNumber = false;

        System.out.println("The Range in between you have to guess is "+upperRange+" to "+lowerRange);

        while (!correctGuessedNumber){
            System.out.print("Enter your guessed Number : ");
            int guess = sc.nextInt();
            if(guess>num){
                System.out.println("Your guessed number is higher ☝️️");
            } else if (guess<num) {
                System.out.println("Your guessed number is lower 👇");
            }
            else {
                System.out.println("You guessed the correct number..! 🔥🔥😶");
                System.out.println("Congrats..!");
                correctGuessedNumber = true;
            }
        }
    }



}
