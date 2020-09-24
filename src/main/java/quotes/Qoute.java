package quotes;

public class Qoute {
    private String author;
    private String text;

    public Qoute(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString(){
        return String.format("Author: %s\n%s",author,text);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQoute() {
        return text;
    }

    public void setQoute(String qoute) {
        this.text = text;
    }
}
