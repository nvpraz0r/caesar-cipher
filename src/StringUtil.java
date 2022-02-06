public class StringUtil {

    private static final String LINESEP = "\t\t";

    public static void Menu() {

        // Menu
        System.out.println();
        System.out.println(LINESEP + LINESEP + "===MENU===");
        System.out.println(LINESEP + "enc " + LINESEP + "-To encrypt a message");
        System.out.println(LINESEP + "dec " + LINESEP + "-To decrypt a message with a known shift value");
        System.out.println(LINESEP + "ran " + LINESEP + "-To randomly encrypt a message with an unknown shift value");
        System.out.println(LINESEP + "brute " + LINESEP + "-To forcefully decrypt a message with an unknown shift value");
        System.out.println(LINESEP + "help " + LINESEP + "-To display the menu");
        System.out.println(LINESEP + "e " + LINESEP + "-To exit the application");
        System.out.println(LINESEP + LINESEP + "==========");
        System.out.println();
    }
}
