package repository;

import fakedb.BaseFakeDB;
import java.util.ArrayList;

public abstract class BaseRepository<TDomain> {
    protected BaseFakeDB<TDomain> dataBase;

    public abstract void create(TDomain instance);

    public abstract void read(long id);

    public ArrayList<TDomain> read() {
        return this.dataBase.getInstance();
    }

    public abstract void update(TDomain instance);

    public abstract void delete(long id);
}
