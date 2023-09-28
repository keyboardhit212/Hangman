package hangman.screen;

public class Screen {

    private Screen() {}

    public static void clear() {
        System.out.println("\033\143");
    }
}
