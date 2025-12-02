import java.util.Scanner;

public class MinistryOfTourism {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ministry = "Ministry of Tourism";
        int year = 2025;

        // === MAIN BUDGETS ===
        long regularBudget = 39293000L;          // Regular Budget
        long investmentNational = 149000000L;    // Public Investment Budget - National Part
        long investmentCofinanced = 1000000L;    // Public Investment Budget - Co-Financed Part
        long investmentBudget = investmentNational + investmentCofinanced;
        long total = regularBudget + investmentBudget;

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 14521000L;
        long socialBenefits = 800000L;
        long transfers = 12920000L;
        long goodsAndServices = 10502000L;
        long fixedAssets = 550000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natOtherUnits = 40000000L;
        long natOtherUnitsAllocation = 40000000L;
        long natResilienceFund = 109000000L;
        long natResilienceAllocation = 109000000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coOtherUnits = 1000000L;
        long coAllocation = 1000000L;

        System.out.println("=====================================");
        System.out.println(ministry + " - Budget " + year);
        System.out.println("=====================================\n");

        // Show only 3 main categories first
        System.out.println("Regular Budget: " + String.format("%,d EUR", regularBudget));
        System.out.println("Public Investment Budget: " + String.format("%,d EUR", investmentBudget));
        System.out.println("Total: " + String.format("%,d EUR", total));

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
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // === ASK FOR DETAILED INVESTMENT BUDGET ===
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
}

