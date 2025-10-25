package com.example.solid.patterns.SOLID.S;
import java.util.Scanner;

public class Validator {
    Scanner scan = new Scanner(System.in);
    public void Validate(double amount){
        String answer;
        System.out.println("Is this the amount you want to pay?(Yes/No):  ");
        answer = scan.nextLine();
        if(answer.equals("Yes")){
            System.out.println("Going to the next step");
        }else{
            throw new IllegalArgumentException();
        }
    }
}
