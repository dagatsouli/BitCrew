package com.bitcrew;
import java.util.Scanner;

import com.bitcrew.Ministry;

public class MinistryOfInfrastructureAndTransport extends Ministry {

    public MinistryOfInfrastructureAndTransport() {
        super(
            "Ministry of Infrastructure and Transport",
            881_810_000L,     // Regular Budget
            1_813_000_000L    // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 125_154_000L;
        long socialBenefits = 491_000L;
        long transfers = 638_422_000L;
        long goodsAndServices = 42_804_000L;
        long subsidies = 62_000_000L;
        long otherExpenses = 20_000L;
        long fixedAssets = 12_919_000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long generalSecretariatOfInfrastructure = 493_635_000L;
        long generalSecretariatOfTransport = 180_320_000L;
        long otherServiceUnits = 6_045_000L;
        long recoveryAndResilienceFundExpenditures = 393_000_000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coGeneralSecretariatOfInfrastructure = 547_245_000L;
        long coGeneralSecretariatOfTransport = 192_740_000L;
        long coOtherServiceUnits = 15_000L;

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
            System.out.println("Employee Benefits: " + String.format("%,d EUR", employeeBenefits));
            System.out.println("Social Benefits: " + String.format("%,d EUR", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d EUR", transfers));
            System.out.println("Goods & Services: " + String.format("%,d EUR", goodsAndServices));
            System.out.println("Subsidies: " + String.format("%,d EUR", subsidies));
            System.out.println("Other Expenses: " + String.format("%,d EUR", otherExpenses));
            System.out.println("Fixed Assets: " + String.format("%,d EUR", fixedAssets));
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
            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Infrastructure: " +
                    String.format("%,d EUR", generalSecretariatOfInfrastructure));
            System.out.println("General Secretariat of Transport: " +
                    String.format("%,d EUR", generalSecretariatOfTransport));
            System.out.println("Other Service Units: " +
                    String.format("%,d EUR", otherServiceUnits));
            System.out.println("Recovery & Resilience Fund: " +
                    String.format("%,d EUR", recoveryAndResilienceFundExpenditures));

            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Infrastructure: " +
                    String.format("%,d EUR", coGeneralSecretariatOfInfrastructure));
            System.out.println("General Secretariat of Transport: " +
                    String.format("%,d EUR", coGeneralSecretariatOfTransport));
            System.out.println("Other Service Units: " +
                    String.format("%,d EUR", coOtherServiceUnits));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}