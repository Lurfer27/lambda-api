package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LastEntryController {

    @PostMapping(value = "/last-entry")
    public ResponseEntity<?> greeting(@RequestBody List<String> stringList) {
        return new ResponseEntity<>(new LastEntry(stringList.get(0)), HttpStatus.OK);
    }
}
