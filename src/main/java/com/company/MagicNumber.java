package com.company;

import java.util.List;

public class MagicNumber {

  List<int[]> numberRanges;

  public MagicNumber(List<int[]> numberRanges) {
    this.numberRanges = numberRanges;
  }

  public int getMagicNumbersTotal() {
    return numberRanges.stream().map(range -> countMagicNumbers(range[0], range[1])).reduce(0, Integer::sum);
  }

  private static boolean isPrimeNumber(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static int findNextPerfectSquare(int number) {
    double square = Math.sqrt(number);
    if (square - Math.floor(square) != 0) {
      square++;
    }
    return (int) Math.floor(square);
  }

  private static int countMagicNumbers(int minValue, int maxValue) {
    int magicNumbersFound = 0;
    for (int i = findNextPerfectSquare(minValue); (i * i) <= maxValue; i++) {
      if (isPrimeNumber(i)) {
        magicNumbersFound++;
      }
    }
    return magicNumbersFound;
  }
}
