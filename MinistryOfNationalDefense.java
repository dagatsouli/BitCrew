import java.util.Scanner;

public class MinistryOfNationalDefense extends Ministry {

    // ----- Constructor -----
    public MinistryOfNationalDefense() {
        super(
            "Ministry of National Defense",
            6_061_000_000L,   // regular budget
            69_000_000L       // investment budget
        );
    }

    // ----- Override method -----
    @Override
    public void showBudget() {

        Scanner input = new Scanner(System.in);

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 2_831_342_000L;
        long socialBenefits = 77_846_000L;
        long transfers = 51_719_000L;
        long goodsAndServices = 530_721_000L;
        long otherExpenses = 1_337_000L;
        long creditsUnderAllocation = 38_092_000L;
        long fixedAssets = 2_529_943_000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natArmyGeneralStaff = 26_000_000L;
        long natNavalGeneralStaff = 7_400_000L;
        long natAirForceGeneralStaff = 11_500_000L;
        long natDefenseUnits = 100_000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coArmyGeneralStaff = 7_500_000L;
        long coNavalGeneralStaff = 8_500_000L;
        long coAirForceGeneralStaff = 7_000_000L;
        long coDefenseUnits = 1_000_000L;

        // Print main data
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
            System.out.println("Other expenses: " + String.format("%,d EUR", otherExpenses));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // === ASK FOR INVESTMENT BUDGET ===
        System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();

        if (answer2.equals("yes")) {

            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("Army General Staff: " + String.format("%,d EUR", natArmyGeneralStaff));
            System.out.println("Naval General Staff: " + String.format("%,d EUR", natNavalGeneralStaff));
            System.out.println("Air Force General Staff: " + String.format("%,d EUR", natAirForceGeneralStaff));
            System.out.println("National Defense Units: " + String.format("%,d EUR", natDefenseUnits));

            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("Army General Staff: " + String.format("%,d EUR", coArmyGeneralStaff));
            System.out.println("Naval General Staff: " + String.format("%,d EUR", coNavalGeneralStaff));
            System.out.println("Air Force General Staff: " + String.format("%,d EUR", coAirForceGeneralStaff));
            System.out.println("National Defense Units: " + String.format("%,d EUR", coDefenseUnits));

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    // ----- MAIN METHOD -----
    public static void main(String[] args) {
        MinistryOfNationalDefense mod = new MinistryOfNationalDefense();
        mod.showBudget();
    }
}
