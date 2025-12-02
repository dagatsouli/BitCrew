import java.util.Scanner;

public class MinistryHealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial values (in EUR)
        long employeeBenefits = 2342138000L;
        long transfers = 4158244000L;
        long goodsAndServices = 104679000L;
        long credits = 1638000L;
        long fixedAssets = 1725000L;

        long totalRegular = employeeBenefits + transfers + goodsAndServices + credits + fixedAssets;

        long pdeNational = 519000000L;
        long pdeCoFunded = 50000000L;

        long totalPDE = pdeNational + pdeCoFunded;
        long totalAll = totalRegular + totalPDE;

        System.out.println("MINISTRY OF HEALTH - BUDGET 2025");

        System.out.println("\nREGULAR BUDGET");
        System.out.println("Transfers: " + String.format("%,d EUR", transfers));
        System.out.println("Goods and Services: " + String.format("%,d EUR", goodsAndServices));
        System.out.println("PDE - National Part: " + String.format("%,d EUR", pdeNational));
        System.out.println("PDE - Co-Funded Part: " + String.format("%,d EUR", pdeCoFunded));
        System.out.println("Total PDE: " + String.format("%,d EUR", totalPDE));

        // USER INPUT FOR NEW VALUES
        System.out.println("\nEnter new values (EUR) for each category.");
        System.out.print("New Employee Benefits: ");
        long newEmployeeBenefits = sc.nextLong();

        System.out.print("New Transfers: ");
        long newTransfers = sc.nextLong();

        System.out.print("New Goods and Services: ");
        long newGoodsAndServices = sc.nextLong();

        System.out.print("New Credits Under Allocation: ");
        long newCredits = sc.nextLong();

        System.out.print("New Fixed Assets: ");
        long newFixedAssets = sc.nextLong();

        System.out.print("New PDE - National Part: ");
        long newPdeNational = sc.nextLong();

        System.out.print("New PDE - Co-Funded Part: ");
        long newPdeCoFunded = sc.nextLong();

        // NEW TOTALS
        long newTotalRegular = newEmployeeBenefits + newTransfers + newGoodsAndServices + newCredits + newFixedAssets;
        long newTotalPDE = newPdeNational + newPdeCoFunded;
        long newTotalAll = newTotalRegular + newTotalPDE;

        // DISPLAY CHANGES
        System.out.println("\nCHANGES APPLIED");

        System.out.println("Employee Benefits:    " 
                + String.format("%,d EUR", employeeBenefits) 
                + " → " 
                + String.format("%,d EUR", newEmployeeBenefits));

        System.out.println("Transfers:            " 
                + String.format("%,d EUR", transfers) 
                + " → " 
                + String.format("%,d EUR", newTransfers));

        System.out.println("Goods and Services:   " 
                + String.format("%,d EUR", goodsAndServices) 
                + " → " 
                + String.format("%,d EUR", newGoodsAndServices));

        System.out.println("Credits:              " 
                + String.format("%,d EUR", credits) 
                + " → " 
                + String.format("%,d EUR", newCredits));

        System.out.println("Fixed Assets:         " 
                + String.format("%,d EUR", fixedAssets) 
                + " → " 
                + String.format("%,d EUR", newFixedAssets));

        System.out.println("PDE - National:       " 
                + String.format("%,d EUR", pdeNational) 
                + " → " 
                + String.format("%,d EUR", newPdeNational));

        System.out.println("PDE - Co-Funded:      " 
                + String.format("%,d EUR", pdeCoFunded) 
                + " → " 
                + String.format("%,d EUR", newPdeCoFunded));

        System.out.println("\nNEW TOTAL REGULAR:    " 
                + String.format("%,d EUR", newTotalRegular));

        System.out.println("NEW TOTAL PDE:        " 
                + String.format("%,d EUR", newTotalPDE));

        System.out.println("NEW TOTAL BUDGET:     " 
                + String.format("%,d EUR", newTotalAll));

        long limit = 7_500_000_000L;

        System.out.println("\nBudget Limit: " + String.format("%,d EUR", limit));

        if (newTotalAll > limit) {
            System.out.println("Budget Exceeded!");
        } else {
            System.out.println("Budget is within limit.");
        }
    }
}
