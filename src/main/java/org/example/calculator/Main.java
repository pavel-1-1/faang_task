package org.example.calculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4);
        System.out.println(GooglCalculator.sum(list));
    }
}
