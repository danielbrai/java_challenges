package com.danielbrai;

import java.util.Objects;

public class VectorSumChallenge {

    public int[] executeAlgorithm(int[] input, int target) {

        if (Objects.isNull(input) || input.length < 2 || input.length == 2 && input[0] + input[1] != target) {
            return new int[0];
        }

        return null;
    }
}
