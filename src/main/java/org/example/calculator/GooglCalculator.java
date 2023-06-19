package org.example.calculator;

import java.util.List;

public class GooglCalculator {
    static Calculator<Integer, Integer> multi = (a, b) -> a * b;

    static Calculator<Integer, Integer> sum = (a, b) -> a + b;


    public static int product(List<Integer> nums) {
        return calculate(nums, multi);
    }

    public static int sum(List<Integer> nums) {
        return calculate(nums, sum);
    }

    public static int calculate(List<Integer> nums, Calculator calculator) throws IllegalArgumentException {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }

        int result = nums.get(0);
        for (Integer num : nums) {
            result = (int) calculator.add(result, num);
        }
        return result;
    }
}
