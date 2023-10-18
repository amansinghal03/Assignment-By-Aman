import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Roman numeral: ");
            String romanNumeral = scanner.nextLine().toUpperCase();
            
            int result = 0;
            int prevValue = 0;

            for (int i = romanNumeral.length() - 1; i >= 0; i--) {
                char currentChar = romanNumeral.charAt(i);
                int currentValue = getRomanValue(currentChar);

                if (currentValue < prevValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
                prevValue = currentValue;
            }

            System.out.println("Integer equivalent: " + result);
        }
    }

    public static int getRomanValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
