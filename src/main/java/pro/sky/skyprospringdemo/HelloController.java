package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloServise helloServise;

    public HelloController(HelloServise helloServise) {
        this.helloServise = helloServise;
    }
    @GetMapping
    public String hello() {
        return helloServise.hello();
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloServise.answerHello(userName);
    }
}
