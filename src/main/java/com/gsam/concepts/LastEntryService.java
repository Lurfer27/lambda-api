package com.gsam.concepts;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class LastEntryService {

    public <T> T get(List<T> objectList) {
        List<T> list = Optional.ofNullable(objectList)
                .orElseGet(ArrayList::new);

        return list.stream().parallel()
                .reduce((first, second) -> second)
                .orElse(null);
    }
}
