// Sum all the numbers of the array except the highest and the lowest element (the value, not the index!).
// (Only one element at each edge, even if there are more than one with the same value!)

// Example:

// { 6, 2, 1, 8, 10 } => 16
// { 1, 1, 11, 2, 3 } => 6


// If array is empty or null, or if only 1 Element exists, return 0.

import java.util.Arrays;

public class SumWithoutHighestAndLowest
{
  public static int sum(int[] numbers)
  {
    if (numbers == null) {
      return 0;
    }

    int sum = 0;
    Arrays.sort(numbers);
    for (int i = 1; i < numbers.length - 1; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
