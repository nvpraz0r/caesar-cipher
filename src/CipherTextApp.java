// public class CipherApp {

//    public static void main(String[] args) {

//        // Object to call encryption functions
//        Encryption Encryption = new Encryption();

//        // Variable to navigate the menu
//        String answer;

//        do {

//            // Print menu options
//            StringUtil.Menu();

//            // Prompt user input
//            answer = Console.getString("Please enter a command:");
//            System.out.println();

//            // switch case
//            switch (answer) {
//                case "enc":
//                    Encryption.callEncryption();
//                    break;
//                case "dec":
//                    Encryption.callDecryption();
//                    break;
//                case "ran":
//                    Encryption.callRandomEncryption();
//                    break;
//                case "brute":
//                    Encryption.callBruteforceEncryption();
//                    break;
//                case "help":
//                    StringUtil.Menu();
//                    break;
//                case "e":
//                    break;
//                default:
//                    System.out.println("Invalid command. Try again.");
//                    break;
//            }

//        } while (!answer.equalsIgnoreCase("e"));

//        // Thanks
//        System.out.println("Thank you for choosing my application.");
//    }
// }
