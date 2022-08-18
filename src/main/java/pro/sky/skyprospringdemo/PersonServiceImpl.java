package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonServise {

    Map<String, Person> persons = new HashMap<>(Map.of(
            "22222",
            new Person("Ivan",
                    "Ivanov",
                    "22222",
                    2),
            "625424",
            new Person("Petr",
                    "Petrov", "625424", 1),
            "1234",
            new Driver("Vasiliy",
                    "Vasiliev",
                    "1234",
                    "112",
                    1),
            "2233",
            new TruckDriver("Ignat",
                    "Ignatovich",
                    "2233", "1233", 0)
    ));

    String[] professions = {
            "безработный",
            "водитель",
            "столяр",
            "плотник",
            "актер"
    };


    @Override
    public void addPerson( Person person ) {
        persons.put(person.getPassport(), person);
    }

    @Override
    public void addProfession( String passport, Integer profession ) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        person.getProfessionNumbers().add(profession);

    }

    @Override
    public String getPersonByPassport( String passport ) {
        Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        final String persoDiscription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + getProfessionNames((List<Integer>) person.getProfessionNumbers());
        return persoDiscription;
    }

    @Override
    public String getProfessionNames( List<Integer> professionNumbers ) {
        String result = "";
        for (Integer professionNumber : professionNumbers) {
            result = result + " " + professions[professionNumber];
        }
        return result;
    }
}
