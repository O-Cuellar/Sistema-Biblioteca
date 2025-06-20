package domain.people;

import java.time.LocalDate;

import domain.BaseParameter;

public class BasePeople extends BaseParameter {

    protected String peopleName;
    protected String cpf;
    protected int age;

    public void setPName(String pName) {
        this.peopleName = pName;
    }

    public String getPName() {
        return peopleName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(String cpf) {
        return cpf;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BasePeople(long id, LocalDate loanDate, LocalDate returnDate, String peopleName, String cpf, int age) {
        super(id, loanDate, returnDate);
        this.peopleName = peopleName;
        this.cpf = cpf;
        this.age = age;
    }

}
