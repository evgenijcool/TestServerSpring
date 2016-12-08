package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Evgeny on 08.12.2016.
 */

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Greeter> sayHello(@RequestParam(value = "name",
            required = false,
            defaultValue = "Evgeny") String name) {

        return new ResponseEntity<>(new Greeter(counter.incrementAndGet(),
                String.format(template, name)), HttpStatus.OK);

    }

}
