public class CodeTheState {
    public static void main(String[] args) {
        String message = "Τι αποφάσισε ο πρωθυπουργός σήμερα; Η χώρα , σας περιμένει να πατήσετε έναρξη."΄
        System.out.println(message);
        System.out.println("\n Πατήστε Εnter για έναρξη..")΄;
        try {
            System.in.read();
        } catch (Exception e) {

        }
        System.out.println("Έναρξη επιβεβαιώθηκε. Εκκίνηση διαδικασιών..");
    }


}
