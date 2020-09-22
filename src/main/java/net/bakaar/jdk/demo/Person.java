package net.bakaar.jdk.demo;

import java.time.LocalDate;
import java.time.Period;

//tag::record[]
public record Person(String name, String surname, LocalDate birthday) {

    public int calculateAge(LocalDate today) {
        return Period.between(birthday, today).getYears();
    }
}
//end::record[]
