package ex15.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 William Weatherlow
 */

public class App {
    final String passwordCheck = "abc$123";
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        App myApp = new App();
        System.out.print("Please Enter your Username ");
        String user = myApp.readInput();//Asked for input not sure what to do with it
        System.out.print("What is the password? ");
        String passInput = myApp.readInput();

        myApp.check(passInput);
    }
    private String readInput(){
        return in.nextLine();
    }
    private void check(String passInput){
        if(passInput.equals(passwordCheck)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
