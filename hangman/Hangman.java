package hangman;

import hangman.man.Man;
import hangman.screen.Screen;
import hangman.word.Dictionary;
import hangman.word.Word;
import hangman.word.input.LetterExistsException;
import hangman.word.input.LetterInput;

import java.util.Scanner;

public class Hangman {

    private LetterInput letterInput = new LetterInput();
    private final int CHANCES = 7;
    private int mistake = 1;

    public void play() {
        Dictionary dictionary = new Dictionary();
        String phrase = dictionary.getWord();
        Word word = new Word(phrase);

        while (true) {
            Screen.clear();
            Man.display();
            word.display();
            String letter = inputLetter();
            if (!word.isLetterExists(letter) && mistake < CHANCES) {
                mistake++;
                Man.incrementMistake();
            } else if (mistake >= CHANCES) {
                Man.incrementMistake();
                Screen.clear();
                break;
            } else if (word.isGuessed()) {
                Screen.clear();
                System.out.println("Congratulations! You guessed it!");
                System.out.print("The word is: ");
                word.display();
                playAgain();
            }
        }
        Man.display();
        System.out.println("The word is " + "\"" + phrase + "\"");
        playAgain();
    }

    private String inputLetter() {
        String letter;
        while (true) {
            try {
                System.out.print("Enter a letter: ");
                letter = letterInput.input();
                break;
            } catch (LetterExistsException e) {
                System.out.println("Letter already exists!");
            }
        }
        return letter;
    }

    private void playAgain() {
        Scanner console = new Scanner(System.in);
        System.out.print("Play again (y/n): ");
        char decision = console.next().charAt(0);
        if (decision == 'y' || decision == 'Y') {
            Man.reset();
            Hangman.main(null);
        } else
            System.exit(0);

    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.play();
    }
}
