package pl.com.wordscounter;

import static java.util.Arrays.asList;
import static java.util.Collections.max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.Validate;

public class WordsCounter {

    public static final String TEXT_PATTERN = "[a-z'A-Z .?!]*";
    public static final String PUNCTUATION_MARKS = "[.?!]";

    public int countMaxAmountWords(String text) {
        int amount = 0;
        try {
            Validate.matchesPattern(text, TEXT_PATTERN);
            List<Integer> amountWords = new ArrayList<>();
            for (String sentence : Arrays.asList(text.split(PUNCTUATION_MARKS))) {
                amountWords.add(countAmountWords(asList(sentence.split(" "))));
            }
            amount = max(amountWords);
        } catch (IllegalArgumentException | NoSuchElementException e) {
            throw new IllegalInputTextException(
                    "Make sure that input text matches according to the condition! " + text, e);
        }
        return amount;
    }

    private int countAmountWords(List<String> words) {
        int wordsAmount = 0;
        for (String word : words) {
            if (!word.equals("") && !word.equals("'")) {
                wordsAmount++;
            }
        }
        return wordsAmount;
    }
}