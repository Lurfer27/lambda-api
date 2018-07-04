package com.gsam.concepts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortestToLongestController {

    private StringService stringService;

    public ShortestToLongestController(StringService stringService) {
        this.stringService = stringService;
    }

    @PostMapping(value = "/shortest-to-longest")
    @ResponseStatus(value = HttpStatus.OK)
    public String[] shortestToLongest(@RequestBody String[] list) {
        this.stringService.shortestToLongest(list);
        return list;
    }
}
