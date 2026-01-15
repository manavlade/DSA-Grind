package String;

import java.util.Arrays;

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

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
