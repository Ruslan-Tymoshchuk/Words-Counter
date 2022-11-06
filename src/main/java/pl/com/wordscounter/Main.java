package pl.com.wordscounter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordsCounter wordsCounter = new WordsCounter();
        while (scanner.hasNext()) {
            System.out.println(wordsCounter.countMaxAmountWords(scanner.nextLine()));
        }
        scanner.close();
    }
}