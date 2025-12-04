import java.util.Scanner;

public class CodeTheState {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- ΑΡΧΙΚΟ ΜΗΝΥΜΑ ---
        System.out.println("The Prime Minister's decision is today! The whole country is waiting for you to start");
        System.out.println("\nPlease press Enter to start");
        input.nextLine(); // ΜΟΝΟ Scanner – ΟΧΙ System.in.read()

        System.out.println("\nStartup confirmed. Initiating procedures...\n");

        boolean keepRunning = true;

        // --- ΚΥΡΙΑ ΛΟΥΠΑ ΠΡΟΓΡΑΜΜΑΤΟΣ ---
        while (keepRunning) {

            int choice = -1;

            // ===== MENU VALIDATION LOOP =====
            while (true) {
                System.out.println("=====================================");
                System.out.println("Press 1 to view Revenues & Expenses");
                System.out.println("Press 2 to view all Ministries");
                System.out.println("Press 0 to Exit");
                System.out.println("=====================================");
                System.out.print("Your choice: ");

                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    input.nextLine(); // καθαρισμός newline

                    if (choice >= 0 && choice <= 2) {
                        break;
                    } else {
                        System.out.println("\n>>> Error: Please choose 0, 1 or 2.\n");
                    }
                } else {
                    System.out.println("\n>>> Error: Invalid input. Please enter a number.\n");
                    input.nextLine();
                }
            }

            // ===== ΕΠΙΛΟΓΕΣ =====
            if (choice == 0) {
                System.out.println("Exiting system. Goodbye, Prime Minister.");
                keepRunning = false;
                break;
            }

            else if (choice == 1) {
                System.out.println("\nOpening Revenues & Expenses menu...");
                General.showReport(input);
            }

            else if (choice == 2) {

                System.out.println("\n========== Ministries ==========");
                System.out.println("1. Ministry of Infrastructure and Transport");
                System.out.println("2. Ministry of National Defense");
                System.out.println("3. Ministry of Environment and Energy");
                System.out.println("4. Ministry of Tourism");
                System.out.println("5. Ministry of Health");
                System.out.println("6. Ministry of Education, Religions and Sports");
                System.out.println("==================================");

                int ministryChoice = -1;

                // --- VALIDATION ΓΙΑ ΥΠΟΥΡΓΕΙΟ ---
                while (true) {
                    System.out.print("\nChoose a Ministry (1 - 6): ");

                    if (input.hasNextInt()) {
                        ministryChoice = input.nextInt();
                        input.nextLine();

                        if (ministryChoice >= 1 && ministryChoice <= 6) {
                            break;
                        } else {
                            System.out.println(">>> Error: Choose a number between 1 and 6.");
                        }
                    } else {
                        System.out.println(">>> Error: Invalid input.");
                        input.nextLine();
                    }
                }

                // --- YES / NO ΓΙΑ DETAIL VIEW ---
                String answer = "";

                while (true) {
                    System.out.print("Do you want to see the detailed budget? (yes/no): ");
                    answer = input.nextLine().trim();

                    if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println(">>> Error: Type ONLY 'yes' or 'no'.");
                    }
                }

                if (answer.equalsIgnoreCase("yes")) {
                    Ministry ministry = null;

                    switch (ministryChoice) {
                        case 1: ministry = new MinistryOfInfrastructureAndTransport(); break;
                        case 2: ministry = new MinistryOfNationalDefense(); break;
                        case 3: ministry = new MinistryOfEnvironmentAndEnergy(); break;
                        case 4: ministry = new MinistryOfTourism(); break;
                        case 5: ministry = new MinistryHealth(); break;
                        case 6: ministry = new MinistryOfEducationReligionsAndSports(); break;
                    }

                    if (ministry != null) {
                        ministry.showBudget(input); // ΙΔΙΑ SCANNER
                    }

                } else {
                    System.out.println("Detailed budget view cancelled.");
                }
            }

            // --- ΣΥΝΕΧΕΙΑ ---
            String continueAnswer = "";

            while (true) {
                System.out.println("\n-------------------------------------------");
                System.out.println("Would you like to perform another action? (yes/no)");
                continueAnswer = input.nextLine().trim();

                if (continueAnswer.equalsIgnoreCase("yes") || continueAnswer.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println(">>> Error: Please type 'yes' or 'no'.");
                }
            }

            if (continueAnswer.equalsIgnoreCase("no")) {
                keepRunning = false;
                System.out.println("System shutting down...");
            } else {
                System.out.println("\nReturning to main menu...\n");
            }
        }

        input.close();
    }
}