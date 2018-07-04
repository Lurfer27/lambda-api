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
    public void getWithMultipleList() {
        // Given
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // When
        String actual = this.service.get(list);

        // Then
        Assert.assertNotNull("NOT NULL", actual);
        Assert.assertEquals("EQUALS", "Three", actual);
    }

    @Test
    public void getWithMultipleArray() {
        // Given
        String[] list = new String[]{"Uno","Dos","Tres","Cuatro","Cinco","Seiss","Siete","Ocho","Nueve","Diez"};

        // When
        String actual = this.service.get(list);

        // Then
        Assert.assertNotNull("NOT NULL", actual);
        Assert.assertEquals("EQUALS", "Diez", actual);

    }

    @Test
    public void getWithNullList() {
        // Given
        ArrayList<String> list = null;

        // When
        String actual = this.service.get(list);

        // Then
        Assert.assertNull("Given null list return null string", actual);
    }

    @Test
    public void getWithNullArray() {
        // Given
        String[] array = null;

        // When
        String actual = this.service.get(array);

        // Then
        Assert.assertNull("Given null list return null string", actual);
    }

    @Test
    public void getWithEmptyList() {
        // Given
        ArrayList<String> list = new ArrayList<>();

        // When
        String actual = this.service.get(list);

        // Then
        Assert.assertNull("Given empty list return null string", actual);
    }

    @Test
    public void getWithDeletedListElements() {
        // Given
        ArrayList<String> list = new ArrayList<>();
        list.add("Four");
        list.add("Five");
        list.remove(0);
        list.remove(0);

        // When
        String actual = this.service.get(list);

        // Then
        Assert.assertNull("Given deleted list return null", actual);
    }
}
