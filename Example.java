package learnprogramming;

public class Example {
    public static void main(String[] args) {
        String input = "Java is a powerful programming language";
        
        // Splitting the sentence into words
        String words[] = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) { // Even position -> Reverse the word
                words[i] = reverseWord(words[i]);
            } else { // Odd position -> Convert to uppercase
                words[i] = words[i].toUpperCase();
            }
        }
        
        // Joining the words back into a sentence
        String result = String.join(" ", words);
        System.out.println("Modified String: " + result);
    }
    
    // Function to reverse a word
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
