package domain.book;

import java.time.LocalDate;

import domain.BaseParameter;

public abstract class BaseBook extends BaseParameter {

    protected String name;
    protected String author;
    protected String publisher;
    protected String category;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public BaseBook(long id, LocalDate loanDate, LocalDate returnDate, String name, String author, String publisher,
            String category) {
        super(id, loanDate, returnDate);
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
    }

}