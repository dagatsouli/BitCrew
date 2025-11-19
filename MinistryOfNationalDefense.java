import java.util.Scanner;

public class MinistryOfNationalDefense {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ministry = "Ministry of National Defense";
        int year = 2025;

        // === MAIN BUDGETS ===
        long regularBudget = 6061000000L;
        long investmentBudget = 69000000L;
        long total = regularBudget + investmentBudget;

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 2831342000L;
        long socialBenefits = 77846000L;
        long transfers = 51719000L;
        long goodsAndServices = 530721000L;
        long otherExpenses = 1337000L;
        long creditsUnderAllocation = 38092000L;
        long fixedAssets = 2529943000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natArmyGeneralStaff = 26000000L;
        long natNavalGeneralStaff = 7400000L;
        long natAirForceGeneralStaff = 11500000L;
        long natDefenceUnits = 100000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coArmyGeneralStaff = 7500000L;
        long coNavalGeneralStaff = 8500000L;
        long coAirForceGeneralStaff = 7000000L;
        long coDefenceUnits = 1000000L;

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
            System.out.println("Employee benefits: " + String.format("%,d €", employeeBenefits));
            System.out.println("Social benefits: " + String.format("%,d €", socialBenefits));
            System.out.println("Transfers: " + String.format("%,d €", transfers));
            System.out.println("Other expenses: " + String.format("%,d €", otherExpenses));
            System.out.println("Credits under allocation: " + String.format("%,d €", creditsUnderAllocation));
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
            System.out.println("Army General Staff: " + String.format("%,d €", natArmyGeneralStaff));
            System.out.println("Naval General Staff: " + String.format("%,d €", natNavalGeneralStaff));
            System.out.println("Air Force General Staff: " + String.format("%,d €", natAirForceGeneralStaff));
            System.out.println("National Defense Units: " + String.format("%,d €", natDefenceUnits));
            

            // === CO-FINANCED PART ===
            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("Army General Staff: " + String.format("%,d €", coArmyGeneralStaffArmyGeneralStaff));
            System.out.println("Naval General Staff: " + String.format("%,d €", coNavalGeneralStaffNavalGeneralStaff));
            System.out.println("Air Force General Staff: " + String.format("%,d €", coAirForceGeneralStaff));
            System.out.println("National Defense Units: " + String.format("%,d €", coDefenceUnitsDefenceUnits));
            
            

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }
}


    