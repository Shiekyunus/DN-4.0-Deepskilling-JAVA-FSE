
public class Main {
    public static void main(String[] args) {
        // Retrieve two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (singleton works).");
        } else {
            System.out.println("Logger instances are different (singleton failed).");
        }
    }
}
