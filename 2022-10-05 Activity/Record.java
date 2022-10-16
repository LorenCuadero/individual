import java.text.*;

public class Record<DataType> {

 //instance variables 
 private String name; 
 private int accountNum;
 private double balance;
 
 //the Account constructor
 public Record(String initName, int initId, double initBalance){
  
  name = initName;
  accountNum = initId;
  balance = initBalance;
 }

 //method to deposit a specified amount into the account 
 public void deposit(double amount){
  balance = balance + amount;
 }

 //method to withdraw a specified amount from the account
 public void withdraw(double amount, double fee){
  balance = balance - amount - fee;
 }

 //getter method to return balance
 public double getBalance(){
  return balance;
 } 
 
 //toString method that returns the accounts information
 public String toString(){
  String result = " ";
  NumberFormat fmt = NumberFormat.getCurrencyInstance();
  result = " Name: " + name + " Account Number: " + accountNum + " Balance: " + fmt.format(balance);
  return result;
  
 }
 public int getAccountNum() {
           return accountNum;
 }
 public void setAccountNum(int accountNum) {
           this.accountNum = accountNum;
 }

 
}