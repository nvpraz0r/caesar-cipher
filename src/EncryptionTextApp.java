// public class EncryptionTextApp {
//     // Class variables
//     String message = "";
//     int shift;
//     char arrayMessage[];

//     private static char[] EncryptionFinder(char[] arrayMessage, int shift) {
//         char[] encrypted = new char[arrayMessage.length];
//         for (int i = 0; i < arrayMessage.length; i++) {
//             char c = (char) (((int) arrayMessage[i] + shift - 65) % 26 + 65);
//             encrypted[i] = c;
//         }
//         return encrypted;
//     }

//     private static char[] DecryptionFinder(char[] arrayMessage, int shift) {
//         char[] decrypted = new char[arrayMessage.length];
//         shift = 26 - shift;
//         for (int i = 0; i < arrayMessage.length; i++) {
//             char c = (char) (((int) arrayMessage[i] + shift - 65) % 26 + 65);
//             decrypted[i] = c;
//         }
//         return decrypted;
// //		char[] decrypted = Encryption(arrayMessage,26 - shift);
// //		return decrypted;
//     }

//     /**
//      * in order to get brute force working
//      * feed loop into string builder
//      * send string builder back to gui
//     */
//     private static void BruteForceFinder(char[] arrayMessage, int shift) {
//         for (int i = 1; i < 26; i++) {
//             shift = i;
//             char[] bruteForce = DecryptionFinder(arrayMessage, shift);
//             System.out.println("Shift variation: " + (i) + "\t Message: " + new String(bruteForce));
//         }
//     }

//     public String callEncryption(String messageField, int shiftValueField) {
// //        Uncommment below for text/command driven application
//        message = Console.getString("Please enter a message to encrypt:");
//        shift = Console.getInt("Please enter a shift value:");
//        message = message.toUpperCase();
//        arrayMessage = message.toCharArray();
//        arrayMessage = Encryption(arrayMessage, shift);
//        System.out.println("Your encrypted message: " + new String(arrayMessage));
//     }

//     public String callDecryption(String messageField, int shiftValueField) {
// //        Uncommment below for text/command driven application
//        message = Console.getString("Please enter a message to decrypt:");
//        shift = Console.getInt("Please enter a shift value:");
//        message = message.toUpperCase();
//        arrayMessage = message.toCharArray();
//        arrayMessage = Decryption(arrayMessage, shift);
//        System.out.println("Your decrypted message: " + new String(arrayMessage));
//     }

//     public String callRandomEncryption(String messageField, int shiftValueField) {
//     //    Uncommment below for text/command driven application
//        message = Console.getString("Please enter a message to encrypt:");
//        shift = random.nextInt(26) + 1;
//        message = message.toUpperCase();
//        arrayMessage = message.toCharArray();
//        arrayMessage = Encryption(arrayMessage, shift);
//        System.out.println("Your randomly encrypted message: " + new String(arrayMessage));
//     }

//     public String callBruteforceEncryption(String messageField, int shiftValueField) {
// //        Uncommment below for text/command driven application
//        message = Console.getString("Please enter an encrypted message to brute force:");
//        message = message.toUpperCase();
//        arrayMessage = message.toCharArray();
//        BruteForce(arrayMessage, shift);
//     }
// }
