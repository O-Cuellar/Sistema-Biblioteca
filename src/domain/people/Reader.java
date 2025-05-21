package domain.people;

import domain.BaseParameter;
import java.time.LocalDate;

public class Reader extends BaseParameter {

    protected String readerName;
    protected String cpf;
    protected int age;

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Reader(long id, LocalDate loanDate, LocalDate returnDate, String readerName, String cpf, int age) {
        super(id, loanDate, returnDate);
        this.readerName = readerName;
        this.cpf = cpf;
        this.age = age;
    }
}
