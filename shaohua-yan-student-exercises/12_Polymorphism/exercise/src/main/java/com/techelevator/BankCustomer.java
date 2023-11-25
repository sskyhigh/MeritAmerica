package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
    private String name;
    private String address;
    private String phoneNumber;

    private List<Accountable> accounts;

    public BankCustomer() {
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Accountable> accounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        // returns an array of the customer's accounts
        Accountable[] arrays = new Accountable[accounts.size()];
        for (int i = 0; i < arrays.length; ++i) {
            arrays[i] = accounts.get(i);
        } return arrays;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int balance = 0; for (Accountable account : accounts) {
            balance += account.getBalance();
        } return balance >= 25000;
    }

    @Override
    public int getBalance() {
        return getBalance();
    }
}
