package fakedb;

import domain.book.Book;

public class BookFakeDB extends BaseFakeDB<Book> {
    @Override
    protected void DataFill() {
        this.instance.add(
                new Book(0, null, null, "O Guia do Mochileiro das Galáxias", "Douglas Addams", "Arqueiro", "Ficção"));
    }

    public BookFakeDB() {
        super();
    }
}
