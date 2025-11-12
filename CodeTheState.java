public class CodeTheState {
    public static void main(String[] args) {
        String message = "The Prime Minister's decision is today! Your country is waiting for you to press start.";
        System.out.println(message);
        System.out.println("\nPress Enter to start...");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Startup confirmed. Initiating procedures...");
    }
}
