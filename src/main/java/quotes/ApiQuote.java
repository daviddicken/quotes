package quotes;

public class ApiQuote extends Quote{
    String quoteAuthor;
    String quoteText;
    public ApiQuote(String author, String text) {
        super(author, text);

        this.quoteAuthor = author;
        this.quoteText = text;
    }

    public String toString(){
        return String.format("Api Author: %s\nQuote: %s",quoteAuthor, quoteText);
    }
}
