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

            for (int j : input) {
                map.put(j, target - j);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                if (key + value == target) {
                    return new int[]{key, value};
                }
            }
        }
        return null;
    }
}
