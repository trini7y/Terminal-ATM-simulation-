package com.company;
import java.util.Scanner;
public class Main {
    public  Scanner getInput = new Scanner(System.in);
    public  ControlPanel bank = new ControlPanel();

    public  int password, masterPass, acctNumber;
    public  double amount;
    public  String name;
    String bankName;


    public  void main(String[] args) {
            System.out.println("Please Enter Your Name:");
            name = getInput.next();
            System.out.println("Enter your password:");
            password = getInput.nextInt();
            while(true){
                password = getInput.nextInt();
                if(password < 9999){
                    bank.setPassword(password);
                    break;
                }else{
                    System.out.println("Password most not exceed 4");
                }
            }
            System.out.println("Welcome " + name +
                    "What do you want to do today" +
                    "1) Withdrawal "+
                    "2) Transfer" +
                    "3) Check Balance"+
                    "4");
            String

            
    }
    public void transfer(double amt){
            System.out.println("Enter the receivers Account number:");
            acctNumber = getInput.nextInt();
            if(acctNumber >= 5000){
                System.out.println("Input the correct password");
            }else{
                System.out.println("Enter the bank:");
                bankName = getInput.next();
                System.out.println("Amount:");
                amt = getInput.nextDouble();
                bank.setWithDrawalBankerBalance(amt);
            }
            System.out.println("\t \t Receipt");
            System.out.println("_________________________________");
            System.out.print("Transaction to the account :" + acctNumber + "\n Bank:" + bankName + "\n Amount:" +
                    amount + " \t *** Was successful ***" + "\n \n Your current Balance is :"+ bank.getBankerBalance());

    }
    public void withDraw(double amt){
            System.out.println("How much do you want to withdraw:");
            amount = getInput.nextDouble();
            bank.setWithDrawalBankerBalance(amt);
            System.out.println("Transaction Successful");
            System.out.println("\t Balance");
            System.out.println("Your current Balance is:" + bank.getBankerBalance());
    }
    public void bankerBalance(){
            System.out.println("Your Balance is :" + bank.getBankerBalance());
    }
//    public void atmBalance(){
//
//    }
}
