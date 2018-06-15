package com.gsam.concepts;

import java.util.List;

public class LastEntryService {

    public String get(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return null;
        }

        return stringList.get(stringList.size() - 1);
    }
}
