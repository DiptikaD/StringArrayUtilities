package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class GetConsecutiveDuplicatesTest {



    @Test
    public void testRemoveConsecutiveDuplicates1() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "bbb"};
        Assert.assertEquals(actual, expected);
    }



    @Test
    public void testRemoveConsecutiveDuplicates2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        // removed "bba" deuplicate in the expected
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bbb"};
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testRemoveConsecutiveDuplicates3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "aba", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        // removed "bba" duplicate in the expected
        // also removed the duplicate "aba" in the expected
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bbb"};
        Assert.assertEquals(actual, expected);
    }

}
