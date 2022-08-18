package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.PersonServise;
import pro.sky.skyprospringdemo.exeptions.BadPersonNumberExeption;

@RestController
public class PersonController {
    public final PersonServise personServise;

    public PersonController( PersonServise personServise ) {
        this.personServise = personServise;
    }


    @GetMapping(path = "/person/by-passport")
    public String getPersonInfo( @RequestParam("passport") String passport ) {

        return personServise.getPersonByPassport(passport);
    }
    @GetMapping(path = "/person/profession /add")
    public String addProfession( @RequestParam("passport") String passport,
                               @RequestParam("profession") Integer profession ) {
        personServise.addProfession(passport, profession );
        return "Профессия успешно добавлена";
    }

    @GetMapping(path = "/person/add")
    public String addPerson( @RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             @RequestParam("pasport") String pasport,
                             @RequestParam("profession") Integer profession ) {
        Person person = new Person(
                name,
                surname,
                pasport,
                profession
        );
        personServise.addPerson(person);
        return "Person added";
    }
}
