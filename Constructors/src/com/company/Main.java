package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("12345", 0, "Rudiger Debeaumarchais", "rbeau@mail.com", "0751234567");
        BankAccount my2ndAccount = new BankAccount();
        BankAccount my3rdAccount = new BankAccount("Tom Johnson", "mail@mail.com", "0769876543");

        myAccount.depositMoneyToAccount(1000);
        System.out.println(myAccount.getBalance());
        myAccount.depositMoneyToAccount(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawMoneyFromAccount(250);
        System.out.println(myAccount.getBalance());
        myAccount.depositMoneyToAccount(750);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawMoneyFromAccount(2000);
        System.out.println(myAccount.getBalance());

        System.out.println(myAccount);
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getPhoneNumber());

        System.out.println(my2ndAccount.getCustomerName());
        System.out.println(my2ndAccount.getPhoneNumber());

        System.out.println(my3rdAccount.getCustomerName());
        System.out.println(my3rdAccount.getAccountNumber());

        //CHALLENGE (VipCustomer class)
        VipCustomer celeb = new VipCustomer();
        VipCustomer star = new VipCustomer("C", "charlie@hbs.com");
        VipCustomer ace = new VipCustomer("Realt", 20000, "realt@ee.com");

        System.out.println("Name: " + celeb.getVipName() + "\nCard Limit: "
                + celeb.getCardLimit() + "\nEmail: " + celeb.getVipEmail());

        System.out.println("Name: " + star.getVipName() + "\nCard Limit: "
                + star.getCardLimit() + "\nEmail: " + star.getVipEmail());

        System.out.println("Name: " + ace.getVipName() + "\nCard Limit: "
                + ace.getCardLimit() + "\nEmail: " + ace.getVipEmail());

    }
}
