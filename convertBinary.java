import java.util.Scanner;

public class convertBinary {
    static class CharBinary {
        char character;
        String binary;

        CharBinary(char character, String binary) {
            this.character = character;
            this.binary = binary;
        }
    }

    static String convertToBinary(char c) {
        StringBuilder binary = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binary.append(((c >> i) & 1) == 1 ? '1' : '0');
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to convert to binary: ");
        String input = scanner.nextLine();

        CharBinary[] characters = new CharBinary[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String binary = convertToBinary(c);
            characters[i] = new CharBinary(c, binary);
        }

        System.out.println("Binary representation:");
        for (CharBinary charBinary : characters) {
            System.out.println(charBinary.character + ": " + charBinary.binary);
        }

        scanner.close();
    }
}
