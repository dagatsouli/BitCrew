import java.util.Scanner;

public class CodeTheState {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initial message
        String message = "The Prime Minister's decision is today! The whole country is waiting for you to start";
        System.out.println(message);
        System.out.println("\nPlease press Enter to start");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Startup confirmed. Initiating procedures...\n");

        // MAIN MENU
        System.out.println("=====================================");
        System.out.println("Press 1 to view Revenues & Expenses");
        System.out.println("Press 2 to view all Ministries");
        System.out.println("=====================================");
        System.out.print("Your choice: ");

        int choice = input.nextInt();
        input.nextLine(); // buffer clear

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
            System.out.println("2. Ministry of National Defence");
            System.out.println("3. Ministry of Environment and Energy");
            System.out.println("4. Ministry of Tourism");
            System.out.println("5. Ministry of Health");
            System.out.println("6. Ministry of Education, Religions and Sports");
            System.out.println("==================================");

            System.out.print("\nChoose a Ministry (1 - 6): ");
            int ministryChoice = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (ministryChoice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Ministry selected. Program terminated.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Ministry selection. Program terminated.");
                    input.close();
                    return;
            }
        }

        else {
            System.out.println("Invalid choice. System terminated.");
            input.close();
            return;
        }
        input.close();
    }
}
