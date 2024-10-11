import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NLArray {

    public static String[] wordTokenize(String fileName) throws Exception {
        List<String> words = new ArrayList<>();
        String regex = "[^a-zA-Z0-9\\s]"; // Matches punctuation and special characters
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+"); // Split based on whitespace
                for (String token : tokens) {
                    Matcher matcher = pattern.matcher(token);
                    if (!matcher.find()) { // If token doesn't contain punctuation or special characters
                        words.add(token.toLowerCase()); // Add lowercase word
                    }
                }
            }
        }

        return words.toArray(new String[0]);
    }

    public static String[] extractEmail(String fileName) throws Exception {
        List<String> emails = new ArrayList<>();
        String regex = "[\\w\\.-]+@[\\w\\.-]+\\.\\w+"; // Matches email format

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = Pattern.compile(regex).matcher(line);
                while (matcher.find()) {
                    emails.add(matcher.group()); // Add matched email
                }
            }
        }

        return emails.toArray(new String[0]);
    }

    public static void main(String[] args) {
        try {
            String fileName = "your_file.txt"; // Replace with your actual file name

            String[] words = wordTokenize(fileName);
            System.out.println("Words:");
            for (String word : words) {
                System.out.println(word);
            }

            String[] emails = extractEmail(fileName);
            System.out.println("\nEmails:");
            for (String email : emails) {
                System.out.println(email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}