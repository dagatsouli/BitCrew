package com.bitcrew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class of the application that simulates the management
 * of the national budget and government ministries.
 *
 * <p>The user can view revenues, adjust ministry budgets,
 * apply VAT changes and compare the budget with other EU countries.</p>
 */

public final class CodeTheState {
    /** Current VAT rate (24%). */
    private static double vatRate = 0.24;
    /** Total tax revenues of the state. */
    private static long taxes =  IncomeAndOutcome.TOTAL_REVENUES;
    /** Total global balance of the state. */
    private static long globalBalance = IncomeAndOutcome.getBudgetBalance();

/**
 * Stores information about a change in a ministry's budget.
 */

    private static class BudgetChange {
        /** The ministry that was modified. */
        private final Ministry ministry;

        /** Budget before the change. */
        private final long before;

        /** Budget after the change. */
        private final long after;

        BudgetChange(Ministry ministry, long before, long after) {
            this.ministry = ministry;
            this.before = before;
            this.after = after;
        }
    }

    private CodeTheState() {
        // Prevent instantiation
    }

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments (not used)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MinistryOfInfrastructureAndTransport min1 = new MinistryOfInfrastructureAndTransport();
        MinistryOfNationalDefense min2 = new MinistryOfNationalDefense();
        MinistryOfEnvironmentAndEnergy min3 = new MinistryOfEnvironmentAndEnergy();
        MinistryOfTourism min4 = new MinistryOfTourism();
        MinistryOfHealth min5 = new MinistryOfHealth();
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
            System.out.println("4. Compare with EU Budgets");
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
                IncomeAndOutcome.showReport(input);
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
                    System.out.println("\nSelect a Ministry to modify (1 - 6) or 0 to stop:");
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

                            if (amount > IncomeAndOutcome.TOTAL_EXPENSES) {
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

                // In macroeconomic terms, a deficit or surplus up to 1 billion EUR
                // is considered balanced in Greece.
                
                if (remainingBalance < -1_000_000_000L) {

                    System.out.println("\n Uh-oh! Your budget is in the red by more than 1 billion! (" +
                            String.format("%,d EUR", Math.abs(remainingBalance)) + ")");

                    String increaseVAT;
                    while (true) {
                        System.out.print("There is a trick to fix it: you can boost revenues by increasing VAT. Want to try it? (yes/no): ");
                        increaseVAT = input.nextLine().trim();
                        if (increaseVAT.equalsIgnoreCase("yes") || increaseVAT.equalsIgnoreCase("no")) break;
                        else System.out.println(">>> Please answer 'yes' or 'no'.");
                    }

                    if (increaseVAT.equalsIgnoreCase("yes")) {

                        double vatPercent;

                        while (true) {
                            System.out.print("How much do you want to raise the VAT? ");
                            String vatInput = input.nextLine().trim();

                            try {
                                vatPercent = Double.parseDouble(vatInput);

                                if (vatPercent < 0) {
                                    System.out.println(">>> VAT increase must be positive.");
                                    continue;
                                } else if (vatPercent == 0.00) {
                                    System.out.println("Okay, the budget will not be increased");
                                    break;
                                }

                                double availableIncrease = 27.0 - (vatRate * 100);

                                if (vatPercent > availableIncrease) {
                                    System.out.println(
                                            ">>> You can increase VAT only by up to "
                                                    + String.format("%.2f", availableIncrease)
                                                    + "% (maximum VAT is 27%)."
                                    );
                                    continue;
                                }

                                break;

                            } catch (NumberFormatException e) {
                                System.out.println(">>> Hmm, that doesn't look like a valid number. Try a decimal number.");
                            }
                        }

                        long taxesBefore = taxes;
                        //ΑΠΟ ΤΟ ΣΥΝΟΛΟ ΤΩΝ ΦΟΡΟΛΟΓΙΚΩΝ ΕΣΟΔΩΝ ΤΗΣ ΕΛΛΑΔΑΣ, ΤΟ 38,3% ΠΡΟΕΡΧΟΝΤΑΙ ΑΠΟ ΤΟΝ ΦΠΑ
                        long taxesAfter = (long) (taxesBefore + taxesBefore * 0.383 * (vatPercent / 100.0));

                        vatRate += vatPercent / 100.0;
                        taxes = taxesAfter;

                        long revenuesBefore = IncomeAndOutcome.TOTAL_REVENUES;
                        long revenuesAfter = revenuesBefore - taxesBefore + taxesAfter;
                        long newBalance = revenuesAfter - IncomeAndOutcome.TOTAL_EXPENSES;

                        System.out.println("\n Revenues before VAT increase: " + String.format("%,d EUR", revenuesBefore));
                        System.out.println(" Revenues after VAT increase: " + String.format("%,d EUR", revenuesAfter));
                        System.out.println(" Difference: " + String.format("%,d EUR", revenuesAfter - revenuesBefore));
                        System.out.println(" New budget balance: " + String.format("%,d EUR", newBalance));

                        globalBalance = newBalance;

                    } else {
                        System.out.println("Alright, budget stays as is.");
                    }
                } else if (remainingBalance > 1_000_000_000L) {

                    System.out.println("\n🎉 Great news, Prime Minister!");
                    System.out.println("You have a surplus of "
                            + String.format("%,d EUR", remainingBalance) + " (over 1 billion!)");

                    String answer;
                    while (true) {
                        System.out.print(
                                "Feeling generous? Want to reduce VAT and give citizens a break? (yes/no): "
                        );
                        answer = input.nextLine().trim();

                        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                            break;
                        } else {
                            System.out.println(">>> Please answer only 'yes' or 'no'.");
                        }
                    }

                    if (answer.equalsIgnoreCase("yes")) {

                        while (true) {
                            System.out.print(
                                    "\nBy how many percentage points do you want to reduce VAT? "
                                     + "(Current VAT: " + (vatRate * 100) + "%): "
                            );

                            if (!input.hasNextDouble()) {
                                input.nextLine();
                                System.out.println(">>> Numbers only, please!");
                                continue;
                            }

                            double reduction = input.nextDouble();
                            input.nextLine();

                            // έλεγχος θεσμικού ορίου 15%
                            if (vatRate - reduction / 100.0 < 0.15) {
                                System.out.println(
                                        "❌ You can't do that! VAT cannot drop below 15% "
                                                + "due to EU regulations."
                                );
                                continue;
                            }

                            // ===== APPLY VAT REDUCTION =====
                            long oldTaxes = taxes;

                            vatRate -= reduction / 100.0;
                            taxes = (long) (taxes - taxes * 0.383 * (reduction / 100.0));

                            long newTaxes = taxes;
                            long revenueDifference = newTaxes - oldTaxes;
                            remainingBalance += revenueDifference;

                            System.out.println("\n✨ VAT reduction successful!");
                            System.out.println("Revenues before: " + String.format("%,d EUR", oldTaxes));
                            System.out.println("Revenues after: " + String.format("%,d EUR", newTaxes));
                            System.out.println("Revenue change: " + String.format("%,d EUR", revenueDifference));
                            System.out.println("New balance: " + String.format("%,d EUR", remainingBalance));
                            System.out.println("New VAT rate: " + (vatRate * 100) + "%");

                            break;
                        }

                    } else {
                        System.out.println("\nAlright! The surplus stays untouched. Stability first! 🏛️");
                    }
                } else {
                    System.out.println("Your budget is considered balanced in macroeconomic terms!");
                }

