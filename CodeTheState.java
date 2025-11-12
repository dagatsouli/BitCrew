public class CodeTheState {
    public static void main(String[] args) {
        String message = "The Prime Minister's decision is today! The whole country is waiting for you to start";
        System.out.println(message);
        System.out.println("\n Please press Enter to start");

        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Startup confirmed. Initiating procedures...");
    }
}

