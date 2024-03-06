/* 
    Author : Nikita Chandore
    
 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.

 */
class lengthOfLastWord {
    public int lengthOfLastWord(String sentence) {
        int start = 0;
        int end = 0;
        int lengthOfWord = 0;

        for(int i=0;i<sentence.length();i++){

            if(Character.isWhitespace(sentence.charAt(i)) || isPunctuation(sentence.charAt(i))){
                if(start<end){
                    lengthOfWord= end-start;
                }
                start = i+1;
                end = start;
            }
            else{
                end++;
            }
        }
        if(start<end){
            lengthOfWord = end - start;
        }
        return lengthOfWord;
    }
     public static boolean isPunctuation(char ch) {
        String punctuation = ".,;:!?()[]{}\"'";
        return punctuation.contains(String.valueOf(ch));
        }
    public static void main(String[] args) {
        lengthOfLastWord lastWord = new lengthOfLastWord();
        System.out.println(lastWord.lengthOfLastWord("Hello Java"));
    }
}