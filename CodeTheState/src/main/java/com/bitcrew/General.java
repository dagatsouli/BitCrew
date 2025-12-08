package com.bitcrew;
import java.util.Scanner;

public class General {

    // συνολικά ποσά (για απλό έλεγχο πλεονάσματος)
    public static final long TOTAL_REVENUES  = 1_304_827_000_000L;
    public static final long TOTAL_EXPENSES  = 1_307_907_506_000L;

    // διαφορά > 0 => πλεόνασμα, < 0 => έλλειμμα
    public static long getBudgetBalance() {
        return TOTAL_REVENUES - TOTAL_EXPENSES;
    }

    public static void showReport(Scanner input) {

        System.out.println(
            "The total revenues of Greece, based on the state budget for 2025, amount to "
            + String.format("%,d EUR.", TOTAL_REVENUES)
        );
        System.out.println(
            "The total expenditures of Greece, based on the state budget for 2025, amount to "
            + String.format("%,d EUR.", TOTAL_EXPENSES)
        );

        // === REVENUES ===
        long taxes = 62_055_000_000L;
        long socialContributions = 60_000_000L;
        long transfers = 8_131_000_000L;
        long salesOfGoods = 2_405_000_000L;
        long otherCurrentRevenues = 2_775_000_000L;
        long fixedAssets = 37_000_000L;
        long equitySecuritiesAndInvestment = 467_000_000L;
        long liabilitiesFromCurrency = 66_000_000L;
        long debtSecurities = 25_984_000_000L;
        long loans = 1_202_047_000_000L;
        long financialDerivatives = 800_000_000L;

        // === EXPENSES ===
        long employeeBenefits = 14_889_199_000L;
        long socialBenefits = 425_136_000L;
        long transfersExpenses = 34_741_365_000L;
        long purchasesGoodsServices = 2_039_542_000L;
        long subsidies = 80_630_000L;
        long interest = 7_701_101_000L;
        long otherExpenses = 101_553_000L;
        long allocatedCredits = 17_283_053_000L;
        long fixedAssetsExpenses = 2_609_600_000L;
        long valuables = 85_000L;
        long loansExpenses = 3_741_000_000L;
        long equitySecuritiesExpenses = 1_755_112_000L;
        long debtSecuritiesExpenses = 19_375_000_000L;
        long loans2Expenses = 1_203_165_130_000L;

        // ===== REVENUES DETAIL =====
        String revenueAnswer;

        while (true) {
            System.out.print("\nDo you want to see the detailed version of the Revenues? (yes/no): ");
            revenueAnswer = input.nextLine().trim();

            if (revenueAnswer.equalsIgnoreCase("yes") || revenueAnswer.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println(">>> Invalid answer. Please type 'yes' or 'no'.");
            }
        }

        if (revenueAnswer.equalsIgnoreCase("yes")) {
            System.out.println("\n----- Detailed Version of the Revenues -----");
            System.out.println("Taxes: " + String.format("%,d EUR", taxes));
            System.out.println("Social contributions: " + String.format("%,d EUR", socialContributions));
            System.out.println("Transfers: " + String.format("%,d EUR", transfers));
            System.out.println("Sales of goods and services: " + String.format("%,d EUR", salesOfGoods));
            System.out.println("Other current revenues: " + String.format("%,d EUR", otherCurrentRevenues));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
            System.out.println("Debt securities: " + String.format("%,d EUR", debtSecurities));
            System.out.println("Loans: " + String.format("%,d EUR", loans));
            System.out.println("Equity securities and investment: " +
                    String.format("%,d EUR", equitySecuritiesAndInvestment));
            System.out.println("Liabilities from currency: " +
                    String.format("%,d EUR", liabilitiesFromCurrency));
            System.out.println("Financial derivatives: " +
                    String.format("%,d EUR", financialDerivatives));
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Revenues will be displayed.");
        }

        // ===== EXPENSES DETAIL =====
        String expenseAnswer;

        while (true) {
            System.out.print("\nDo you want to see the detailed version of the Expenses? (yes/no): ");
            expenseAnswer = input.nextLine().trim();

            if (expenseAnswer.equalsIgnoreCase("yes") || expenseAnswer.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println(">>> Invalid answer. Please type 'yes' or 'no'.");
            }
        }

        if (expenseAnswer.equalsIgnoreCase("yes")) {
            System.out.println("\n----- Detailed Version of the Expenses -----");
            System.out.println("Employee benefits: " + String.format("%,d EUR", employeeBenefits));
            System.out.println("Social benefits: " + String.format("%,d EUR", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d EUR", transfersExpenses));
            System.out.println("Purchases of goods and services: " + String.format("%,d EUR", purchasesGoodsServices));
            System.out.println("Subsidies: " + String.format("%,d EUR", subsidies));
            System.out.println("Interest: " + String.format("%,d EUR", interest));
            System.out.println("Other expenses: " + String.format("%,d EUR", otherExpenses));
            System.out.println("Allocated credits: " + String.format("%,d EUR", allocatedCredits));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssetsExpenses));
            System.out.println("Valuables: " + String.format("%,d EUR", valuables));
            System.out.println("Loans: " + String.format("%,d EUR", loansExpenses));
            System.out.println("Equity Securities Expenses: " +
                    String.format("%,d EUR", equitySecuritiesExpenses));
            System.out.println("Debt Securities Expenses: " +
                    String.format("%,d EUR", debtSecuritiesExpenses));
            System.out.println("Loans 2 Expenses: " +
                    String.format("%,d EUR", loans2Expenses));
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Expenses will be displayed.");
        }
    }
}
