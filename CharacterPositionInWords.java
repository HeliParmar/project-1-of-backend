import java.util.Scanner;

public class CharacterPositionInWords {
    public static void displayPositions(String[] words, char Letter) {
        for (String word : words) {
            StringBuilder positions = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == Letter) {
                    positions.append(i).append(" ");
                }
            }
            System.out.println("Word: " + word + ", Positions of '" + Letter + "': " + positions.toString().trim());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }
        System.out.print("Enter a letter to find its position: ");
        char Letter = scanner.next().charAt(0);
        displayPositions(words, Letter);

        scanner.close();
    }
}
