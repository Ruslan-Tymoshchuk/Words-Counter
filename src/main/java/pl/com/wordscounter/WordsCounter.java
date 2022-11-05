package pl.com.wordscounter;

import static java.util.Arrays.asList;
import static java.util.Collections.max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsCounter {

    public int countMaxAmountWords(String text) {
        List<Integer> amountWords = new ArrayList<>();
        for (String sentence : Arrays.asList(text.split("[.?!]"))) {
            amountWords.add(countAmountWords(asList(sentence.split(" "))));
        }
        if (amountWords.isEmpty()) {
            return 0;
        }
        return max(amountWords);
    }
    
    private int countAmountWords(List<String> words) {
        int wordsAmount = 0;
        for (String word : words) {
            if (!word.equals("")) {
                wordsAmount++;
            }
        }
        return wordsAmount;
    }
}