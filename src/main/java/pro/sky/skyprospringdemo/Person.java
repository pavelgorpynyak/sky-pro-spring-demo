package pro.sky.skyprospringdemo;

public class Person {
    private String name;
    private String surname;

    private int professionNumber;


    public Person( String name, String surname, int professionNumber ) {
        this.name = name;
        this.surname = surname;
        this.professionNumber = professionNumber;
    }

    public String getName() {
        return this.name = name;
    }

    public String getSurname() {
        return this.surname = surname;
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

    public int getProfessionNumber() {
        return this.professionNumber = professionNumber;
    }

}

