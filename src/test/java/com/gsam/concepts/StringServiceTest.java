package com.gsam.concepts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringServiceTest {

    private StringService stringService;

    @Before
    public void setUp() {
        this.stringService = new StringService();
    }

    @Test
    public void sortByLengthAscendingWithMultipleStrings() {
        // Given
        String[] array = new String[]{"A","BBB","CC"};

        // When
        this.stringService.sortByLengthAscending(array);

        // Then
        Assert.assertEquals("0", "A", array[0]);
        Assert.assertEquals("1", "CC", array[1]);
        Assert.assertEquals("2", "BBB", array[2]);
    }

    @Test
    public void sortByLengthAscendingWithEmptyArrayGiven() {
        // Given
        String[] array = new String[]{};

        // When
        this.stringService.sortByLengthAscending(array);

        // Then
        Assert.assertEquals("Array Length", 0, array.length);
    }

    @Test
    public void sortByLengthAscendingWithNullArrayGiven() {
        // Given
        String[] array = null;

        // When
        this.stringService.sortByLengthAscending(array);

        // Then
        Assert.assertNull(array);
    }

    @Test
    public void sortByLengthDescendingWithMultipleStrings() {
        // Given
        String[] array = new String[]{"DD","EEEE","FFF"};

        // When
        this.stringService.sortByLengthDescending(array);

        // Then
        Assert.assertEquals("0", "EEEE", array[0]);
        Assert.assertEquals("1", "FFF", array[1]);
        Assert.assertEquals("2", "DD", array[2]);
    }

    @Test
    public void sortByLengthDescendingWithEmptyArrayGiven() {
        // Given
        String[] array = new String[]{};

        // When
        this.stringService.sortByLengthDescending(array);

        // Then
        Assert.assertEquals("Array Length", 0, array.length);
    }

    @Test
    public void sortByLengthDescendingWithNullArrayGiven() {
        // Given
        String[] array = null;

        // When
        this.stringService.sortByLengthDescending(array);

        // Then
        Assert.assertNull(array);
    }

    @Test
    public void sortByFirstCharacterWithMultipleString() {
        // Given
        String[] array = new String[]{"One","Two","Six","Four"};

        // When
        this.stringService.sortByFirstCharacter(array);

        // Then
        Assert.assertEquals("0", "Four", array[0]);
        Assert.assertEquals("1", "One", array[1]);
        Assert.assertEquals("2", "Six", array[2]);
        Assert.assertEquals("3", "Two", array[3]);
    }

    @Test
    public void sortByFirstCharacterWithEmptyArrayGiven() {
        // Given
        String[] array = new String[]{};

        // When
        this.stringService.sortByFirstCharacter(array);

        // Then
        Assert.assertEquals("Array Length", 0, array.length);
    }

    @Test
    public void sortByFirstCharacterWithNullArrayGiven() {
        // Given
        String[] array = null;

        // When
        this.stringService.sortByFirstCharacter(array);

        // Then
        Assert.assertNull(array);
    }
}
