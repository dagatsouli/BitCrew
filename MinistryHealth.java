import java.util.Scanner;

public class MinistryHealth extends Ministry {

    // Constructor
    public MinistryHealth() {
        super(
            "Ministry of Health",
            6_607_824_000L,    // regular budget
            7_745_824_000L     // investment budget
        );
    }

    // Override abstract method
    @Override
    public void showBudget() {        

        Scanner input = new Scanner(System.in);

        // === REGULAR BUDGET CATEGORIES ===
        long healthServicesBenefits = 2_342_138_000L;
        long transfers = 4_158_244_000L;
        long goodsAndServices = 104_679_000L;  
        long creditsUnderAllocation = 1_638_000L;
        long fixedAssets = 1_725_000L;    

        // === INVESTMENT BUDGET – NATIONAL PART ===
        long natOtherUnits = 16_000_000L;  
        long natRecoveryResilience = 503_000_000L;  
        long totalNatInvestment = natOtherUnits + natRecoveryResilience;

        // === INVESTMENT BUDGET – CO-FINANCED PART ===
        long cofOtherUnits = 46_000_000L;  
        long cofMigrationFlows = 4_000_000L;  
        long totalCofInvestment = cofOtherUnits + cofMigrationFlows;

        // Print main info
        printInfo();

        // --- REGULAR BUDGET ---
        System.out.print("Do you want to see Regular Budget analysis? (YES/NO): ");
        String answer1 = input.nextLine();

        if (answer1.equalsIgnoreCase("YES")) {
            System.out.println("\n--- REGULAR BUDGET CATEGORIES ---");
            System.out.println("Health Services & Benefits:   " + String.format("%,d EUR", healthServicesBenefits));
            System.out.println("Transfers:                    " + String.format("%,d EUR", transfers));
            System.out.println("Goods & Services:             " + String.format("%,d EUR", goodsAndServices));
            System.out.println("Credits under Allocation:     " + String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed Assets:                 " + String.format("%,d EUR", fixedAssets));
            System.out.println();
        }

        // --- INVESTMENT BUDGET ---
        System.out.print("Do you want to see Investment Budget analysis? (YES/NO): ");
        String answer2 = input.nextLine();

        if (answer2.equalsIgnoreCase("YES")) {
            System.out.println("\n=== INVESTMENT BUDGET – NATIONAL PART ===");
            System.out.println("Other Units of Ministry:      " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Fund:   " + String.format("%,d EUR", natRecoveryResilience));
            System.out.println("Total National Part:          " + String.format("%,d EUR", totalNatInvestment));

            System.out.println("\n=== INVESTMENT BUDGET – CO-FINANCED PART ===");
            System.out.println("Other Units of Ministry:      " + String.format("%,d EUR", cofOtherUnits));
            System.out.println("Migration Flows Expenses:     " + String.format("%,d EUR", cofMigrationFlows));
            System.out.println("Total Co-Financed Part:       " + String.format("%,d EUR", totalCofInvestment));
        } else {
            System.out.println("\nOK, no Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    // Main method
    public static void main(String[] args) {
        MinistryHealth mod = new MinistryHealth();
        mod.showBudget();
    }
}


