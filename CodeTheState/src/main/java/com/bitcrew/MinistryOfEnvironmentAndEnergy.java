package com.bitcrew;
import java.util.Scanner;

import com.bitcrew.Ministry;

public class MinistryOfEnvironmentAndEnergy extends Ministry {

    public MinistryOfEnvironmentAndEnergy() {
        super(
            "Ministry of Environment and Energy",
            319_227_000L,      // Regular Budget
            2_022_000_000L     // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 99_679_000L;
        long socialBenefits = 2_733_000L;
        long transfers = 189_940_000L;
        long goodsAndServices = 19_928_000L;
        long creditsUnderAllocation = 6_680_000L;
        long fixedAssets = 267_000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natSpatialPlanning = 23_849_000L;
        long natEnergyMinerals = 29_628_000L;
        long natNaturalEnvironment = 3_739_000L;
        long natWasteManagement = 3_000_000L;
        long natForests = 9_760_000L;
        long natOtherUnits = 24_000L;
        long natRecoveryFund = 1_362_000_000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coSpatialPlanning = 67_100_000L;
        long coEnergyMinerals = 205_933_000L;
        long coNaturalEnvironment = 260_967_000L;
        long coWasteManagement = 47_750_000L;
        long coForests = 250_000L;
        long coOtherUnits = 8_000_000L;

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
            System.out.println("Employee Benefits: " +
                    String.format("%,d EUR", employeeBenefits));
            System.out.println("Social Benefits: " +
                    String.format("%,d EUR", socialBenefits));
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
            System.out.println("\n===== Investment Budget — National Part =====");
            System.out.println("Spatial Planning: " +
                    String.format("%,d EUR", natSpatialPlanning));
            System.out.println("Energy & Mineral Resources: " +
                    String.format("%,d EUR", natEnergyMinerals));
            System.out.println("Natural Environment & Water: " +
                    String.format("%,d EUR", natNaturalEnvironment));
            System.out.println("Waste Management: " +
                    String.format("%,d EUR", natWasteManagement));
            System.out.println("Forests: " +
                    String.format("%,d EUR", natForests));
            System.out.println("Other Units: " +
                    String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Fund: " +
                    String.format("%,d EUR", natRecoveryFund));

            System.out.println("\n===== Investment Budget — Co-Financed Part =====");
            System.out.println("Spatial Planning: " +
                    String.format("%,d EUR", coSpatialPlanning));
            System.out.println("Energy & Mineral Resources: " +
                    String.format("%,d EUR", coEnergyMinerals));
            System.out.println("Natural Environment & Water: " +
                    String.format("%,d EUR", coNaturalEnvironment));
            System.out.println("Waste Management: " +
                    String.format("%,d EUR", coWasteManagement));
            System.out.println("Forests: " +
                    String.format("%,d EUR", coForests));
            System.out.println("Other Units: " +
                    String.format("%,d EUR", coOtherUnits));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}
