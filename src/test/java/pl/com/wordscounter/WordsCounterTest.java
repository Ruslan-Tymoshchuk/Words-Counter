package pl.com.wordscounter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordsCounterTest {

    private WordsCounter wordsCounter = new WordsCounter();

    @Test
    void givenSomeText_whenCountMaxAmountWords_thenAmountWords() {
        assertEquals(5, wordsCounter.countMaxAmountWords("I'm a coder. I'm not just a try?"));
    }

    @Test
    void givenSomeDifferentText_whenCountMaxAmountWords_thenAmountWords() {
        assertEquals(2, wordsCounter.countMaxAmountWords("Hello  EVeryone..You're welcome . w w"));
    }

    @Test
    void givenEmptyString_whenCountMaxAmountWords_thenAmountWords() {
        assertEquals(0, wordsCounter.countMaxAmountWords(""));
    }

    @Test
    void givenPunctuationMarks_whenCountMaxAmountWords_thenAmountWords() {
        assertEquals(0, wordsCounter.countMaxAmountWords(". ? !"));
    }

    @Test
    void givenNonConditionText_whenCountMaxAmountWords_thenException() {
        Throwable exception = assertThrows(IllegalInputTextException.class,
                () -> wordsCounter.countMaxAmountWords("%Non condition text/"));
        assertEquals("Make sure that input text matches according to the condition! %Non condition text/",
                exception.getMessage());
    }

    @Test
    void givenNull_whenCountMaxAmountWords_thenException() {
        assertThrows(NullPointerException.class, () -> wordsCounter.countMaxAmountWords(null));
    }
}