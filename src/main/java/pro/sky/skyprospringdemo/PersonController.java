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

    @GetMapping(path = "/person")
    public String getPersonInfo( @RequestParam("number") Integer number ) {
        try {
            final String person = personServise.getPerson(number);
            return person;
            //           if (person == null) {
            //             return "Попробуйте другой номер";

        } catch (BadPersonNumberExeption e) {
            return "Please try other number";
        } catch (
                Exception e) {
            e.printStackTrace();
            return "Попробуйте в другой раз";
        }finally {
            System.out.println("Работа метода getPersonInfo закончена");
        }
    }
}
