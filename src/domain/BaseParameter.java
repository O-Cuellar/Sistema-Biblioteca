package domain;

import java.time.LocalDate;

public abstract class BaseParameter extends BaseId {
    protected LocalDate loanDate;
    protected LocalDate returnDate;

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public BaseParameter(long id, LocalDate loanDate, LocalDate returnDate) {
        super(id);
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    
}