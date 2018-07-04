package com.gsam.concepts;

import org.junit.Assert;
import org.junit.Test;

public class StringServiceTest {

    @Test
    public void shortestToLongestWithMultipleStrings() {
        // Given
        String[] array = new String[]{"A","BBB","CC"};
        StringService stringService = new StringService();

        // When
        stringService.shortestToLongest(array);

        // Then
        Assert.assertEquals("0", "A", array[0]);
        Assert.assertEquals("1", "CC", array[1]);
        Assert.assertEquals("2", "BBB", array[2]);
    }

    @Test
    public void shortestToLongestWithEmptyArrayGiven() {
        // Given
        String[] array = new String[]{};
        StringService stringService = new StringService();

        // When
        stringService.shortestToLongest(array);

        // Then
        Assert.assertEquals("Array Length", 0, array.length);
    }

    @Test
    public void shortestToLongestWithNullArrayGiven() {
        // Given
        String[] array = null;
        StringService stringService = new StringService();

        // When
        stringService.shortestToLongest(array);

        // Then
        Assert.assertNull(array);
    }
}
