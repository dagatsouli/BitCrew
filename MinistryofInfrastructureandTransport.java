import java.util.Scanner;

public class MinistryofInfrastructureandTransport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ministry = "Ministry of Infrastructure and Transport";
        int year = 2025;

        // === MAIN BUDGETS ===
        long regularBudget = 881810000L;
        long investmentBudget = 1813000000L;
        long total = regularBudget + investmentBudget;

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 125154000L;
        long socialBenefits = 491000L;
        long transfers = 638422000L;
        long goodsAndServices = 42804000L;
        long subsidies = 62000000L;
        long otherExpenses = 20000L;
        long fixedAssets = 12919000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long generalSecretariatofInfrastructure = 493635000L;
        long generalSecretariatofTransport = 180320000L;
        long otherServiceUnits = 6045000L;
        long recoveryAndResilienceFundExpenditures = 393000000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coGeneralSecretariatofInfrastructure = 547245000L;
        long coGeneralSecretariatofTransport = 192740000L;
        long coOtherServiceUnits = 15000L;

        System.out.println("=====================================");
        System.out.println(ministry + " - Budget " + year);
        System.out.println("=====================================\n");

        // Show only 3 main categories first
        System.out.println("Regular Budget: " + String.format("%,d €", regularBudget));
        System.out.println("Public Investment Budget: " + String.format("%,d €", investmentBudget));
        System.out.println("Total: " + String.format("%,d €", total));

        // === ASK FOR DETAILED REGULAR BUDGET ===
        System.out.print("\nDo you want to see the detailed Regular Budget categories? (yes/no): ");
        String answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Regular Budget Categories -----");
            System.out.println("Employee Benefits: " + String.format("%,d €", employeeBenefits));
            System.out.println("Social benefits: " + String.format("%,d €", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d €", transfers));
            System.out.println("Purchases of goods and services: " + String.format("%,d €", goodsAndServices));
            System.out.println("Subsidies: " + String.format("%,d €", subsidies));
            System.out.println("Other Expenses: " + String.format("%,d €", otherExpenses));
            System.out.println("Fixed assets: " + String.format("%,d €", fixedAssets));
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
            System.out.println("General Secretariat of Infrastructure: " + String.format("%,d €", generalSecretariatofInfrastructure));
            System.out.println("General Secretariat of Transport: " + String.format("%,d €", generalSecretariatofTransport));
            System.out.println("Other Service Units: " + String.format("%,d €", otherServiceUnits));
            System.out.println("Recovery And Resilience Fund Expenditures: " + String.format("%,d €", recoveryAndResilienceFundExpenditures));

            // === CO-FINANCED PART ===
            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Infrastructure: " + String.format("%,d €", coGeneralSecretariatofInfrastructure));
            System.out.println("General Secretariat of Transport: " + String.format("%,d €", coGeneralSecretariatofTransport));
            System.out.println("Other Service Units: " + String.format("%,d €", coOtherServiceUnits));

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }
}