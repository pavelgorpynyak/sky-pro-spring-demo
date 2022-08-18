package pro.sky.skyprospringdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;

    private String passport;

    private Set<Integer> professionNumbers;


    public Person( String name, String surname, String passport,int professionNumber ) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumbers = new HashSet<>(List.of(professionNumber));
    }

    public String getName() {
        return this.name = name;
    }

    public String getSurname() {
        return this.surname = surname;
    }

    public String getPassport() {
        return this.passport = passport;
    }


    public void setName( String name ) {
        this.name = name;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public String toString( String name, String surname ) {
        return name + surname;
    }

    public Set<Integer> getProfessionNumbers() {
        return this.professionNumbers = professionNumbers;
    }

}

