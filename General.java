import java.util.Scanner;

public class General {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

<<<<<<< Updated upstream
    System.out.println("The total revenues of Greece, based on the state budget for 2025, amount to 1,304,827,000,000 EUR .");
    System.out.println("The total expenditures of Greece, based on the state budget for 2025, amount to 1,307,907,506,000 EUR.");
    
=======
>>>>>>> Stashed changes
    //REVENUES
    long taxes = 62055000000L;
    long socialContributions = 60000000;
    long transfers = 8131000000L;
    long salesOfgoods = 2405000000L;
    long otherCurrentRevenues = 2775000000L;
    long fixedAssets = 37000000;
    long equitySecuritiesAndInvestment = 467000000;
    long liabilitiesfromCurrency = 66000000;
    long debtSecurities = 25984000000L;
    long loans = 1202047000000L;
    long financialDerivatives = 800000000;
    //EXPENSES
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

<<<<<<< Updated upstream
    System.out.print("\nDo you want to see the detailed version of the Revenues? (yes/no): ");
    String answer = input.nextLine().trim().toLowerCase();


     if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Version of the Revenues -----");
=======
    System.out.println("The total revenues of Greece, based on the state budget for 2025, amount to 1,304,827,000,000 EUR .");
    System.out.println("The total expenditures of Greece, based on the state budget for 2025, amount to 1,307,907,506,000 EUR.");

    System.out.print("\nDo you want to see the detailed version of the Revenues? (yes/no): ");
    String answer = input.nextLine().trim().toLowerCase();

     if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Version of the Expenses -----");
>>>>>>> Stashed changes
            System.out.println("Taxes: " + taxes + " EUR");
            System.out.println("Social contributions: " + socialContributions + " EUR");
            System.out.println("Transfers: " + transfers + " EUR");
            System.out.println("Purchases of goods and services: " + salesOfgoods + " EUR");
            System.out.println("Credits under allocation: " + otherCurrentRevenues + " EUR");
            System.out.println("Fixed assets: " + fixedAssets + " EUR");
            System.out.println("Debt Securities: " + debtSecurities + " EUR");
            System.out.println("Loans " + loans + " EUR");
            System.out.println("Equity Securities And Investment: " + equitySecuritiesAndInvestment + " EUR");
            System.out.println("Liabilities from Currency: " + liabilitiesfromCurrency + " EUR");
            System.out.println("Financial Derivatives: " + financialDerivatives + " EUR");
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\n OK. No detailed Regular Budget will be displayed.");
        }


    System.out.print("\nDo you want to see the detailed version of the Expenses? (yes/no): ");
    String answer2 = input.nextLine().trim().toLowerCase();

<<<<<<< Updated upstream
    }
}
=======
        if (answer.equals("yes")) {
            System.out.println("\n----- Detailed Version of the Revenues -----");
            System.out.println("Employee Benefits: " + employeeBenefits + " EUR");
            System.out.println("Social Benefits: " + socialBenefits + " EUR");
            System.out.println("Transfers Expences: " + transfersExpences + " EUR");
            System.out.println("Purchases of goods and services: " + purchasesGoodsServices + " EUR");
            System.out.println("Subsidies: " + subsidies + " EUR");
            System.out.println("Interest: " + interest + " EUR");
            System.out.println("Other Expences: " + otherExpenses + " EUR");
            System.out.println("Allocated Credits: " + allocatedCredits + " EUR");
            System.out.println("Fixed Assets Expenses: " + fixedAssetsExpenses + " EUR");
            System.out.println("Valuables: " + valuables + " EUR");
            System.out.println("Loans Expenses: " + loansExpenses + " EUR");
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("\n OK. No detailed Regular Budget will be displayed.");
        }

    }
}


>>>>>>> Stashed changes
