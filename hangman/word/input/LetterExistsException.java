package hangman.word.input;

public class LetterExistsException extends Exception {

    public LetterExistsException() {}

    public LetterExistsException(String message) {
        super(message);
    }
}
