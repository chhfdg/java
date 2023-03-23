import java.util.Scanner;

 class VowelConsonantSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                vowels.append(c);
            } else {
                consonants.append(c);
            }
        }
        
        System.out.println("Vowels in the word: " + vowels.toString());
        System.out.println("Consonants in the word: " + consonants.toString());
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

