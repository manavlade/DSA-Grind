package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class STR {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if (!Character.isLetterOrDigit(ch1)) {
                left++;
            } else if (!Character.isLetterOrDigit(ch2)) {
                right--;
            }

            else {
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }

    public static int firstUniqChar(String s) {
        int[] index = new int[26];
        Arrays.fill(index, -1);

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            freq[ch - 'a']++;

            if (index[ch - 'a'] < 0) {
                index[ch - 'a'] = i;
            }

        }
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                result = Math.min(result, index[i]);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int lengthOfLongestSubstring(String s) {
        /*
         * Imp
         * Given a string s, find the length of the longest substring without duplicate
         * characters.
         * Example 1:
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3. Note that "bca" and
         * "cab" are also correct answers.
         */
        int left = 0, right = 0;

        int count = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            count = Math.max(count, right - left + 1);
            right++;
        }

        return count;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static int compress(char[] chars) {
        int n = chars.length;
        int ans = 0;

        for (int i = 0; i < n;) {
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[ans++] = ch;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' }));
    }
}
