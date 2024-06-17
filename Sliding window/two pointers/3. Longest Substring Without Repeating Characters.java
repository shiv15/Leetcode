import java.util.HashSet;
import java.util.Set;

class MaximumRepeatingSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        char[] charArr = s.toCharArray();
        int maxLength = 0;
        int runningLength = 0;
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i; j < charArr.length; j++) {
                if (charSet.contains(charArr[j])) {
                    maxLength = Math.max(maxLength, runningLength);
                    runningLength = 0;
                    charSet.clear();
                    break;
                } else {
                    charSet.add(charArr[j]);
                    runningLength += 1;
                }
            }
        }
        return Math.max(maxLength, runningLength);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = new MaximumRepeatingSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}