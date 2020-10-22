package com.company;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MagicNumberTest {

  @Test
  public void testMagicNumberWithARangeWithOnlyAMagicNumber() {
    List<int[]> numberRanges = new ArrayList<>();
    numberRanges.add(new int[]{8, 27});
    numberRanges.add(new int[]{49, 49});

    MagicNumber magicNumber = new MagicNumber(numberRanges);
    assertEquals(3, magicNumber.getMagicNumbersTotal());
  }

  @Test
  public void testMagicNumberWithOneNumberRange() {
    List<int[]> numberRanges = new ArrayList<>();
    numberRanges.add(new int[]{21, 192});

    MagicNumber magicNumber = new MagicNumber(numberRanges);
    assertEquals(4, magicNumber.getMagicNumbersTotal());
  }

  @Test
  public void testRangesWithoutPossibleMagicNumbers() {
    List<int[]> numberRanges = new ArrayList<>();
    numberRanges.add(new int[]{51, 82});
    numberRanges.add(new int[]{94, 117});
    numberRanges.add(new int[]{11, 23});

    MagicNumber magicNumber = new MagicNumber(numberRanges);
    assertEquals(0, magicNumber.getMagicNumbersTotal());
  }
}
