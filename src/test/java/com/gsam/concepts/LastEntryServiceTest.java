package com.gsam.concepts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LastEntryServiceTest {

    private LastEntryService service;

    @Before
    public void setUp() {
        this.service = new LastEntryService();
    }

    @Test
    public void getWithMultipleStringList() {
        // Given
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        // When
        String actual = this.service.get(stringList);

        // Then
        Assert.assertNotNull("Given multiple list return string", actual);
        Assert.assertEquals("Given multiple list return last entry string", "Three", actual);
    }

    @Test
    public void getWithNullStringList() {
        // Given
        ArrayList<String> stringList = null;

        // When
        String actual = this.service.get(stringList);

        // Then
        Assert.assertNull("Given null list return null string", actual);
    }

    @Test
    public void getWithEmptyStringList() {
        // Given
        ArrayList<String> stringList = new ArrayList<>();

        // When
        String actual = this.service.get(stringList);

        // Then
        Assert.assertNull("Given empty list return null string", actual);
    }

    @Test
    public void getWithDeletedListElements() {
        // Given
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Four");
        stringList.add("Five");
        stringList.remove(0);
        stringList.remove(0);

        // When
        String actual = this.service.get(stringList);

        // Then
        Assert.assertNull("Given deleted list return null", actual);
    }
}