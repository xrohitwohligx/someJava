import java.util.*;

public class tinyUrl {
    private static final String BASE62_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SHORT_URL_LENGTH = 6; // Length of the short URL

     public static String generateShortURL() {
        StringBuilder shortURL = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            int index = random.nextInt(BASE62_CHARACTERS.length());
            shortURL.append(BASE62_CHARACTERS.charAt(index));
        }
        return shortURL.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a long URL
        System.out.print("Enter a long URL: ");
        String longURL = scanner.nextLine();

        // Generate a short URL
        String shortURL = tinyUrl.generateShortURL();

        // Print the short URL
        System.out.println("Short URL: " + shortURL);

        scanner.close();
    }
}

