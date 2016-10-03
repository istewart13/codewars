// Welcome. In this kata, you are asked to square every digit of a number.

// For example, if we run 9119 through the function, 811181 will come out.

// Note: The function accepts an integer and returns an integer

public class SquareDigit {

  public int squareDigits(int n) {
    String allDigits = String.valueOf(n);
    String solution = "";
    for (int i = 0; i < allDigits.length(); i++) {
      int value = Character.getNumericValue(allDigits.charAt(i));
      int square = value * value;
      String squareAsString = String.valueOf(square);
      solution += squareAsString;
    }
  return Integer.parseInt(solution);
  }
}
