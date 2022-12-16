package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void wordCount_onlyCharNoSpace() {
        final String inputString = "prisikiskiakopusteliaudavomemesvisadakiekvienadienairbuvomelaimingi";
        final String expectedOutcome = "1";

        assertEquals(expectedOutcome, Integer.toString(word_counter.getWordsCount(inputString)));
    }

    @Test
    public void wordCount_onlyCharWithSpaces() {
        final String inputString = "prisikiskiakopusteliaudavome mes visada kiekviena diena ir buvome laimingi";
        final String expectedOutcome = "8";

        assertEquals(expectedOutcome, Integer.toString(word_counter.getWordsCount(inputString)));
    }

    @Test
    public void wordCount_onlyCharMultipleSpace() {
        final String inputString = "prisikiskiakopusteliaudavome  mes visada   kiekviena diena ir  buvome laimingi";
        final String expectedOutcome = "8";

        assertEquals(expectedOutcome, Integer.toString(word_counter.getWordsCount(inputString)));
    }

    @Test
    public void charCount_onlyWordsNoSpace() {
        final String inputString = "prisikiskiakopusteliaudavomemesvisadakiekvienadienairbuvomelaimingi";
        final String expectedOutcome = "67";

        assertEquals(expectedOutcome, Integer.toString(TextCounter.getCharsCount(inputString)));
    }

    @Test
    public void charCount_onlyWordsWithSpaces() {
        final String inputString = "prisikiskiakopusteliaudavome  mes visada   kiekviena diena ir  buvome laimingi";
        final String expectedOutcome = "78";

        assertEquals(expectedOutcome, Integer.toString(TextCounter.getCharsCount(inputString)));
    }

}

