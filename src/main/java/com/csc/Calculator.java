package com.csc;

import java.util.Arrays;

public class Calculator {
  public int findMax(int[] nums){
    int max = nums[0];
    for(int i = 1; i < nums.length; i++){
      if(nums[i] > max){
        max = nums[i];
      }
    }

    return max;
  }

  public int findMin(int[] nums){
    int min = nums[0];
    for(int i = 1; i < nums.length; i++){
      if(nums[i] < min){
        min = nums[i];
      }
    }

    return min;
  }

  public int sum(int[] nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      sum += nums[i];
    }

    return sum;
  }

  public int average(int[] nums){
    return sum(nums) / nums.length;
  }

  public int findMaxEZ(int[] nums){
    return Arrays.stream(nums).max().getAsInt();
  }

  public int findMinEZ(int[] nums){
    return Arrays.stream(nums).min().getAsInt();
  }

  public double averageEZ(int[] nums){
    return Arrays.stream(nums).average().getAsDouble();
  }

  public int sumEZ(int[] nums){
    return Arrays.stream(nums).sum();
  }

  public int[] filterEvenNumbers(int[] numbers) {
    return Arrays.stream(numbers)
                 .filter(num -> num % 2 == 0)
                 .toArray();
  }
}
