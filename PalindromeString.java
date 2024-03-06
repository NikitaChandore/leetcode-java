/*
    Author : Nikita Chandore

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

class PalindromString{

    public boolean isPalindrome(String s){
        
        String cleanedStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = cleanedStr.length()-1;

        //Using String Reverse
        // String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        // if(cleanedStr.equals(reversedStr)){
        //     return true;
        // }
        // else return false;
        
        
        //Using two pointer
        boolean isPalindrome = true;
        while(start<end){
            if(cleanedStr.charAt(start) != cleanedStr.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;

    }
    public static void main(String[] args) {
        PalindromString palindromString = new PalindromString();
        System.out.println(palindromString.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(palindromString.isPalindrome("race a car"));
    }
}