package com.company;
import java.util.Scanner;

public class ControlPanel {
        private double bankerBalance = 20000;
        private double atmBalance = 1000000;
        private String firstName;
        private int password, masterPassCode;
        public int counter = 0;
        private Scanner Scan = new Scanner(System.in);

        public double getBankerBalance() {
                return bankerBalance;
        }
        public void setDebitBankerBalance(double debitBankerBalance){
                this.bankerBalance += debitBankerBalance;
        }
        public void setWithDrawalBankerBalance(double creditBankerBalance){
                if( (this.bankerBalance  - creditBankerBalance) < 0){
                        System.out.println("Insufficient fund");
                }
                else{
                        this.bankerBalance -= creditBankerBalance;
                }
        }

        public double getAtmBalance() {
                return atmBalance;
        }
        public void setDebitAtmBalance(double atmBalance){
                masterPassCode = Scan.nextInt();
                while (masterPassCode != 10101010) {
                        System.out.println("Please input the correct password");
                        masterPassCode = Scan.nextInt();
                        counter++;
                        if(counter == 3){
                                System.out.println("You have exceeded the password");
                        }
                        if (masterPassCode == 10101010) {
                                this.atmBalance += atmBalance;
                                break;
                        }
                }

        }
        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public int getPassword() {
                return password;
        }

        public void setPassword(int password) {
                this.password = password;
        }
}
