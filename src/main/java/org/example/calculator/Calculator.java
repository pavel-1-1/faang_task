package org.example.calculator;

@FunctionalInterface
public interface Calculator<T, N> {
    N add(T a, T b);
}