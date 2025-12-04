import java.util.Scanner;

public class MinistryOfTourism extends Ministry {

    public MinistryOfTourism() {
        super(
            "Ministry of Tourism",
            39_293_000L,     // Regular Budget
            150_000_000L     // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 14_521_000L;
        long socialBenefits = 800_000L;
        long transfers = 12_920_000L;
        long goodsAndServices = 10_502_000L;
        long fixedAssets = 550_000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natOtherUnits = 40_000_000L;
        long natOtherUnitsAllocation = 40_000_000L;
        long natResilienceFund = 109_000_000L;
        long natResilienceAllocation = 109_000_000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coOtherUnits = 1_000_000L;
        long coAllocation = 1_000_000L;

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
            System.out.println("Other Units: " +
                    String.format("%,d EUR", natOtherUnits));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", natOtherUnitsAllocation));
            System.out.println("Recovery & Resilience Facility Expenses: " +
                    String.format("%,d EUR", natResilienceFund));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", natResilienceAllocation));

            System.out.println("\n===== Investment Budget — Co-Financed Part =====");
            System.out.println("Other Units: " +
                    String.format("%,d EUR", coOtherUnits));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", coAllocation));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}
