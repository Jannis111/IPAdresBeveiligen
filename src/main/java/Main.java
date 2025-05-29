import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
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
    }
}
