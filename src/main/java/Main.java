import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) throws Exception {
        CaesarCipher cipher = new CaesarCipher();
        String text = cipher.caesar("abcd", 1);
        System.out.println(text);
        text = cipher.caesar(text, -1);
        System.out.println(text);

        String IPAdress = "111.222.333";
        BetterCaesarCipher betterCaesarCipher = new BetterCaesarCipher();
        IPAdress = betterCaesarCipher.caesar(IPAdress, 1);
        System.out.println(IPAdress);
        IPAdress = betterCaesarCipher.caesar(IPAdress, -1);
        System.out.println(IPAdress);

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
}
