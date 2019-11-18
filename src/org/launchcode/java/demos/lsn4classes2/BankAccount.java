package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {

    private double balance;
    private int accountNumber;
    private static int nextAccountNumber = 700;

    public BankAccount(double balance) {

        this.balance = balance;
        this.accountNumber = this.nextAccountNumber;
        this.nextAccountNumber++;

    }

    public double getBalance() {
        return this.balance;
    }

    public boolean withdrawal(double amount) {
        if (amount < this.balance && amount > 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public static void main(String[] args) {
        BankAccount AWAccount = new BankAccount(1000);
        System.out.println(AWAccount);
        System.out.println(AWAccount.withdrawal(50));
        System.out.println(AWAccount);
        BankAccount ChristianAccount = AWAccount;
        ChristianAccount.withdrawal(50);
        System.out.println(ChristianAccount);
    }

}
