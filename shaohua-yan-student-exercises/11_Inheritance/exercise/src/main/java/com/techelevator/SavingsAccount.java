package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int withdrawAmount) {
        // based on test case 200 - (199+2) = 201 return balance
        if (withdrawAmount + 2 > getBalance()) {
            return getBalance();
        } else if (getBalance() - withdrawAmount < 150) {
            super.withdraw(withdrawAmount + 2);
        } else {
            super.withdraw(withdrawAmount);
        } return getBalance();
    }
}
