package com.danielbrai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorSumChallengeTest {

    @Test
    public void shouldReturnEmptyArrayIfTheInputHasOnlyOneElement() {
        int[] input = {1};
        VectorSumChallenge vectorSumChallenge = new VectorSumChallenge();
        int[] ints = vectorSumChallenge.executeAlgorithm(input);
        Assertions.assertEquals(0, ints.length);
    }

}