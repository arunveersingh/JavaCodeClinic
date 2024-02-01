package com.oopsfeedmecode.example4;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyBenchmark {

    private static final List<Integer> numbers =
            generateNumbers(1000);
    @Benchmark
    public void testTraditionalLoop() {
        int sum = 0;
        for (int num : numbers) {
            if (num >= 20) {
                sum += num * 3;
            }
        }
    }
    @Benchmark
    public void testStream() {
        int sum = numbers.stream()
                .filter(num -> num >= 20)
                .mapToInt(num -> num * 3)
                .sum();
    }

    @Benchmark
    public void testParallelStream() {
        int sum = numbers.parallelStream()
                .filter(num -> num >= 20)
                .mapToInt(num -> num * 3)
                .sum();
    }

    public static List<Integer> generateNumbers(int n) {
        return IntStream.range(0, n).boxed().collect(Collectors.toList());
    }
}

