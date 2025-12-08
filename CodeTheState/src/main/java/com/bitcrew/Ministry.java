package com.bitcrew;
import java.util.Scanner;

public abstract class Ministry {

    protected String ministry;
    protected long regularBudget;
    protected long investmentBudget;
    protected long totalBudget;

    // Constructor
    public Ministry(String ministry, long regularBudget, long investmentBudget) {
        this.ministry = ministry;
        this.regularBudget = regularBudget;
        this.investmentBudget = investmentBudget;
        this.totalBudget = regularBudget + investmentBudget;
    }

    // Getter methods
    public String getMinistry() {
        return ministry;
    }

    public long getRegularBudget() {
        return regularBudget;
    }

    public long getInvestmentBudget() {
        return investmentBudget;
    }

    public long getTotalBudget() {
        return totalBudget;
    }

    // ΝΕΕΣ ΜΕΘΟΔΟΙ: αύξηση προϋπολογισμών
    public void increaseRegularBudget(long amount) {
        if (amount <= 0) return;
        regularBudget += amount;
        totalBudget += amount;
    }

    public void increaseInvestmentBudget(long amount) {
        if (amount <= 0) return;
        investmentBudget += amount;
        totalBudget += amount;
    }

    public void printInfo() {
        System.out.println("=====================================");
        System.out.println(getMinistry() + " - Budget 2025");
        System.out.println("=====================================\n");

        System.out.println("Regular Budget: " + String.format("%,d EUR", getRegularBudget()));
        System.out.println("Public Investment Budget: " + String.format("%,d EUR", getInvestmentBudget()));
        System.out.println("Total: " + String.format("%,d EUR", getTotalBudget()));
    }

    public abstract void showBudget(Scanner input);
}
