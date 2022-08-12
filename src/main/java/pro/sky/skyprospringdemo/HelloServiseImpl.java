package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiseImpl implements HelloServise {
    public String hello() {
        return "<b>hello</b>";
    }


    public String answerHello(String userName) {
        return "<b>hello</b>" + userName;
    }
}
