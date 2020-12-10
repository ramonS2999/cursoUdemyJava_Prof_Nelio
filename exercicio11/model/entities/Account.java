package exercicio11.model.entities;

import exercicio11.model.exceptions.DomainException;

public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws DomainException {
        if (withdrawLimit < amount) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (balance < amount) {
            throw new DomainException("Not enough balance");
        }
        
        balance -= amount;
    }

    @Override
    public String toString() {
        return "New balance: " + balance;
    }
    
}
