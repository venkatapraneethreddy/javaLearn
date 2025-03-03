package learnprogramming;

public class FirstRepeatAndNonReapeatCharInString {
    public static void main(String[] args) {
        String s1 = "java is super";
        
        char firstRepeated = '\0';
        char firstNonRepeated = '\0';
        
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch != ' ' && s1.indexOf(ch) != s1.lastIndexOf(ch)) {
                firstRepeated = ch;
                break;
            }
        }
        
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch != ' ' && s1.indexOf(ch) == s1.lastIndexOf(ch)) {
                firstNonRepeated = ch;
                break;
            }
        }
        
        System.out.println("First Repeated Character: " + (firstRepeated != '\0' ? firstRepeated : "None"));
        System.out.println("First Non-Repeated Character: " + (firstNonRepeated != '\0' ? firstNonRepeated : "None"));
    }
}
