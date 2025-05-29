public class BetterCaesarCipher {
    public String caesar(String input, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            // Shift all printable ASCII characters (32–126)
            if (c >= 32 && c <= 126) {
                int shifted = ((c - 32 + shift) % 95);  // 95 printable chars
                if (shifted < 0) shifted += 95;         // Handle negative shifts
                result.append((char) (shifted + 32));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
