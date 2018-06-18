package com.gsam.concepts;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LastEntryService {

    public LastEntry get(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return null;
        }

        return new LastEntry(stringList.get(stringList.size() - 1));
    }
}
