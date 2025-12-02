import java.util.Scanner;

public class TestGeneral {

    public static void showReport() {
        Scanner input = new Scanner(System.in);

        System.out.println("The total revenues of Greece, based on the state budget for 2025, amount to 1,304,827,000,000 EUR.");
        System.out.println("The total expenditures of Greece, based on the state budget for 2025, amount to 1,307,907,506,000 EUR.\n");

        // REVENUES
        long taxes = 62055000000L;
        long socialContributions = 60000000L;
        long transfers = 8131000000L;
        long salesOfgoods = 2405000000L;
        long otherCurrentRevenues = 2775000000L;
        long fixedAssets = 37000000L;
        long equitySecuritiesAndInvestment = 467000000L;
        long liabilitiesfromCurrency = 66000000L;
        long debtSecurities = 25984000000L;
        long loans = 1202047000000L;
        long financialDerivatives = 800000000L;

        // EXPENSES
        long employeeBenefits = 14889199000L;
        long socialBenefits = 425136000L;
        long transfersExpenses = 34741365000L;
        long purchasesGoodsServices = 2039542000L;
        long subsidies = 80630000L;
        long interest = 7701101000L;
        long otherExpenses = 101553000L;
        long allocatedCredits = 17283053000L;
        long fixedAssetsExpenses = 2609600000L;
        long valuables = 85000L;        
        long loansExpenses = 3741000000L;
        long equitySecuritiesExpenses = 1755112000L;
        long debtSecuritiesExpenses = 19375000000L;
        long loans2Expenses = 1203165130000L;    

        // Εμφάνιση λεπτομερειών εσόδων
        System.out.print("Do you want to see the detailed Revenues? (yes/no): ");
        String answer = input.nextLine().trim().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Revenues -----");
            System.out.println("Taxes: " + taxes + " EUR");
            System.out.println("Social contributions: " + socialContributions + " EUR");
            System.out.println("Transfers: " + transfers + " EUR");
            System.out.println("Sales of goods: " + salesOfgoods + " EUR");
            System.out.println("Other current revenues: " + otherCurrentRevenues + " EUR");
            System.out.println("Fixed assets: " + fixedAssets + " EUR");
            System.out.println("Equity Securities And Investment: " + equitySecuritiesAndInvestment + " EUR");
            System.out.println("Liabilities from Currency: " + liabilitiesfromCurrency + " EUR");
            System.out.println("Debt Securities: " + debtSecurities + " EUR");
            System.out.println("Loans: " + loans + " EUR");
            System.out.println("Financial Derivatives: " + financialDerivatives + " EUR");
            System.out.println("-----------------------------");
        }

        // Εμφάνιση λεπτομερειών εξόδων
        System.out.print("\nDo you want to see the detailed Expenses? (yes/no): ");
        String answer2 = input.nextLine().trim().toLowerCase();
        if (answer2.equals("yes")) {
            System.out.println("\n----- Detailed Expenses -----");
            System.out.println("Employee benefits: " + employeeBenefits + " EUR");
            System.out.println("Social benefits: " + socialBenefits + " EUR");
            System.out.println("Transfers: " + transfersExpenses + " EUR");
            System.out.println("Purchases of goods and services: " + purchasesGoodsServices + " EUR");
            System.out.println("Subsidies: " + subsidies + " EUR");
            System.out.println("Interest: " + interest + " EUR");
            System.out.println("Other expenses: " + otherExpenses + " EUR");
            System.out.println("Allocated credits: " + allocatedCredits + " EUR");
            System.out.println("Fixed assets: " + fixedAssetsExpenses + " EUR");
            System.out.println("Valuables: " + valuables + " EUR");
            System.out.println("Loans: " + loansExpenses + " EUR");
            System.out.println("Equity Securities Expenses: " + equitySecuritiesExpenses + " EUR");
            System.out.println("Debt Securities Expenses: " + debtSecuritiesExpenses + " EUR");
            System.out.println("Loans 2 Expenses: " + loans2Expenses + " EUR");
            System.out.println("-----------------------------");
        }

        input.close();
    }
}
