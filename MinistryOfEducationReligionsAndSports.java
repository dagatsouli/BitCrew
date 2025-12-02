
import java.util.Scanner;

public class  MinistryOfEducationReligionsAndSports {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ministry = "Ministry of Education, Religions and Sports";
        int year = 2025;

        // === MAIN BUDGETS ===
        long regularBudget = 5594000000L;
        long investmentBudget = 1012000000L;
        long total = regularBudget + investmentBudget;

        // === REGULAR BUDGET CATEGORIES ===
        long employeeBenefits = 4935588000L;
        long socialBenefits = 440000L;
        long transfers = 530338000L;
        long goodsAndServices = 124934000L;
        long subsidies = 30000L;
        long creditsUnderAllocation = 665000L;
        long fixedAssets = 2000000L;
        long valuables = 5000L;

        // === INVESTMENT BUDGET — NATIONAL PART ===
        long natReligions = 500000L;
        long natPrimarySecondaryAndSpecialEducation = 10000000L;
        long natVocationalEducationTrainingAndLifelongLearning = 1000000L;
        long natHigherEducation = 116700000L;
        long natSports = 11000000L;
        long natOtherUnits = 5800000L;
        long natRecoveryFund = 202000000L;

        // === INVESTMENT BUDGET — CO-FINANCED PART ===
        long coReligions = 1800000L;
        long coPrimarySecondaryAndSpecialEducation = 508000000L;
        long coVocationalEducationTrainingAndLifelongLearning = 73000000L;
        long coHigherEducation = 77000000L;
        long coOtherUnits = 3000000L;
        long coHigherEdAuthorityExpenses = 2200000L;

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
            System.out.println("Subsidies: " + String.format("%,d EUR", subsidies));
            System.out.println("Credits under allocation: " + String.format("%,d EUR", creditsUnderAllocation));
            System.out.println("Fixed assets: " + String.format("%,d EUR", fixedAssets));
            System.out.println("Valuables: " + String.format("%,d EUR", valuables));
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
            System.out.println("General Secretariat of Religions: " + String.format("%,d EUR", natReligions));
            System.out.println("General Secretariat of Primary, Secondary and Special Education: " + String.format("%,d EUR", natPrimarySecondaryAndSpecialEducation));
            System.out.println("General Secretariat of Vocational Education, Training and Lifelong Learning: " + String.format("%,d EUR", natVocationalEducationTrainingAndLifelongLearning));
            System.out.println("General Secretariat of Higher Education: " + String.format("%,d EUR", natHigherEducation));
            System.out.println("General Secretariat of Sports: " + String.format("%,d EUR", natSports));
            System.out.println("Other Units: " + String.format("%,d EUR", natOtherUnits));
            System.out.println("Recovery & Resilience Facility Expenses: " + String.format("%,d EUR", natRecoveryFund));

            // === CO-FINANCED PART ===
            System.out.println("\n===== Co-Financed Part of Public Investment Budget =====");
            System.out.println("General Secretariat of Religions: " + String.format("%,d EUR", coReligions));
            System.out.println("General Secretariat of Primary, Secondary and Special Education: " + String.format("%,d EUR", coPrimarySecondaryAndSpecialEducation));
            System.out.println("General Secretariat of Vocational Education, Training and Lifelong Learning: " + String.format("%,d EUR", coVocationalEducationTrainingAndLifelongLearning));
            System.out.println("General Secretariat of Higher Education: " + String.format("%,d EUR", coHigherEducation));
            System.out.println("Other Units: " + String.format("%,d EUR", coOtherUnits));
            System.out.println("Higher Education Authority Expenses: " + String.format("%,d EUR", coHigherEdAuthorityExpenses));

        } else {
            System.out.println("\nOK. No Investment Budget analysis will be displayed.");
        }

        input.close();
    }
}
