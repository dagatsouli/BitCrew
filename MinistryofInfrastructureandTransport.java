import java.util.Scanner;

public class MinistryOfInfrastructureAndTransport extends Ministry {

    // Constructor
    public MinistryOfInfrastructureAndTransport() {
        super(
            "Ministry of Infrastructure and Transport",
            881_810_000L,     // regular budget
            1_813_000_000L    // investment budget
        );
    }

    @Override
    public void showBudget() {

        Scanner input = new Scanner(System.in);

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

        // Print main info
        printInfo();

        // --- REGULAR BUDGET ---
        System.out.print("\nDo you want to see the detailed Regular Budget categories? (yes/no): ");
        String answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Regular Budget Categories -----");
            System.out.println("Employee Benefits: " + String.format("%,d EUR", employeeBenefits));
            System.out.println("Social benefits: " + String.format("%,d EUR", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d EUR", transfers));
            System.out.println("Purchases of goods and services: " + String.format("%,d EUR", goodsAndServices));
            System.out.println("Subsidies: " + String.format("%,d EUR", subsidies));
            System.out.println("Other Expenses: " + String.format("%,d EUR", otherExpenses));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // --- INVESTMENT BUDGET ---
        System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();

        if (answer2.equals("yes")) {
            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Infrastructure: " + String.format("%,d EUR", generalSecretariatOfInfrastructure));
            System.out.println("General Secretariat of Transport: " + String.format("%,d EUR", generalSecretariatOfTransport));
            System.out.println("Other Service Units: " + String.format("%,d EUR", otherServiceUnits));
            System.out.println("Recovery And Resilience Fund Expenditures: " + String.format("%,d EUR", recoveryAndResilienceFundExpenditures));

            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Infrastructure: " + String.format("%,d EUR", coGeneralSecretariatOfInfrastructure));
            System.out.println("General Secretariat of Transport: " + String.format("%,d EUR", coGeneralSecretariatOfTransport));
            System.out.println("Other Service Units: " + String.format("%,d EUR", coOtherServiceUnits));
        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    public static void main(String[] args) {
        MinistryOfInfrastructureAndTransport mod = new MinistryOfInfrastructureAndTransport();
        mod.showBudget();
    }
}