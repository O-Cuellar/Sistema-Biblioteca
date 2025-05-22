package fakedb;

import domain.people.Reader;

public class ReaderFakeDB extends BaseFakeDB<Reader>{
    @Override
    protected void DataFill(){
        this.instance.add(new Reader(1, null, null, "Zé", "03462598714", 17));
    }

    public ReaderFakeDB(){
        super();
    }
}
