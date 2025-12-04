import java.util.Scanner;

public class MinistryOfEnvironmentAndEnergy extends Ministry {

    // Constructor
    public MinistryOfEnvironmentAndEnergy() {
        super(
            "Ministry of Environment and Energy",
            319_227_000L,      // regular budget
            2_022_000_000L     // investment budget
        );
    }

    // Override abstract method
    @Override
    public void showBudget() {

        Scanner input = new Scanner(System.in);

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

        long totalNatInvestment = natSpatialPlanning + natEnergyMinerals + natNaturalEnvironment + natWasteManagement
                + natForests + natOtherUnits + natRecoveryFund;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coSpatialPlanning = 67_100_000L;
        long coEnergyMinerals = 205_933_000L;
        long coNaturalEnvironment = 260_967_000L;
        long coWasteManagement = 47_750_000L;
        long coForests = 250_000L;
        long coOtherUnits = 8_000_000L;

        long totalCoInvestment = coSpatialPlanning + coEnergyMinerals + coNaturalEnvironment + coWasteManagement
                + coForests + coOtherUnits;

        // Print main info
        printInfo();

        // --- REGULAR BUDGET ---
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
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // --- INVESTMENT BUDGET ---
        System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();

        if (answer2.equals("yes")) {
            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Spatial Planning: " + String.format("%,d EUR", natSpatialPlanning));
            System.out.println("General Secretariat for Energy & Mineral Resources: " + String.format("%,d EUR", natEnergyMinerals));
            System.out.println("General Secretariat of Natural Environment & Water: " + String.format("%,d EUR", natNaturalEnvironment));
            System.out.println("General Secretariat for Waste Management: " + String.format("%,d EUR", natWasteManagement));
            System.out.println("General Secretariat of Forests: " + String.format("%,d EUR", natForests));
            System.out.println("Other Units: " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Facility Expenses: " + String.format("%,d EUR", natRecoveryFund));
            System.out.println("Total National Part: " + String.format("%,d EUR", totalNatInvestment));

            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Spatial Planning: " + String.format("%,d EUR", coSpatialPlanning));
            System.out.println("General Secretariat for Energy & Mineral Resources: " + String.format("%,d EUR", coEnergyMinerals));
            System.out.println("General Secretariat of Natural Environment & Water: " + String.format("%,d EUR", coNaturalEnvironment));
            System.out.println("General Secretariat for Waste Management: " + String.format("%,d EUR", coWasteManagement));
            System.out.println("General Secretariat of Forests: " + String.format("%,d EUR", coForests));
            System.out.println("Other Units: " + String.format("%,d EUR", coOtherUnits));
            System.out.println("Total Co-Financed Part: " + String.format("%,d EUR", totalCoInvestment));
        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    // Main method
    public static void main(String[] args) {
        MinistryOfEnvironmentAndEnergy mod = new MinistryOfEnvironmentAndEnergy();
        mod.showBudget();
    }
}




