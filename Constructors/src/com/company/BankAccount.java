package com.company;

/**
 * Created on 18/08/2016.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //creating constructor

    public BankAccount() {
        this("0000", 0, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor");
        //if empty constructor is called create the above default values
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        //or setNumber(accountNumber) etc for all the below but does not always work with inheritance
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("00000", 0, customerName, email, phoneNumber); //defaults and set versions combined
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return  this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositMoneyToAccount(double depositAmount) {
        this.balance += depositAmount;
        System.out.println(depositAmount + " deposited, new balance is " + this.balance);
    }

    public void withdrawMoneyFromAccount(double withdrawalAmount) {
        if(withdrawalAmount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(withdrawalAmount + " withdrawn, new balance is " + this.balance);
        }
    }
}
