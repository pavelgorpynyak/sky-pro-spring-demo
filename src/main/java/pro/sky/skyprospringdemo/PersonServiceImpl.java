package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.exeptions.BadPersonNumberExeption;

@Service
public class PersonServiceImpl implements PersonServise {

    Person[] persons = {
            new Person("Ivan",
                    "Ivanov", 2),

            new Person("Petr",
                    "Petrov", 1),

            new Driver("Vasiliy",
                    "Vasiliev",
                    "1234", 0),

            new TruckDriver("Ignat",
                    "Ignatovich",
                    "2233", 4),
    };

    String[] professions = {
            "безработны",
            "водитель",
            "столяр",
            "плотник",
    };


    @Override
    public String getPerson( Integer number ) {
        final Person person;
        if (number >= persons.length) {
 //           return null;
            throw new BadPersonNumberExeption("ошибка в том, что номер человека, заведомо больше размера массива");
        }
        person = persons[number];

        final String persoDiscription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + professions[person.getProfessionNumber()];
        return persoDiscription;
    }
}
