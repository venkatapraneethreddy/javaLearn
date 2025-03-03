package learnprogramming;

public class EvenPositionWordsArray {
    public static void main(String[] args) {
        String s1 = "java is super awesome fun";
        String[] words = s1.split(" ");
        String result = "";
        
        for (int i = 1; i < words.length; i += 2) {
            result += words[i] + " ";
        }
        
        result = result.trim();
        System.out.println("Words in even positions: " + result);
    }
}
