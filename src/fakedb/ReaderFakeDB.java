package fakedb;

import domain.people.Reader;

public class ReaderFakeDB extends BaseFakeDB<Reader> {
    @Override
    protected void DataFill() {
        this.instance.add(new Reader(0, null, null, "João", "09787843123", 23));
    }

    public ReaderFakeDB() {
        super();
    }
}
