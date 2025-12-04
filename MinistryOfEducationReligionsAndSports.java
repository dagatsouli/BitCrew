import java.util.Scanner;

public class MinistryOfEducationReligionsAndSports extends Ministry {

    // Constructor
    public MinistryOfEducationReligionsAndSports() {
        super(
            "Ministry of Education, Religions and Sports",
            5_594_000_000L,  // regular budget
            1_012_000_000L   // investment budget
        );
    }

    // Override abstract method
    @Override
    public void showBudget() {

        Scanner input = new Scanner(System.in);

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 4_935_588_000L;
        long socialBenefits = 440_000L;
        long transfers = 530_338_000L;
        long goodsAndServices = 124_934_000L;
        long subsidies = 30_000L;
        long creditsUnderAllocation = 665_000L;
        long fixedAssets = 2_000_000L;
        long valuables = 5_000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natReligions = 500_000L;
        long natPrimarySecondaryAndSpecialEducation = 10_000_000L;
        long natVocationalEducationTrainingAndLifelongLearning = 1_000_000L;
        long natHigherEducation = 116_700_000L;
        long natSports = 11_000_000L;
        long natOtherUnits = 5_800_000L;
        long natRecoveryFund = 202_000_000L;

        long totalNatInvestment = natReligions + natPrimarySecondaryAndSpecialEducation
                + natVocationalEducationTrainingAndLifelongLearning + natHigherEducation
                + natSports + natOtherUnits + natRecoveryFund;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coReligions = 1_800_000L;
        long coPrimarySecondaryAndSpecialEducation = 508_000_000L;
        long coVocationalEducationTrainingAndLifelongLearning = 73_000_000L;
        long coHigherEducation = 77_000_000L;
        long coOtherUnits = 3_000_000L;
        long coHigherEdAuthorityExpenses = 2_200_000L;

        long totalCoInvestment = coReligions + coPrimarySecondaryAndSpecialEducation
                + coVocationalEducationTrainingAndLifelongLearning + coHigherEducation
                + coOtherUnits + coHigherEdAuthorityExpenses;

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
            System.out.println("Subsidies: " + String.format("%,d EUR", subsidies));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
            System.out.println("Valuables: " + String.format("%,d EUR", valuables));
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("\nOK. No detailed Regular Budget will be displayed.");
        }

        // --- INVESTMENT BUDGET ---
        System.out.print("\nDo you want to see the Investment Budget analysis? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();

        if (answer2.equals("yes")) {
            System.out.println("\n===== National Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Religions: " + String.format("%,d EUR", natReligions));
            System.out.println("General Secretariat of Primary, Secondary and Special Education: " + String.format("%,d EUR", natPrimarySecondaryAndSpecialEducation));
            System.out.println("General Secretariat of Vocational Education, Training and Lifelong Learning: " + String.format("%,d EUR", natVocationalEducationTrainingAndLifelongLearning));
            System.out.println("General Secretariat of Higher Education: " + String.format("%,d EUR", natHigherEducation));
            System.out.println("General Secretariat of Sports: " + String.format("%,d EUR", natSports));
            System.out.println("Other Units: " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Facility Expenses: " + String.format("%,d EUR", natRecoveryFund));
            System.out.println("Total National Part: " + String.format("%,d EUR", totalNatInvestment));

            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Religions: " + String.format("%,d EUR", coReligions));
            System.out.println("General Secretariat of Primary, Secondary and Special Education: " + String.format("%,d EUR", coPrimarySecondaryAndSpecialEducation));
            System.out.println("General Secretariat of Vocational Education, Training and Lifelong Learning: " + String.format("%,d EUR", coVocationalEducationTrainingAndLifelongLearning));
            System.out.println("General Secretariat of Higher Education: " + String.format("%,d EUR", coHigherEducation));
            System.out.println("Other Units: " + String.format("%,d EUR", coOtherUnits));
            System.out.println("Higher Education Authority Expenses: " + String.format("%,d EUR", coHigherEdAuthorityExpenses));
            System.out.println("Total Co-Financed Part: " + String.format("%,d EUR", totalCoInvestment));
        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }

    // Main method
    public static void main(String[] args) {
        MinistryOfEducationReligionsAndSports mod = new MinistryOfEducationReligionsAndSports();
        mod.showBudget();
    }
}



