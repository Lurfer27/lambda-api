package com.gsam.concepts;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class LastEntryService {

    public <T> T get(List<T> list) {
        return this.getNotNullList(list)
                .stream()
                .parallel()
                .reduce((first, second) -> second)
                .orElse(null);
    }

    public <T> T get(T[] array) {
        return this.get(this.getListFromArray(array));
    }

    private <T> List<T> getNotNullList(List<T> list) {
        return Optional.ofNullable(list)
                .orElseGet(ArrayList::new);
    }

    private <T> List<T> getListFromArray(T[] array) {
        return Optional.ofNullable(array)
                .map(Arrays::asList)
                .orElse(null);
    }
}
