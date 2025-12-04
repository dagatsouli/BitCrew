import java.util.Scanner;

public class CodeTheState {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Αρχικό μήνυμα
        String message = "The Prime Minister's decision is today! The whole country is waiting for you to start";
        System.out.println(message);
        System.out.println("\nPlease press Enter to start");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nStartup confirmed. Initiating procedures...\n");

        // MAIN MENU
        System.out.println("=====================================");
        System.out.println("Press 1 to view Revenues & Expenses");
        System.out.println("Press 2 to view all Ministries");
        System.out.println("=====================================");
        System.out.print("Your choice: ");

        int choice = input.nextInt();
        input.nextLine(); // καθάρισμα buffer

        // OPTION 1 — Revenues & Expenses
        if (choice == 1) {
            System.out.println("\nOpening Revenues & Expenses menu...");
            General a = new General();
            a.showReport();
        }

        // OPTION 2 — Ministries
        else if (choice == 2) {

            System.out.println("\n========== Ministries ==========");
            System.out.println("1. Ministry of Infrastructure and Transport");
            System.out.println("2. Ministry of National Defense");
            System.out.println("3. Ministry of Environment and Energy");
            System.out.println("4. Ministry of Tourism");
            System.out.println("5. Ministry of Health");
            System.out.println("6. Ministry of Education, Religions and Sports");
            System.out.println("==================================");

            System.out.print("\nChoose a Ministry (1 - 6): ");
            int ministryChoice = input.nextInt();
            input.nextLine(); // καθάρισμα buffer

            System.out.print("Do you want to see the detailed budget? (yes/no): ");
            String answer = input.nextLine().trim();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Returning to menu...");
                input.close();
                return;
            }

            Ministry ministry = null;

            switch (ministryChoice) {
                case 1:
                    ministry = new MinistryOfInfrastructureAndTransport();
                    break;
                case 2:
                    ministry = new MinistryOfNationalDefense();
                    break;
                case 3:
                    ministry = new MinistryOfEnvironmentAndEnergy();
                    break;
                case 4:
                    ministry = new MinistryOfTourism();
                    break;
                case 5:
                    ministry = new MinistryHealth();
                    break;
                case 6:
                    ministry = new MinistryOfEducationReligionsAndSports();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    input.close();
                    return;
            }

            // Κλήση της showBudget
            if (ministry != null) {
                ministry.showBudget();
            }

        } else {
            System.out.println("Invalid choice. System terminated.");
        }

        input.close();
    }
}



