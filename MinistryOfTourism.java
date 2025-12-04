import java.util.Scanner;

public class MinistryOfTourism extends Ministry {

    // Constructor
    public MinistryOfTourism() {
        super(
            "Ministry of Tourism",
            39_293_000L,     // regular budget
            150_000_000L     // investment budget
        );
    }

    @Override
    public void showBudget() {

        Scanner input = new Scanner(System.in);

        // === MAIN BUDGETS ===
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

        // Print main info (comes from abstract parent)
        printInfo();

        // === ASK FOR DETAILED REGULAR BUDGET ===
        System.out.print("\nDo you want to see the detailed Regular Budget categories? (yes/no): ");
        String answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Regular Budget Categories -----");
            System.out.println("Employee benefits: " + String.format("%,d EUR", employeeBenefits));
            System.out.println("Social benefits: " + String.format("%,d EUR", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d EUR", transfers));
            System.out.println("Purchases of goods and services: " + String.format("%,d EUR", goodsAndServices));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // === ASK FOR INVESTMENT BUDGET ===
        System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();

        if (answer2.equals("yes")) {

            // === NATIONAL PART ===
            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("Other Units: " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", natOtherUnitsAllocation));
            System.out.println("Recovery & Resilience Facility Expenses: " + String.format("%,d EUR", natResilienceFund));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", natResilienceAllocation));

            // === CO-FINANCED PART ===
            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("Other Units: " + String.format("%,d EUR", coOtherUnits));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", coAllocation));

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    public static void main(String[] args) {
        MinistryOfTourism mod = new MinistryOfTourism();
        mod.showBudget();
    }
}
