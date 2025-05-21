package domain;

public abstract class BaseId {
    protected long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public BaseId(long id) {
        this.id = id;
    }

}
