import java.util.Scanner;

public class MinistryOfNationalDefense extends Ministry {

    public MinistryOfNationalDefense() {
        super(
            "Ministry of National Defense",
            6_061_000_000L,   // Regular Budget
            69_000_000L       // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

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
            System.out.println("Other Expenses: " +
                    String.format("%,d EUR", otherExpenses));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", creditsUnderAllocation));
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
            System.out.println("Army General Staff: " +
                    String.format("%,d EUR", natArmyGeneralStaff));
            System.out.println("Naval General Staff: " +
                    String.format("%,d EUR", natNavalGeneralStaff));
            System.out.println("Air Force General Staff: " +
                    String.format("%,d EUR", natAirForceGeneralStaff));
            System.out.println("National Defense Units: " +
                    String.format("%,d EUR", natDefenseUnits));

            System.out.println("\n===== Investment Budget — Co-Financed Part =====");
            System.out.println("Army General Staff: " +
                    String.format("%,d EUR", coArmyGeneralStaff));
            System.out.println("Naval General Staff: " +
                    String.format("%,d EUR", coNavalGeneralStaff));
            System.out.println("Air Force General Staff: " +
                    String.format("%,d EUR", coAirForceGeneralStaff));
            System.out.println("National Defense Units: " +
                    String.format("%,d EUR", coDefenseUnits));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}
