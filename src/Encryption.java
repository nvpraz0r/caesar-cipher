import java.util.Random;

public class Encryption {

    // Class variables
    String message = "";
    int shift;
    char arrayMessage[];

    private static char[] EncryptionFinder(char[] arrayMessage, int shift) {
        char[] encrypted = new char[arrayMessage.length];
        for (int i = 0; i < arrayMessage.length; i++) {
            char c = (char) (((int) arrayMessage[i] + shift - 65) % 26 + 65);
            encrypted[i] = c;
        }
        return encrypted;
    }

    private static char[] DecryptionFinder(char[] arrayMessage, int shift) {
        char[] decrypted = new char[arrayMessage.length];
        shift = 26 - shift;
        for (int i = 0; i < arrayMessage.length; i++) {
            char c = (char) (((int) arrayMessage[i] + shift - 65) % 26 + 65);
            decrypted[i] = c;
        }
        return decrypted;
    }

    /**
     * in order to get brute force working
     * feed loop into string builder
     * send string builder back to gui
    */
    private static void BruteForceFinder(char[] arrayMessage, int shift) {
        for (int i = 1; i < 26; i++) {
            shift = i;
            char[] bruteForce = DecryptionFinder(arrayMessage, shift);
            System.out.println("Shift variation: " + (i) + "\t Message: " + new String(bruteForce));
        }
    }

    public String callEncryption(String messageField, int shiftValueField) {
        messageField = messageField.toUpperCase();
        arrayMessage = messageField.toCharArray();
        arrayMessage = EncryptionFinder(arrayMessage, shiftValueField);
        return new String(arrayMessage);
    }

    public String callDecryption(String messageField, int shiftValueField) {
        messageField = messageField.toUpperCase();
        arrayMessage = messageField.toCharArray();
        arrayMessage = DecryptionFinder(arrayMessage, shiftValueField);
        return new String(arrayMessage);
    }

    public String callRandomEncryption(String messageField, int shiftValueField) {
        Random random = new Random();
        shift = random.nextInt(26) + 1;
        messageField = messageField.toUpperCase();
        arrayMessage = messageField.toCharArray();
        arrayMessage = EncryptionFinder(arrayMessage, shift);
        return new String(arrayMessage);
    }

    public String callBruteforceEncryption(String messageField, int shiftValueField) {
        return messageField;
    }
}