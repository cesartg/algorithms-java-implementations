package org.cesartg.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {
    @Test
    public void testCalculateLengthLongestSubsquence() {
        assertThat(LongestCommonSubsequence.calculateLengthLongestSubsequence("abcdefg", "azcyexg"), is(4));//aceg
        assertThat(LongestCommonSubsequence.calculateLengthLongestSubsequence("abcdefg", "abcde"), is(5));//abcde
        assertThat(LongestCommonSubsequence.calculateLengthLongestSubsequence("abcdefg", "xyz"), is(0));
        assertThat(LongestCommonSubsequence.calculateLengthLongestSubsequence("bcdefg", "afgjilo"), is(2));//fg
    }
}