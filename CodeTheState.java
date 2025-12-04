import java.util.Scanner;

public class CodeTheState {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- ΑΡΧΙΚΟ ΜΗΝΥΜΑ ---
        System.out.println("The Prime Minister's decision is today! The whole country is waiting for you to start");
        System.out.println("\nPlease press Enter to start");

        try {
            System.in.read();
            if (System.in.available() > 0) System.in.read(new byte[System.in.available()]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nStartup confirmed. Initiating procedures...\n");

        // --- ΕΔΩ ΞΕΚΙΝΑΕΙ ΤΟ LOOP ---
        boolean keepRunning = true;

        while (keepRunning) {

            // MAIN MENU
            System.out.println("=====================================");
            System.out.println("Press 1 to view Revenues & Expenses");
            System.out.println("Press 2 to view all Ministries");
            System.out.println("Press 0 to Exit");
            System.out.println("=====================================");
            System.out.print("Your choice: ");

            // Προστασία από λάθος είσοδο (π.χ. γράμματα)
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine(); // Καθαρισμός
                continue;
            }

            int choice = input.nextInt();
            input.nextLine(); // Καθαρισμός του Enter

            // --- ΕΠΙΛΟΓΗ 0: ΕΞΟΔΟΣ ---
            if (choice == 0) {
                System.out.println("Exiting system. Goodbye, Prime Minister.");
                keepRunning = false;
            }

            // --- ΕΠΙΛΟΓΗ 1: ΕΣΟΔΑ/ΕΞΟΔΑ ---
            else if (choice == 1) {
                System.out.println("\nOpening Revenues & Expenses menu...");
                // Προσοχή: Πρέπει να υπάρχει το αρχείο General.java
                General a = new General();
                a.showReport();
            }

            // --- ΕΠΙΛΟΓΗ 2: ΥΠΟΥΡΓΕΙΑ ---
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
               
                if (input.hasNextInt()) {
                    int ministryChoice = input.nextInt();
                    input.nextLine(); // Καθαρισμός

                    System.out.print("Do you want to see the detailed budget? (yes/no): ");
                    String answer = input.nextLine().trim();

                    if (answer.equalsIgnoreCase("yes")) {
                        Ministry ministry = null;

                        // Εδώ πρέπει να υπάρχουν τα αντίστοιχα αρχεία .java για κάθε κλάση
                        switch (ministryChoice) {
                            case 1: ministry = new MinistryOfInfrastructureAndTransport(); break;
                            case 2: ministry = new MinistryOfNationalDefense(); break;
                            case 3: ministry = new MinistryOfEnvironmentAndEnergy(); break;
                            case 4: ministry = new MinistryOfTourism(); break;
                            case 5: ministry = new MinistryOfHealth(); break;
                            case 6: ministry = new MinistryOfEducationReligionsAndSports(); break;
                            default: System.out.println("Invalid ministry choice.");
                        }

                        if (ministry != null) {
                            ministry.showBudget();
                        }
                    } else {
                        System.out.println("Detailed budget view cancelled.");
                    }
                } else {
                    System.out.println("Invalid input for ministry selection.");
                    input.nextLine();
                }
            }
           
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            // --- ΕΡΩΤΗΣΗ ΓΙΑ ΣΥΝΕΧΕΙΑ ---
            // Ρωτάμε ΜΟΝΟ αν δεν έχεις επιλέξει ήδη έξοδο
            if (keepRunning) {
                System.out.println("\n-------------------------------------------");
                System.out.println("Would you like to perform another action? (yes/no)");
                String continueAnswer = input.nextLine().trim();

                if (continueAnswer.equalsIgnoreCase("no")) {
                    keepRunning = false;
                    System.out.println("System shutting down...");
                } else {
                    System.out.println("\nReturning to main menu...\n");
                }
            }

        } // Τέλος του while

        input.close();
    }
}