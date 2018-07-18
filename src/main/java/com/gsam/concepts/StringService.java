package com.gsam.concepts;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

@Component
public class StringService {

    public void sortByLengthAscending(String[] array) {
        Optional.ofNullable(array)
                .ifPresent(stringArray -> Arrays.sort(stringArray, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.length() - s2.length();
                    }
                }));
    }

    public void sortByLengthDescending(String[] array) {
        Optional.ofNullable(array)
                .ifPresent(stringArray -> Arrays.sort(stringArray, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s2.length() - s1.length();
                    }
                }));
    }

    public void sortByFirstCharacter(String[] array) {
        Optional.ofNullable(array)
                .ifPresent(stringArray -> Arrays.sort(stringArray, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.charAt(0) - s2.charAt(0);
                    }
                }));
    }
}
