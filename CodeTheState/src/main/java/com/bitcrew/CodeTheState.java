package com.bitcrew;
import java.util.Scanner;

import com.bitcrew.General;
import com.bitcrew.Ministry;

import java.util.ArrayList;
import java.util.List;

public class CodeTheState {

    static long globalBalance = General.getBudgetBalance();

    static class BudgetChange {
        Ministry ministry;
        long before;
        long after;

        BudgetChange(Ministry ministry, long before, long after) {
            this.ministry = ministry;
            this.before = before;
            this.after = after;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MinistryOfInfrastructureAndTransport min1 = new MinistryOfInfrastructureAndTransport();
        MinistryOfNationalDefense min2 = new MinistryOfNationalDefense();
        MinistryOfEnvironmentAndEnergy min3 = new MinistryOfEnvironmentAndEnergy();
        MinistryOfTourism min4 = new MinistryOfTourism();
        MinistryHealth min5 = new MinistryHealth();
        MinistryOfEducationReligionsAndSports min6 = new MinistryOfEducationReligionsAndSports();

        System.out.println("The Prime Minister's decision is today! The whole country is waiting for you!");
        System.out.println("Press Enter to start...");
        input.nextLine();

        boolean keepRunning = true;

        while (keepRunning) {

            System.out.println("\n=====================================");
            System.out.println("1. View Revenues & Expenses");
            System.out.println("2. View Ministries");
            System.out.println("3. Adjust Ministries' Budgets");
            System.out.println("0. Exit");
            System.out.println("=====================================");
            System.out.print("Your choice: ");

            int choice;
            if (!input.hasNextInt()) {
                input.nextLine();
                continue;
            }
            choice = input.nextInt();
            input.nextLine();

            if (choice == 0) break;

            if (choice == 1) {
                General.showReport(input);
            }

            else if (choice == 2) {

                System.out.println("\n========== Ministries ==========");
                System.out.println("1. " + min1.getMinistry());
                System.out.println("2. " + min2.getMinistry());
                System.out.println("3. " + min3.getMinistry());
                System.out.println("4. " + min4.getMinistry());
                System.out.println("5. " + min5.getMinistry());
                System.out.println("6. " + min6.getMinistry());

                int m;
                while (true) {
                    System.out.print("Choose a Ministry (1-6): ");
                    if (input.hasNextInt()) {
                        m = input.nextInt();
                        input.nextLine();
                        if (m >= 1 && m <= 6) break;
                    } else input.nextLine();
                    System.out.println(">>> Invalid choice.");
                }

                Ministry selected = switch (m) {
                    case 1 -> min1;
                    case 2 -> min2;
                    case 3 -> min3;
                    case 4 -> min4;
                    case 5 -> min5;
                    case 6 -> min6;
                    default -> null;
                };

                if (selected != null) selected.showBudget(input);
            }

            else if (choice == 3) {

                long initialBalance = globalBalance;
                long remainingBalance = globalBalance;

                System.out.println("\n========== CURRENT STATE ==========");
                if (initialBalance > 0)
                    System.out.println("Status: SURPLUS (" + String.format("%,d", initialBalance) + " EUR)");
                else if (initialBalance < 0)
                    System.out.println("Status: DEFICIT (" + String.format("%,d", Math.abs(initialBalance)) + " EUR)");
                else
                    System.out.println("Status: BALANCED");
                System.out.println("===================================\n");

                List<BudgetChange> changes = new ArrayList<>();
                boolean modifying = true;

                while (modifying) {

                    System.out.println("Remaining balance indicator: " + String.format("%,d EUR", remainingBalance));

<<<<<<< HEAD
                    System.out.println("\nSelect a Ministry to modify (1 – 6) or 0 to stop:");
=======
                    System.out.println("\nSelect a Ministry to modify (1 - 6) or 0 to stop:");
>>>>>>> fdd6414b8aacf4364a9b41035cace314eefb3ab9
                    System.out.println("1. " + min1.getMinistry());
                    System.out.println("2. " + min2.getMinistry());
                    System.out.println("3. " + min3.getMinistry());
                    System.out.println("4. " + min4.getMinistry());
                    System.out.println("5. " + min5.getMinistry());
                    System.out.println("6. " + min6.getMinistry());
                    System.out.print("Your choice: ");

                    int m;
                    if (!input.hasNextInt()) { input.nextLine(); continue; }
                    m = input.nextInt();
                    input.nextLine();

                    if (m == 0) break;

                    Ministry selected = switch (m) {
                        case 1 -> min1;
                        case 2 -> min2;
                        case 3 -> min3;
                        case 4 -> min4;
                        case 5 -> min5;
                        case 6 -> min6;
                        default -> null;
                    };

                    if (selected == null) continue;

                    int typeChoice;
                    while (true) {
                        System.out.println("\nWhich budget?");
                        System.out.println("1 = Regular");
                        System.out.println("2 = Investment");
                        System.out.print("Your choice: ");

                        if (input.hasNextInt()) {
                            typeChoice = input.nextInt();
                            input.nextLine();
                            if (typeChoice == 1 || typeChoice == 2) break;
                        } else input.nextLine();

                        System.out.println(">>> Enter 1 or 2.");
                    }

                    int modType;
                    while (true) {
                        System.out.println("\n1 = Increase");
                        System.out.println("2 = Decrease");
                        System.out.print("Your choice: ");

                        if (input.hasNextInt()) {
                            modType = input.nextInt();
                            input.nextLine();
                            if (modType == 1 || modType == 2) break;
                        } else input.nextLine();

                        System.out.println(">>> Enter 1 or 2.");
                    }

                    long amount;
                    while (true) {
                        System.out.print("Enter amount (EUR): ");
                        if (input.hasNextLong()) {
                            amount = input.nextLong();
                            input.nextLine();

                            if (amount <= 0) {
                                System.out.println(">>> Must be positive.");
                                continue;
                            }

                            if (amount > General.TOTAL_EXPENSES) {
                                System.out.println(">>> Error: The amount entered is not realistic for the national economy.");
                                continue;
                            }

                            break;
                        } else {
                            input.nextLine();
                            System.out.println(">>> Invalid number.");
                        }
                    }

                    long signedAmount = (modType == 1 ? amount : -amount);

                    long beforeTotal = selected.getTotalBudget();

                    if (typeChoice == 1) {
                        long newRegular = selected.regularBudget + signedAmount;

                        if (newRegular < 0) {
                            System.out.println(">>> Error: Regular budget cannot go below 0.");
                            continue;
                        }

                        selected.regularBudget = newRegular;

                    } else {
                        long newInvestment = selected.investmentBudget + signedAmount;

                        if (newInvestment < 0) {
                            System.out.println(">>> Error: Investment budget cannot go below 0.");
                            continue;
                        }

                        selected.investmentBudget = newInvestment;
                    }

                    selected.totalBudget = selected.regularBudget + selected.investmentBudget;

                    if (modType == 1) { 
                        switch (m) {
                            case 1 -> System.out.println("Revenue increase allows the launch of new infrastructure projects and the modernization of transport systems.");
                            case 2 -> System.out.println("Higher revenue strengthens national defense through upgraded equipment and improved military training.");
                            case 3 -> System.out.println("Increased revenue supports renewable energy development and environmental protection programs.");
                            case 4 -> System.out.println("Higher revenue boosts international tourism promotion and improves tourism infrastructure.");
                            case 5 -> System.out.println("Increased revenue improves hospital equipment, supports new hires, and enhances healthcare services.");
                            case 6 -> System.out.println("Higher revenue allows school upgrades, university support, and increased funding for cultural programs.");
                        }
                    } else { 
                        switch (m) {
                            case 1 -> System.out.println("Revenue decrease leads to delays in infrastructure projects and reduced maintenance of transport networks.");
                            case 2 -> System.out.println("Lower revenue limits equipment upgrades and reduces military training programs.");
                            case 3 -> System.out.println("Decreased revenue slows down green energy projects and weakens environmental protection efforts.");
                            case 4 -> System.out.println("Lower revenue reduces tourism promotion and delays upgrades of tourist facilities.");
                            case 5 -> System.out.println("Reduced revenue causes staff shortages and limits hospital equipment upgrades.");
                            case 6 -> System.out.println("Lower revenue leads to underfunded schools, limited research support, and fewer cultural activities.");
                        }
                    }

                    long afterTotal = selected.getTotalBudget();

                    changes.add(new BudgetChange(selected, beforeTotal, afterTotal));

                    remainingBalance -= signedAmount;

                    System.out.println("\nUpdated:");
                    selected.printInfo();

                    System.out.print("\nModify another? (yes/no): ");
                    String cont = input.nextLine().trim();
                    if (!cont.equalsIgnoreCase("yes"))
                        modifying = false;
                }

                if (!changes.isEmpty()) {

                    System.out.println("\n========= SUMMARY OF CHANGES =========");

                    for (BudgetChange c : changes) {
                        long diff = c.after - c.before;

                        System.out.println("\nMinistry: " + c.ministry.getMinistry());
                        System.out.println("Before: " + String.format("%,d EUR", c.before));
                        System.out.println("After: " + String.format("%,d EUR", c.after));

                        if (diff >= 0)
                            System.out.println("Change: +" + String.format("%,d EUR", diff));
                        else
                            System.out.println("Change: -" + String.format("%,d EUR", Math.abs(diff)));
                    }

                    System.out.println("\nInitial Balance: " + String.format("%,d EUR", initialBalance));
                    System.out.println("Final Balance: " + String.format("%,d EUR", remainingBalance));

                    if (remainingBalance > 0)
                        System.out.println("Final Status: SURPLUS");
                    else if (remainingBalance < 0)
                        System.out.println("Final Status: DEFICIT");
                    else
                        System.out.println("Final Status: BALANCED");

                    System.out.println("======================================");
                }

                globalBalance = remainingBalance;
            }

            System.out.print("\nAnother action? (yes/no): ");
            String ans = input.nextLine();
            if (!ans.equalsIgnoreCase("yes")) keepRunning = false;
        }

        input.close();
        System.out.println("System shutting down...");
    }
}
