package org.example;

public class Expense {
    private String date;
    private String description;
    private double amount;

    public Expense(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Expense(date= %s, description= %s, amount= %.2f)", this.date, this.description, this.amount);
    }
}
