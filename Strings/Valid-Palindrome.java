// Problem: Valid Palindrome (Leetcode #125)
// Pattern: Two Pointers
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}

// Approach :
// 1. Initialize two pointers:
//    - start = 0 (beginning of string)
//    - last = s.length() - 1 (end of string)
//
// 2. Traverse the string while start <= last.
//
// 3. Ignore non-alphanumeric characters:
//    - If current character at start is not a letter/digit,
//      move start forward.
//    - If current character at last is not a letter/digit,
//      move last backward.
//
// 4. Convert both valid characters to lowercase
//    and compare them.
//
// 5. If characters do not match,
//    return false because the string is not a palindrome.
//
// 6. If they match,
//     move both pointers inward.
//
// 7. If the loop completes without mismatch,
//    return true.
