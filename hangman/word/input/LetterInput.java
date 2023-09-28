package hangman.word.input;

import java.util.*;

public class LetterInput {

    private Set<String> inputHistory;
    private Scanner console = new Scanner(System.in);

    public LetterInput() {
        this.inputHistory = new HashSet<>();
    }

    public String input() throws LetterExistsException {
        String letter = String.valueOf(console.next().charAt(0));
        if (inputHistory.add(letter.toLowerCase()))
            return letter;
        else
            throw new LetterExistsException();
    }

}
