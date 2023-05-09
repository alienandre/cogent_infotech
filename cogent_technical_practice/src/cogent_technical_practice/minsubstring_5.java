package cogent_technical_practice;


import java.util.HashSet;
import java.util.Set;

public class minsubstring_5 {
	public static int splitString(String s) {
		 // Create a HashSet to store unique characters
        Set<Character> set = new HashSet<>();
        // Initialize the answer variable to 1
        int ans = 1;
        // Iterate through the given string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is already
            // present in the set
            if (set.contains(s.charAt(i))) {
                // If it is, increment the answer variable
                // and clear the set to start a new
                // substring
                ans++;
                set.clear();
            }
            // Add the current character to the set
            set.add(s.charAt(i));
        }
        // Return the answer variable, which gives the
        // minimum number of substrings required
        return ans;
	    }

	public static void main(String[] args) {
		String A = "cycle";
		System.out.println(splitString(A));

	}

}
