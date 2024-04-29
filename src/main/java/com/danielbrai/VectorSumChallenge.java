package com.danielbrai;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VectorSumChallenge {

    public int[] executeAlgorithm(int[] input, int target) {

        if (Objects.isNull(input) || input.length < 2) {
            return new int[0];
        }

        if (input.length == 2 && input[0] + input[1] != target) {
            return new int[0];
        } else {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < input.length; i++) {
                map.put(input[i], target-input[i]);
            }

            for (int j : input) {
                if(map.containsKey(target-j)) {
                    return new int[]{map.get(target-j), target-map.get(target-j)};
                }
            }
        }
        return new int[]{};
    }
}
