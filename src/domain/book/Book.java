package domain.book;

import java.time.LocalDate;

public class Book extends BaseBook {
    public Book(long id, LocalDate loanDate, LocalDate returnDate, String name, String author, String publisher,
            String category) {
        super(id, loanDate, returnDate, name, author, publisher, category);
    }
}