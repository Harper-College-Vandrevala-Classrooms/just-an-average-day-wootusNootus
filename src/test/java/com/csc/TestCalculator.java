package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void testFindMax() {
    int[] nums = {1, 3, 7, 2, 5};
    assertEquals(7, calculator.findMax(nums));
  }

  @Test
  void testFindMin() {
    int[] nums = {1, 3, 7, 2, 5};
    assertEquals(1, calculator.findMin(nums));
  }

  @Test
  void testSum() {
    int[] nums = {1, 3, 7, 2, 5};
    assertEquals(18, calculator.sum(nums));
  }

  @Test
  void testAverage() {
    int[] nums = {1, 3, 7, 2, 5};
    assertEquals(3, calculator.average(nums)); // Integer division
  }

  @Test
    void testFindMaxEZ() {
        int[] nums = {1, 3, 7, 2, 5};
        assertEquals(7, calculator.findMaxEZ(nums));
    }

    @Test
    void testFindMinEZ() {
        int[] nums = {1, 3, 7, 2, 5};
        assertEquals(1, calculator.findMinEZ(nums));
    }

    @Test
    void testSumEZ() {
        int[] nums = {1, 3, 7, 2, 5};
        assertEquals(18, calculator.sumEZ(nums));
    }

    @Test
    void testAverageEZ() {
        int[] nums = {1, 3, 7, 2, 5};
        assertEquals(3.6, calculator.averageEZ(nums), 0.0001); // Double precision comparison
    }
}
