import java.util.logging.Logger;
import java.util.logging.Level;

public class ReverseString {
    private static final Logger logger = Logger.getLogger(ReverseString.class.getName());

    // This function takes a string as input and returns its reverse
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        // Configure logging
        logger.setLevel(Level.INFO);

        String text = "hello world";
        logger.info("Original string: " + text);
        String reversedText = reverseString(text);
        logger.info("Reversed string: " + reversedText);

        System.out.println("Reversed string: " + reversedText);
    }
}