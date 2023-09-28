package hangman.word;

class Letter {

    private String letter;
    private boolean isGuessed = false;

    Letter(String letter) {
        this.letter = letter;
        if (isSpace())
            isGuessed = true;
    }

    boolean match(String letter) {
        return this.letter.equalsIgnoreCase(letter);
    }

    boolean isGuessed() {
        return isGuessed;
    }

    void setGuessed() {
        isGuessed = true;
    }

    private boolean isSpace() {
        return this.letter.equals(" ");
    }

    @Override
    public String toString() {
        if (isGuessed)
            return letter;
        else
            return "()";
    }
}
