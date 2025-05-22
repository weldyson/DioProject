package LogManager;

public class Main {
    public static void main(String[] args) {

        LogManager log1 = LogManager.getInstance();
        LogManager log2 = LogManager.getInstance();

        log1.log("Starting the application...");
        log2.log("Performing an important operation...");

        if (log1 == log2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("They are different instances.");
        }
    }
}
