
package com.mycompany.bmicalculator;
import java.util.Scanner;

//Class that reads user weight and height and calculate their BMI.
 
public class BMI {
    public static void main(String[] args){     
    //Name the variables
    int weight;
    int height;
        
    Scanner userInput = new Scanner(System.in);//Scanner for user input
       
        System.out.println("Enter weight in pounds:");
        weight = userInput.nextInt();
        
        System.out.println("Enter height in inches:");
        height = userInput.nextInt();
        
    double bmiCalculator = (weight * 703)/(height * height);
        
        System.out.println("Your BMI is:" + bmiCalculator);
        
        
        //If statement to measure your BMI base on the data entered
        if(bmiCalculator < 18.5){
        System.out.println("Underweight");
        }
        else if(bmiCalculator >= 18.5 && bmiCalculator < 25){
        System.out.println("Normal");
        }
        else if(bmiCalculator >= 25 && bmiCalculator < 30){
        System.out.println("Overweight");
        }
        else if(bmiCalculator >= 30){
        System.out.println("Obese");
        }
        
        userInput.close();
    }
   
}
