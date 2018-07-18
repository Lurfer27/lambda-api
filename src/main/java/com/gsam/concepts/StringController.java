package com.gsam.concepts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    private StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @PostMapping(value = "/sort-by-length-ascending")
    @ResponseStatus(value = HttpStatus.OK)
    public String[] sortByLengthAscending(@RequestBody String[] list) {
        this.stringService.sortByLengthAscending(list);
        return list;
    }
}
