import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().toLowerCase();
            
            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }

    public static boolean isPangram(String s) {
        // Remove spaces and convert to lowercase
        s = s.replaceAll(" ", "").toLowerCase();
        
        Set<Character> alphabet = new HashSet<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabet.contains(c)) {
                alphabet.remove(c);
                if (alphabet.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }
}
