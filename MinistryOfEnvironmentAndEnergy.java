public class MinistryOfEnvironmentAndEnergy {

    public static void main(String[] args) {
        String ministry = "Ministry of Enviroment and Energy";
        int year = 2025;
        long regularBudget = 319227000;
        long investmentBudget = 2022000000;
        long total = regularBudget + investmentBudget;
        System.out.println("=====================================");
        System.out.println(ministry + " - Budget " + year);
        System.out.println("=====================================");
        System.out.println("Regular Budget: " + regularBudget + " €");
        System.out.println("Public Investment Budget: " + investmentBudget + " €");
        System.out.println("-------------------------------------");
        System.out.println("Total: " + total + " €");
    }

}
