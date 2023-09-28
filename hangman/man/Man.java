package hangman.man;

public abstract class Man {

    private static int mistake = 0;
    private static Man man;

    static {
        getInstance();
    }

    private static void getInstance() {
        switch (mistake) {
            case 0:
                man = new ZeroMan();
                break;
            case 1:
                man = new FirstMan();
                break;
            case 2:
                man = new SecondMan();
                break;
            case 3:
                man = new ThirdMan();
                break;
            case 4:
                man = new FourthMan();
                break;
            case 5:
                man = new FifthMan();
                break;
            case 6:
                man = new SixthMan();
                break;
            default:
                man = new SeventhMan();
        }
    }

    public static void incrementMistake() {
        mistake++;
        getInstance();
    }

    public static void reset() {
        mistake = 0;
        getInstance();
    }

    public static void display() {
        System.out.println(man);
    }
}
