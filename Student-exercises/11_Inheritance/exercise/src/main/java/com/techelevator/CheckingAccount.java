package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int withdrawAmount) {
        if (getBalance() - withdrawAmount > -100) {
            super.withdraw(withdrawAmount);
        } if (getBalance() < 0) {
            super.withdraw(10);
        } return getBalance();
    }
}
