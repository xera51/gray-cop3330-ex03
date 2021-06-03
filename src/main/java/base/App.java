/*
 *  UCF COP3330 Summer 2021 Exercise 3 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.readQuote();
        String author = myApp.readAuthor();
        String output = myApp.generateOutputString(quote, author);
        myApp.displayOutput(output);
    }

    public String readQuote() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    public String readAuthor() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }

    public String generateOutputString(String quote, String author) {
        return author + " says, \"" + quote + "\"";
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }
}
