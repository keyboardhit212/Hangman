package hangman.word;

public class Word {

    private String word;
    private Letter[] letters;

    public Word(String word) {
        this.word= word;
        letters = new Letter[word.length()];
        initialize();
    }

    public boolean isLetterExists(String character) {
        boolean result = false;
        for (Letter letter : letters) {
            if (letter.match(character)) {
                letter.setGuessed();
                result = true;
            }

        }
        return result;
    }

    public boolean isGuessed() {
        boolean result = true;
        for (Letter letter : letters) {
            if (!letter.isGuessed())
                result = false;
        }
        return result;
    }

    public int remainingLetters() {
        int count = 0;
        for (Letter letter : letters)
            if (!letter.isGuessed())
                count++;
        return count;
    }

    public void display() {
        System.out.println(getStringRepresentation());
    }

    private String getStringRepresentation() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            stringBuilder.append(letters[i]);
        }
        return stringBuilder.toString();
    }

    private void initialize() {
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(String.valueOf(word.charAt(i)));
        }
    }
}
