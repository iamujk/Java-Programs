import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        char result = findFirstNonRepeatingChar(str);
        
        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
        
        sc.close();
    }
    
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first character with count 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        return '\0'; // Return null character if no non-repeating character found
    }
}
