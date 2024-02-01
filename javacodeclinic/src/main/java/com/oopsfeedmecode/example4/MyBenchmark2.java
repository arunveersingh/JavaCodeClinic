package com.oopsfeedmecode.example4;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
@State(Scope.Benchmark)
public class MyBenchmark2 {

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

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark2.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .timeUnit(TimeUnit.MICROSECONDS)
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}

