package jon.helloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld2Application {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        SpringApplication.run(HelloWorld2Application.class, args);
    }

}
