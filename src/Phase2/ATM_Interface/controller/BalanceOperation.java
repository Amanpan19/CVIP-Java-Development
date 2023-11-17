package Phase2.ATM_Interface.controller;

import Phase2.ATM_Interface.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalanceOperation {
     Scanner sc = new Scanner(System.in);

     List<User> users = new ArrayList<>();

     public List<User> addUser(User userData){

         boolean userExist = false;
         for(User user : users ){
             if(user.getAccNum()==userData.getAccNum()){
                 System.out.println("User already exist...!");
                 userExist = true;
                 break;
             }
         }
         if(!userExist){
             users.add(userData);
             System.out.println("Your Account has been created..!");
             System.out.println("Your Account Number is : "+userData.getAccNum());
         }
        return users;
     }

     public void getUser(long accNum, int pin){
         boolean userExist = false;

         for(User user:users){
             if(user.getAccNum()==accNum && user.getPassword()==pin){
                 displayUser(user);
                 userExist = true;
                 break;
             }
         }
         if(!userExist){
             System.out.println("Check the PIN and Account Number Again..!");
         }
     }

     public void deposit(double amount,long accNum,int pin){
         boolean userExist = false;

         for(User user:users){
             if(user.getAccNum()==accNum && user.getPassword()==pin){
                double currentAmt =  user.getBalance();
                double updatedAmt = currentAmt+amount;
                user.setBalance(updatedAmt);
                 System.out.println("Money deposited successfully..!");
                 displayUser(user);
                 userExist = true;
                 break;
             }
         }
         if(!userExist){
             System.out.println("Check the PIN and Account Number Again..!");
         }
     }

    public void withdrawMoney(double amount,long accNum, int pin){
        boolean userExist = false;

        for(User user:users){
            if(user.getAccNum()==accNum && user.getPassword()==pin){
                double currentAmt =  user.getBalance();
                while (amount>currentAmt){
                    System.out.println("Entered Amount is greater then the available balance..");
                    System.out.println("Your current balance is : "+currentAmt);
                    System.out.println();
                    System.out.print("Enter the new Amount : ");
                    amount = sc.nextDouble();
                }
                double updatedAmt = currentAmt-amount;
                user.setBalance(updatedAmt);
                System.out.println("Amount deducted successfully..!");
                displayUser(user);
                userExist = true;
                break;
            }
        }
        if(!userExist){
            System.out.println("Check the PIN and Account Number Again..!");
        }
    }

    public void changePIN(long accNum, int pin){
         for(User user:users){
             if(accNum== user.getAccNum() && pin==user.getPassword()){
                 System.out.print("Enter the new PIN: ");
                 int newPin = sc.nextInt();
                 System.out.print("Confirm the new PIN again: ");
                 int againPIN = sc.nextInt();
                 if(newPin==againPIN){
                     user.setPassword(newPin);
                     System.out.println("Your PIN have been Changed..! 😶🔥");
                 }
             }
         }
    }

    public void displayUser(User user){
        System.out.println("+-------------------------------------------------------------------+");
        System.out.format("|\t%-20s|\t%-20s|\t%-16s|\n","Account Holder","Account Number","Balance");
        System.out.println("+-------------------------------------------------------------------+");
        System.out.format("|\t%-20s|\t%-20d|\t%-16s|\n",user.getUserName(),user.getAccNum(),user.getBalance());
        System.out.println("+-------------------------------------------------------------------+");
    }
}
