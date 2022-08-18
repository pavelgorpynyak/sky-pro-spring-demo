package pro.sky.skyprospringdemo;

import java.util.List;

public interface PersonServise {

    void addPerson( Person person );

    void addProfession( String passport, Integer profession );

    String getPersonByPassport( String passport );

    String getProfessionNames( List<Integer> professionNumbers );
}
