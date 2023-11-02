package Phase1;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey👋, Buddy It's your BMI Calculator 🧮");
        System.out.println("Let's check your BMI 😏");
        System.out.println();

        System.out.print("Enter your weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Now, Enter your height(kg):");
        double height = sc.nextDouble()/100;

        System.out.println("Hmm, Wait I'm Checking your BMI");

        double bmi = getYourBmi(weight,height);
        String formattedBmi = String.format("%.2f",bmi);
        String result = interpretation(bmi);

        System.out.println("Your BMI is  : "+formattedBmi);
        System.out.println("Interpretation : "+result);
    }

    public static double getYourBmi(double weight,double height){
        return weight/(height*height);
    }

    public static String interpretation(double bmi){
        if(bmi<18.5){
            return "Oops You are Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Good, your BMI is normal, Excellent";
        } else if (bmi >= 25 && bmi < 30) {
            return "Hmm, need to go to GYM, you are over-weight 🤭";
        }
        else {
            return "Obese 🏋️‍♂️";
        }
    }
}
