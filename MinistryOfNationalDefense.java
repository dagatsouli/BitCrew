public class MinistryOfNationalDefense {
    public static void main(String[] args) {
        int year = 2025;
        String ministry = "Ministry of National Defense";
        double regularBudget = 6061000000.0;       
        double investmentBudget = 69000000.0;
        double total = regularBudget + investmentBudget;
        System.out.println(ministry + "Budget" + year);
        System.out.println("--------------------------------------------------");
        System.out.println("Regular Budget: " + regularBudget + " €");
        System.out.println("Public Investment Budget: " + investmentBudget + " €");
        System.out.println("Total Budget: " + total + " €");
    }
}