package com.gsam.concepts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LastEntryController {

    private LastEntryService lastEntryService;

    public LastEntryController(LastEntryService lastEntryService) {
        this.lastEntryService = lastEntryService;
    }

    @PostMapping(value = "/last-entry")
    @ResponseStatus(value = HttpStatus.OK)
    public LastEntry greeting(@RequestBody List<String> stringList) {
        LastEntry lastEntry = this.lastEntryService.get(stringList);
        if (lastEntry == null) {
            throw new RuntimeException(String.format("Unable to find the last entry from the following list :- %s", stringList));
        }
        return lastEntry;
    }

    @ExceptionHandler(value = { RuntimeException.class })
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleRuntimeException(RuntimeException e) {
        return new Error(e.toString());
    }
}
