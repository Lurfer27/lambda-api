package com.gsam.concepts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LastEntryController {

    private LastEntryService lastEntryService;

    public LastEntryController(LastEntryService lastEntryService) {
        this.lastEntryService = lastEntryService;
    }

    @PostMapping(value = "/last-entry")
    @ResponseStatus(value = HttpStatus.OK)
    public Object lastEntry(@RequestBody Object[] list) {
        return this.lastEntryService.get(list);
    }
/*
    @ExceptionHandler(value = { RuntimeException.class })
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleRuntimeException(RuntimeException e) {
        return new Error(e.toString());
    }
    */
}
