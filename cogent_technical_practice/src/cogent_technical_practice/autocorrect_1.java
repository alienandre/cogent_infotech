package cogent_technical_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class autocorrect_1 {
	public static String[] findAnagrams(String[] words, String[] queries) {
        // Create a HashMap to store the sorted version of each word in words
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(word);
        }
        
        // For each query, find the corresponding list of anagrams from the HashMap
        String[] results = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            char[] chars = queries[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (map.containsKey(sorted)) {
                List<String> list = map.get(sorted);
                Collections.sort(list);
                results[i] = String.join(" ", list);
            } else {
                results[i] = "";
            }
        }
        
        return results;
	}

	public static void main(String[] args) {
		String[] test1 = {"duel", "speed", "dule", "cars"};
		String[] test2 = {"spede", "deul"};
		String[] anagrams = findAnagrams(test1,test2);
		for(String anagram: anagrams) {
			System.out.println(anagram);
		}
	}

}
