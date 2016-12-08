package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Evgeny on 08.12.2016.
 */

@SpringBootApplication
public class HelloWorldConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldConfiguration.class,args);
    }
}
