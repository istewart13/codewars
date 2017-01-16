// Write function hexToDec which converts hex number (given as a string) to decimal number.

public class HexToDec {
  public static int hexToDec(final String hexString) {
    return Integer.valueOf(hexString, 16);
  }
}
