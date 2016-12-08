package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Evgeny on 08.12.2016.
 */
@Controller
@RequestMapping("/table")
public class TableController {


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getTable(@RequestParam(value = "header", required = false, defaultValue = "TestHeader") String header,
                                            @RequestParam(value = "row", required = false, defaultValue = "1") Integer countRow,
                                            @RequestParam(value = "columns", required = false, defaultValue = "1") Integer countColumns,
                                            @RequestParam(value = "color", required = false, defaultValue = "bebebe") String color) {
        Table table = new Table(countRow, countColumns, header, color);
        return new ResponseEntity<>(table.createHtmlTable(), HttpStatus.OK);

    }


}
