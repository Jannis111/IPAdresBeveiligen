import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) throws Exception {
        caesarCipher();
        betterCaesarCipher();
        asymmetricEncryption();
        hashing("testPassword");
    }

    public static void caesarCipher() {
        CaesarCipher cipher = new CaesarCipher();
        String text = cipher.caesar("abcd", 1);
        System.out.println(text);
        text = cipher.caesar(text, -1);
        System.out.println(text);
    }

    public static void betterCaesarCipher() {
        String IPAdress = "111.222.333";
        BetterCaesarCipher betterCaesarCipher = new BetterCaesarCipher();
        IPAdress = betterCaesarCipher.caesar(IPAdress, 1);
        System.out.println(IPAdress);
        IPAdress = betterCaesarCipher.caesar(IPAdress, -1);
        System.out.println(IPAdress);
    }

    public static void asymmetricEncryption() throws Exception {
        String originalMessage = "This is a secret IP: 192.168.0.1";

        // Generate keys
        AsymmetricEncryption asymmetricEncryption = new AsymmetricEncryption();
        KeyPair pair = asymmetricEncryption.generateKeyPair();
        PublicKey pubKey = pair.getPublic();
        PrivateKey privKey = pair.getPrivate();

        // Encrypt with public key
        String encrypted = asymmetricEncryption.encrypt(originalMessage, pubKey);
        // Decrypt with private key
        String decrypted = asymmetricEncryption.decrypt(encrypted, privKey);

        System.out.println("Original Message : " + originalMessage);
        System.out.println("Encrypted Message: " + encrypted);
        System.out.println("Decrypted Message: " + decrypted);
    }

    public static void hashing(String input) throws NoSuchAlgorithmException {
        Hashing hashing = new Hashing();
        System.out.println("Hashed password: " + hashing.hash(input));
    }
}
