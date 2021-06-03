/*
 *  UCF COP3330 Summer 2021 Exercise 3 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_quote_and_author_in_proper_format() {
        App myApp = new App();
        String testQuote = "These aren't the droids you're looking for.";
        String testAuthor = "Obi-Wan Kenobi";

        String expectedOutput = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualOutput = myApp.generateOutputString(testQuote, testAuthor);

        assertEquals(expectedOutput, actualOutput);
    }
}