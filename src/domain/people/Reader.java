package domain.people;

import java.time.LocalDate;

public class Reader extends BasePeople {

    public Reader(long id, LocalDate loanDate, LocalDate returnDate, String peopleName, String cpf, int age) {
        super(id, loanDate, returnDate, peopleName, cpf, age);
    }

}