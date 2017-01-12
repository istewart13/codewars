//Given an array of integers.

// Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

// If the input array is empty or null, return an empty array:

// C#/Java: new int[] {} / new int[0];
// C++: std::vector<int>();
// JavaScript/CoffeeScript/PHP/Haskell: [];
// ATTENTION!

// The passed array should NOT be changed. Read more here.

// For example:

// input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15} 
// return int[] {10, -65}.

public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
          if (input[i] > 0) {
            count++;
          } else if (input[i] < 0) {
            sum += input[i];
          }
        }
        int[] returnValues = new int[] {count, sum};
        return returnValues;
    }
}
