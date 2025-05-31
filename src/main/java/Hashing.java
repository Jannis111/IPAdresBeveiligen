import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
    public String hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] hashBytes = md.digest(input.getBytes());

        // Convert to hex string
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b); // Bitwise to keep it positive
            if (hex.length() == 1) hexString.append('0'); // Padding
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
