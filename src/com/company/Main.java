package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner getInput = new Scanner(System.in);
    public static ControlPanel bank = new ControlPanel();
    public static int password, masterPass, acctNumber;
    public static double amount;
    public static String name;
    public static  String  bankName;

    public static void main(String[] args) {
            System.out.print("Please Enter Your Name:");
            name = getInput.next();
            System.out.print("Enter your password:");
            password = getInput.nextInt();
            while(true){
                if(password < 9999){
                    bank.setPassword(password);
                    break;
                }else{
                    System.out.print("Enter your password:");
                    password = getInput.nextInt();
                }
            }
            System.out.println("Welcome " + name +
                    "\nWhat do you want to do today\n" +
                    "1) Withdrawal \n"+
                    "2) Transfer \n" +
                    "3) Check Balance \n"+
                    "4) Exit");
            String options;
            options = getInput.next();
            int counter =0;
            while(options != "4"){
                switch (options){
                    case "1":
                        withDraw();
                        break;
                    case "2":
                        transfer();
                        break;
                    case "3":
                        bankerBalance();
                        break;
                    default: System.out.println("You haven't chosen an option");
                        break;
                }
                System.out.println("Welcome " + name +
                        "\nWhat do you want to do today\n" +
                        "1) Withdrawal \n"+
                        "2) Transfer \n" +
                        "3) Check Balance \n"+
                        "4) Exit");
                options = getInput.next();
                counter++;
            }
            if(counter != 0){
                System.out.println("Thank you for Banking with us" + "\n Have a nice day (-_-)");
            }
    }
    public static void transfer(){
            System.out.println("Enter the receivers Account number:");
            int acctNumber = getInput.nextInt();
            if(acctNumber >= 5000){
                System.out.println("Input the correct password");
            }else{
                System.out.println("Enter the bank:");
                bankName = getInput.next();
                System.out.println("Amount:");
                double amt = getInput.nextDouble();
                bank.setWithDrawalBankerBalance(amt);
            }
            System.out.println("\t \t Receipt");
            System.out.println("_________________________________");
            System.out.print("Transaction to the account :" + acctNumber + "\n Bank:" + bankName + "\n Amount:" +
                    amount + " \t *** Was successful ***" + "\n \n Your current Balance is :"+ bank.getBankerBalance() +"\n");
    }
    public static void withDraw(){
            System.out.println("How much do you want to withdraw:");
            amount = getInput.nextDouble();
            bank.setWithDrawalBankerBalance(amount);
            System.out.println("Transaction Successful");
            System.out.println("\t Balance");
            System.out.println("Your current Balance is:" + bank.getBankerBalance() + "\n");
    }
    public static void bankerBalance(){
            System.out.println("Your Balance is :" + bank.getBankerBalance() +"\n");
    }
//    public void atmBalance(){
//
//    }
}
