import java.util.Scanner;
public class MinistryHealth {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
long paroxes = 2_342_138_000L;
long metavivaseis = 4_158_244_000L;
long agores = 104_679_000L;
long pistoseis = 1_638_000L;
long pagia = 1_725_000L;

long totalRegular = paroxes + metavivaseis + agores + pistoseis + pagia;
long pdeEthniko = 519_000_000L;
long pdeSyn = 50_000_000;
long totalPDE = pdeEthniko + pdeSyn;
long totalAll = totalRegular + totalPDE;

System.out.println ("ΥΠΟΥΡΓΕΙΟ ΥΓΕΙΑΣ - ΠΡΟΥΠΟΛΟΓΙΣΜΟΣ 2025");
System.out.println ("\nΤΑΚΤΙΚΟΣ ΠΡΟΠΟΛΟΓΙΣΜΟΣ");
System.out.println("Μεταβιβάσεις: " + metavivaseis + "€");
System.out.println("Αγορές αγαθών και υπηρεσιών:   " + agores + "€");
System.out.println("ΠΔΕ - Εθνικό σκέλος:              " + pdeEthniko + " €");
System.out.println("ΠΔΕ - Συγχρηματοδούμενο σκέλος:   " + pdeSyn + "€");
System.out.println("Σύνολο ΠΔΕ:  " + totalAll + "€");

System.out.println("\nΕισάγετε νέες τιμές σε ευρώ για τις βασικές κατηγορίες.");
System.out.print("Νέα τιμή για Παροχές:  ");
long newParoxes = sc.nextLong();
System.out.print("Νέα τιμή για Μεταβιβάσεις:  ");
long newMetavivaseis = sc.nextLong();
System.out.print("Νέα τιμή για Αγορές:  ");
long newAgores = sc.nextLong();
System.out.print("Νέα τιμή για Πιστώσεις υπό κατανομή:  ");
long newPistoseis = sc.nextLong();
System.out.print("Νέα τιμή για πάγια περιουσιακά στοιχεία:  ");
long newPagia = sc.nextLong();
System.out.print("Νέα τιμή για ΠΔΕ - Εθνικό Σκέλος:  ");
long newpdeEthniko = sc.nextLong() ;
System.out.print("Νέα τιμή για ΠΔΕ - Συγχρηματοδούμενο Σκέλος:  ");
long newpdeSyn =sc.nextLong();

long newTotalRegular = newParoxes+ newMetavivaseis + newAgores + newPistoseis + newPagia ;
long newTotalPDE = newpdeEthniko + newpdeSyn;
long newTotalAll = newTotalRegular + newTotalPDE;
System.out.println("\nΑΛΛΑΓΕΣ ΠΟΥ ΕΙΣΗΧΘΗΣΑΝ");
System.out.println("Παροχές:    "+ paroxes + "  € → "+ newParoxes +" €");
System.out.println("Μεταβιβάσεις:  " + metavivaseis + " € → "+ newMetavivaseis + " €");
System.out.println("Αγορές:  " + agores + " € → " + newAgores + " €");
System.out.println( "Πιστώσεις:  " + pistoseis + " € → " + newPistoseis +" €");
System.out.println("Πάγια:   " + pagia +" € → " + newPagia +" €");
System.out.println("ΠΔΕ - Εθνικό:  " + pdeEthniko + " € → " + newpdeEthniko + " €");
System.out.println("ΠΔΕ - Συγχρηματοδούμενο:  " + pdeSyn +" € → " + newpdeSyn +" €" );
System.out.println("\nΝΕΟ ΣΥΝΟΛΟ ΤΑΚΤΙΚΟΥ: "  + newTotalRegular+ " €");
System.out.println("ΝΕΟ ΣΥΝΟΛΟ ΠΔΕ:  " +newTotalPDE+ " €" );
System.out.println("ΝΕΟ ΣΥΝΟΛΟ ΟΛΟΥ ΠΡΟΥΠΟΛΟΓΙΣΜΟΥ:  " + newTotalAll +" €");

long limit = 7_500_000_000L;
System.out.println("\nΈλεγχος ορίου (" + limit + " €):");
        if (newTotalAll > limit) {
            System.out.println(" Υπέρβαση προϋπολογισμού!");
        } else {
            System.out.println(" Ο προϋπολογισμός βρίσκεται εντός ορίου.");
          }
    }
 }
