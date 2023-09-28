package hangman.word;

import java.util.Random;

public class Dictionary {

    private String[] wordList = {
        "Better late than never",
        "Once bitten, twice shy",
        "Through thick and thin",
        "Bite the bullet",
        "Call it a day",
        "Break a leg",
        "Beat around the bush",
        "A penny for your thoughts",
        "Speak of the devil",
        "Don't judge a book by its cover",
        "A watched pot never boils",
        "Let someone off the hook",
        "No man is an island",
        "When pigs fly",
        "Easier said than done",
        "To add insult to injury",
        "The world is my oyster",
        "A perfect storm",
        "It's greek to me",
        "A blessing in disguise",
        "No pain, no gain",
        "What's done is done"
    };

    public Dictionary() {}

    public String getWord() {
        return wordList[generateRandomInt()];
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(wordList.length) ;
    }
}
