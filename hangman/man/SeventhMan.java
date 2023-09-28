package hangman.man;

final class SeventhMan extends Man {

    @Override
    public String toString() {
        return """
               ____________
               |          _|_
               |         /   \\\\
               |        |     |
               |         \\\\_ _/
               |          _|_
               |         / | \\\\
               |          / \\\\
            ___|___      /   \\\\
            GAME OVER!
        """;
    }
}
