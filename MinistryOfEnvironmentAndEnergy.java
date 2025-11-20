import java.util.Scanner;

public class MinistryOfEnvironmentAndEnergy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ministry = "Ministry of Environment and Energy";
        int year = 2025;

        // === MAIN BUDGETS ===
        long regularBudget = 319227000L;
        long investmentBudget = 2022000000L;
        long total = regularBudget + investmentBudget;

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 99679000L;
        long socialBenefits = 2733000L;
        long transfers = 189940000L;
        long goodsAndServices = 19928000L;
        long creditsUnderAllocation = 6680000L;
        long fixedAssets = 267000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natSpatialPlanning = 23849000L;
        long natEnergyMinerals = 29628000L;
        long natNaturalEnvironment = 3739000L;
        long natWasteManagement = 3000000L;
        long natForests = 9760000L;
        long natOtherUnits = 24000L;
        long natRecoveryFund = 1362000000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coSpatialPlanning = 67100000L;
        long coEnergyMinerals = 205933000L;
        long coNaturalEnvironment = 260967000L;
        long coWasteManagement = 47750000L;
        long coForests = 250000L;
        long coOtherUnits = 8000000L;

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
            System.out.println("Credits under allocation: " + String.format("%,d EUR", creditsUnderAllocation));
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
            System.out.println("General Secretariat of Spatial Planning: " + String.format("%,d EUR", natSpatialPlanning));
            System.out.println("General Secretariat for Energy & Mineral Resources: " + String.format("%,d EUR", natEnergyMinerals));
            System.out.println("General Secretariat of Natural Environment & Water: " + String.format("%,d EUR", natNaturalEnvironment));
            System.out.println("General Secretariat for Waste Management: " + String.format("%,d EUR", natWasteManagement));
            System.out.println("General Secretariat of Forests: " + String.format("%,d EUR", natForests));
            System.out.println("Other Units: " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Facility Expenses: " + String.format("%,d EUR", natRecoveryFund));

            // === CO-FINANCED PART ===
            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Spatial Planning: " + String.format("%,d EUR", coSpatialPlanning));
            System.out.println("General Secretariat for Energy & Mineral Resources: " + String.format("%,d EUR", coEnergyMinerals));
            System.out.println("General Secretariat of Natural Environment & Water: " + String.format("%,d EUR", coNaturalEnvironment));
            System.out.println("General Secretariat for Waste Management: " + String.format("%,d EUR", coWasteManagement));
            System.out.println("General Secretariat of Forests: " + String.format("%,d EUR", coForests));
            System.out.println("Other Units: " + String.format("%,d EUR", coOtherUnits));

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }
}
