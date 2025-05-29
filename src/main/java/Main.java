public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        String text = cipher.encrypt("abcd", 1);
        System.out.println(text);
        text = cipher.decrypt(text, 1);
        System.out.println(text);
    }
}
