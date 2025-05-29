public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        String text = cipher.caesar("abcd", 1);
        System.out.println(text);
        text = cipher.caesar(text, -1);
        System.out.println(text);
    }
}
