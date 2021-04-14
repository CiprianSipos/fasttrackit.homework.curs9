package ro.fasttrackit.curs9.curs9.homework.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee implements Person {
    private String position;
    private int monthlySalary;
    private LocalDateTime dateOfEmployement;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public LocalDateTime getDateOfEmployement() {
        return dateOfEmployement;
    }

    public void setDateOfEmployement(LocalDateTime dateOfEmployement) {
        this.dateOfEmployement = dateOfEmployement;
    }

    @Override
    public String firstName(String firstName) {
        return null;
    }

    @Override
    public String lastName(String lastName) {
        return null;
    }

    @Override
    public String adress(String adress) {
        return null;
    }

    @Override
    public LocalDateTime birthDay(LocalDateTime birthDay) {
        return birthDay;
    }
}
