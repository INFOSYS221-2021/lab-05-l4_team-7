public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();

      System.out.println(ex01.reverseString("hello world"));
      System.out.println(ex01.reverseString("Dad"));
      System.out.println(ex01.reverseString("Bsuiness School"));
      
      // Uncomment the following statements after finishing Exercise Four
       System.out.println(ex01.isStringPalindrome("hello world"));
       System.out.println(ex01.isStringPalindrome("Dad"));
       System.out.println(ex01.isStringPalindrome("radar"));
    }
    
    // Exercise One
    private String reverseString(String word) {
        // Complete this method to return the reveresed order of the given word
        //take word
        //for each letter, append to new word, return new word
        String revWord = "";
        for (int i = 0; i < word.length();i++){
            //revWord = revWord + word.charAt(word.length() - i - 1);
            revWord = word.charAt(i) + revWord;
        }
        return revWord;
    }

    // Exercise Four
    private boolean isStringPalindrome(String word) {
        // Complete this method to deermine if the given word is a palindrome
        for (int i=0;i<word.length()/2;i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
