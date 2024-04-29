package com.danielbrai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class VectorSumChallengeTest {


    static Stream<Arguments> shouldReturnEmptyArrayIfTheInputHasLessThanTwoElement(){
        return Stream.of(
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{}),
                null
        );
    }

    @ParameterizedTest
    @MethodSource
    public void shouldReturnEmptyArrayIfTheInputHasLessThanTwoElement(int[] input) {
        VectorSumChallenge vectorSumChallenge = new VectorSumChallenge();
        int[] output = vectorSumChallenge.executeAlgorithm(input, 0);
        Assertions.assertEquals(0, output.length);
    }

    @Test
    public void shouldReturnEmptyArrayIfTheInputHasExactlyTwoElementsButItSumDoesNotResultsInTargetNumber() {
        VectorSumChallenge vectorSumChallenge = new VectorSumChallenge();
        int[] input = new int[] {1,2};
        int[] output = vectorSumChallenge.executeAlgorithm(input, 10);
        Assertions.assertEquals(0, output.length);
    }

    @Test
    public void shouldReturnTheInputArrayIfTheInputHasExactlyTwoElementsAndItsSumResultsInTargetNumber() {
        VectorSumChallenge vectorSumChallenge = new VectorSumChallenge();
        int[] input = new int[] {1,2};
        int[] output = vectorSumChallenge.executeAlgorithm(input, 3);
        Assertions.assertEquals(2, output.length);
        Assertions.assertEquals(1, output[0]);
        Assertions.assertEquals(2, output[1]);
    }


}