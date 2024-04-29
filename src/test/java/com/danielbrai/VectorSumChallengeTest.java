package com.danielbrai;

import org.junit.jupiter.api.Assertions;
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
        int[] output = vectorSumChallenge.executeAlgorithm(input);
        Assertions.assertEquals(0, output.length);
    }


}