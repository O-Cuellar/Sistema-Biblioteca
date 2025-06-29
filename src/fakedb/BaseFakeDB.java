package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDomain> {

    protected ArrayList<TDomain> instance;

    public ArrayList<TDomain> getInstance() {
        if (this.instance == null) {
            this.instance = new ArrayList<>();
        }
        return this.instance;
    }

    public BaseFakeDB() {
        this.instance = new ArrayList<>();
        this.DataFill();
    }

    protected abstract void DataFill();
}