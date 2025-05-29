import java.util.ArrayList;

public class CaesarCipher {

    public String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + shift) % 26 + base);
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public String decrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base - shift) % 26 + base);
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }
}
