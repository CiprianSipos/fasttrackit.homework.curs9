package ro.fasttrackit.curs9.curs9.homework.ex2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        DbAdmin dbAdmin = new DbAdmin();
        dbAdmin.setDbTechnology("Sql");
        dbAdmin.setMonthlySalary(5000);
        dbAdmin.setPosition("Data base programer ");

        dbAdmin.firstName("Cipri");
        dbAdmin.lastName("Sipos");
       //dbAdmin.birthDay(1990.31.01);
        dbAdmin.adress("Oradea, str I Creanga, nr 4. ");



    }
}
