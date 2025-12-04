import java.util.Scanner;

public class MinistryOfEducationReligionsAndSports extends Ministry {

    public MinistryOfEducationReligionsAndSports() {
        super(
            "Ministry of Education, Religions and Sports",
            5_594_000_000L,  // Regular Budget
            1_012_000_000L   // Investment Budget
        );
    }

    @Override
    public void showBudget(Scanner input) {

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

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coReligions = 1_800_000L;
        long coPrimarySecondaryAndSpecialEducation = 508_000_000L;
        long coVocationalEducationTrainingAndLifelongLearning = 73_000_000L;
        long coHigherEducation = 77_000_000L;
        long coOtherUnits = 3_000_000L;
        long coHigherEdAuthorityExpenses = 2_200_000L;

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
            System.out.println("Subsidies: " +
                    String.format("%,d EUR", subsidies));
            System.out.println("Credits under Allocation: " +
                    String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed Assets: " +
                    String.format("%,d EUR", fixedAssets));
            System.out.println("Valuables: " +
                    String.format("%,d EUR", valuables));
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
            System.out.println("General Secretariat of Religions: " +
                    String.format("%,d EUR", natReligions));
            System.out.println("Primary, Secondary & Special Education: " +
                    String.format("%,d EUR", natPrimarySecondaryAndSpecialEducation));
            System.out.println("Vocational Education, Training & Lifelong Learning: " +
                    String.format("%,d EUR", natVocationalEducationTrainingAndLifelongLearning));
            System.out.println("Higher Education: " +
                    String.format("%,d EUR", natHigherEducation));
            System.out.println("Sports: " +
                    String.format("%,d EUR", natSports));
            System.out.println("Other Units: " +
                    String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Fund: " +
                    String.format("%,d EUR", natRecoveryFund));

            System.out.println("\n===== Investment Budget — Co-Financed Part =====");
            System.out.println("General Secretariat of Religions: " +
                    String.format("%,d EUR", coReligions));
            System.out.println("Primary, Secondary & Special Education: " +
                    String.format("%,d EUR", coPrimarySecondaryAndSpecialEducation));
            System.out.println("Vocational Education, Training & Lifelong Learning: " +
                    String.format("%,d EUR", coVocationalEducationTrainingAndLifelongLearning));
            System.out.println("Higher Education: " +
                    String.format("%,d EUR", coHigherEducation));
            System.out.println("Other Units: " +
                    String.format("%,d EUR", coOtherUnits));
            System.out.println("Higher Education Authority Expenses: " +
                    String.format("%,d EUR", coHigherEdAuthorityExpenses));
        } else {
            System.out.println("\nOK. Investment Budget analysis skipped.");
        }
    }
}