package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.exeptions.BadPersonNumberExeption;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonServise {

    List<Person> persons = new ArrayList<>(List.of(
            new Person("Ivan",
                    "Ivanov", 2),

            new Person("Petr",
                    "Petrov", 1),

            new Driver("Vasiliy",
                    "Vasiliev",
                    "1234", 0),

            new TruckDriver("Ignat",
                    "Ignatovich",
                    "2233", 4)
    ));

    String[] professions = {
            "безработный",
            "водитель",
            "столяр",
            "плотник",
    };


    @Override
    public String getPerson( Integer number ) {
        final Person person;
        if (number >= persons.size()) {
            //           return null;
            throw new BadPersonNumberExeption("ошибка в том, что номер человека, заведомо больше размера массива");
        }
        person = persons.get(number);

        final String persoDiscription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + professions[person.getProfessionNumber()];
        return persoDiscription;
    }

    @Override
    public void addPerson( Person person ) {
        persons.add(person);
    }
}
