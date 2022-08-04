import java.util.HashMap;
class HelloWorld {
    public static int lengthOfLongestSubstring(String s) {
	// create and initialize HashMap to false for all the characters in the string
	HashMap<Character, Boolean> map = new HashMap<>();
	for (char c : s.toCharArray())
		map.put(c,false);

	// two pointers for the sliding window technique
	int left = 0, right = 0;
	int maxLen = 0; // variable to keep the maximum length so far

	while (right < s.length() && left < s.length()){
		// if the right char is a duplicate, increment left (and mark false) until there is no duplicate
		if (map.get(s.charAt(right)))
			map.put(s.charAt(left++),false);
		else { // keep incrementing left and counting maxLen while there is no duplicate
			map.put(s.charAt(right),true);
			maxLen = Math.max(maxLen,right-left+1);
			right++;
		}
	}
	return maxLen;
}
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}