public class SimpleEncryptKeyphrase {
    private static final String KEY_PHRASE = "EDERNILSONEDERNILSONEDERNIL";
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleEncryptKeyphrase <string>");
            System.exit(1);
        }
        String toEncrypt = args[0];
        String encrypted = encrypt(toEncrypt);
        System.out.println("Encrypted: " + encrypted);
        // String decrypted = decrypt(encrypted);
        // System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String toEncrypt) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < toEncrypt.length(); i++) {
            char c = toEncrypt.charAt(i);
            int index = ALPHABET.indexOf(Character.toUpperCase(c));
            if (index == -1) {
                encrypted.append(c);
            } else {
                char newChar = KEY_PHRASE.charAt(index);
                encrypted.append(newChar);
            }
        }
        return encrypted.toString();
    }
}
