package com.gsam.concepts;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

@Component
public class StringService {

    public void shortestToLongest(String[] array) {
        Optional.ofNullable(array)
                .ifPresent(stringArray -> Arrays.sort(stringArray, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.length() - s2.length();
                    }
                }));
    }
}