                globalBalance = remainingBalance;

            }

            else if (choice == 4) {
                System.out.println("\n========== Comparison with budgets of other European Union counrties ==========");

                // Δεδομένα ΕΕ: πλεονάσματα/ελλείμματα ως ποσοστό του ΑΕΠ σύμφωνα με τη EuroStat
                Map<String, Double> euBudgets = new HashMap<>();
                euBudgets.put("Germany", -3.3);
                euBudgets.put("France", -5.4);
                euBudgets.put("Italy", -3.0);
                euBudgets.put("Spain", -2.5);
                euBudgets.put("Greece", 0.0);
                euBudgets.put("Portugal", -3.0);
                euBudgets.put("Cyprus", 2.7);
                euBudgets.put("Romania", -8.6);

                /*Θεωρούμε ότι ο προυπολογισμός της χώρας παραμένει σταθερός και δεν επηρεάζεται από
                τις αλλαγές του ΦΠΑ (ισχύει ceteris paribus)*/
                double gdpGreece = 242_000_000_000.0;

                // globalBalance περιέχει τα αποτελέσματα των αλλαγών που έκανε ο χρήστης
                double greeceBalance = (double) globalBalance;

                // Ποσοστό πλεονάσματος/ελλείμματος Ελλάδας ως % του ΑΕΠ
                double greecePercent = (greeceBalance / gdpGreece) * 100.0;
                euBudgets.put("Greece", greecePercent);

                // Ταξινόμηση κατά φθίνουσα σειρά
                List<Map.Entry<String, Double>> sortedList = new ArrayList<>(euBudgets.entrySet());
                sortedList.sort((a,b) -> Double.compare(b.getValue(), a.getValue()));

                System.out.println("\nSurpluses/Deficits of EU countries as  % of GDP (2025):");
                for (Map.Entry<String, Double> entry : sortedList) {
                    String country = entry.getKey();
                    double percent = entry.getValue();
                    String sign = percent >= 0 ? "+" : "-";
                    System.out.printf("%-10s: %s%.2f%%\n", country, sign, Math.abs(percent));
                }

            }
            String ans;
            while (true) {
                System.out.print("\nAnother action? (yes/no): ");
                ans = input.nextLine().trim();
                if (ans.equalsIgnoreCase("yes")) {
                    break;
                } else if (ans.equalsIgnoreCase("no")) {
                    keepRunning = false;
                    break;
                } else {
                    System.out.println(">>> Please answer only 'yes' or 'no'.");
                }
            }
        }

        input.close();
        System.out.println("System shutting down...");
    }
}
