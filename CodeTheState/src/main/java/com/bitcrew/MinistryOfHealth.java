package com.bitcrew;
import java.util.Scanner;

import com.bitcrew.Ministry;

public class MinistryOfHealth extends Ministry {

    public MinistryOfHealth() {
        super(
            "Ministry of Health",
            6_607_824_000L,   // Regular Budget
            7_745_824_000L    // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

        // === REGULAR BUDGET CATEGORIES ===
        long healthServicesBenefits = 2_342_138_000L;
        long transfers = 4_158_244_000L;
        long goodsAndServices = 104_679_000L;
        long creditsUnderAllocation = 1_638_000L;
        long fixedAssets = 1_725_000L;

        // === INVESTMENT BUDGET – NATIONAL PART ===
        long natOtherUnits = 16_000_000L;
        long natRecoveryResilience = 503_000_000L;

        // === INVESTMENT BUDGET – CO-FINANCED PART ===
        long cofOtherUnits = 46_000_000L;
        long cofMigrationFlows = 4_000_000L;

        // === BASIC INFO ===
        printInfo();

        // ===== REGULAR BUDGET DETAIL =====
        String regularAnswer;

        while (true) {
            System.out.print("\nDo you want to see the detailed Regular Budget categories? (yes/no): ");
            regularAnswer = input.nextLine().trim();

            if (regularAnswer.equalsIgnoreCase("yes") || regularAnswer.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println(">>> Invalid answer. Please type 'yes' or 'no'.");
            }
        }

        if (regularAnswer.equalsIgnoreCase("yes")) {
            System.out.println("\n----- Detailed Regular Budget Categories -----");
            System.out.println("Health Services & Benefits: " +
                    String.format("%,d EUR", healthServicesBenefits));
            System.out.println("Transfers: " +
                    String.format("%,d EUR", transfers));
            System.out.println("Goods & Services: " +
                    String.format("%,d EUR", goodsAndServices));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed Assets: " +
                    String.format("%,d EUR", fixedAssets));
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("\nOK. Regular Budget details skipped.");
        }

        // ===== INVESTMENT BUDGET DETAIL =====
        String investmentAnswer;

        while (true) {
            System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
            investmentAnswer = input.nextLine().trim();

            if (investmentAnswer.equalsIgnoreCase("yes") || investmentAnswer.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println(">>> Invalid answer. Please type 'yes' or 'no'.");
            }
        }

        if (investmentAnswer.equalsIgnoreCase("yes")) {
            System.out.println("\n===== Investment Budget – National Part =====");
            System.out.println("Other Units of Ministry: " +
                    String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Fund: " +
                    String.format("%,d EUR", natRecoveryResilience));

            System.out.println("\n===== Investment Budget – Co-Financed Part =====");
            System.out.println("Other Units of Ministry: " +
                    String.format("%,d EUR", cofOtherUnits));
            System.out.println("Migration Flows Expenses: " +
                    String.format("%,d EUR", cofMigrationFlows));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}
