package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<int[]> numberRanges = askUserForNumberRanges();
    MagicNumber magicNumber = new MagicNumber(numberRanges);
    int totalMagicNumbersFound = magicNumber.getMagicNumbersTotal();

    System.out.printf("Resultado: %d", totalMagicNumbersFound);
  }

  private static List<int[]> askUserForNumberRanges() {
    List<int[]> numberRanges = new ArrayList<>();
    boolean hasNewRange;

    do {
      int[] range = new int[2];
      Scanner in = new Scanner(System.in);

      System.out.print("Digite o valor mínimo do intervalo de números: ");
      range[0] = in.nextInt();

      System.out.print("Digite o valor máximo do intervalo de números: ");
      range[1] = in.nextInt();

      numberRanges.add(range);
      hasNewRange = doUserWantsANewRange(in);
    } while (hasNewRange);

    return numberRanges;
  }

  private static boolean doUserWantsANewRange(Scanner in) {
    System.out.println("Deseja acrescentar outro intervalo? (s/n)");
    String answer = in.next();

    while (hasUserEnteredAWrongInput(answer)) {
      System.out.println("Digite (s)im ou (n)ão para prosseguir");
      answer = in.next();
    }

    return "s".equalsIgnoreCase(answer);
  }

  private static boolean hasUserEnteredAWrongInput(String answer) {
    return (!"s".equalsIgnoreCase(answer)) && (!"n".equalsIgnoreCase(answer));
  }
}
