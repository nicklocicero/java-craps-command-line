package edu.cnm.deepdive.craps;

import java.util.Arrays;
import java.util.Random;

public class Roll {

  private static Random defaultRng;
  private int[] dice;

  public Roll() {
    // TODO Make thread-safe.
    this(defaultRng == null ? (defaultRng = new Random()) : defaultRng);
  }

  public Roll(Random rng) {
    dice = new int[] {
        rng.nextInt(6) + 1,
        rng.nextInt(6) + 1
    };
  }

  public int[] getDice() {
    return new int[] {
        dice[0],
        dice[1]
    };
  }

  public int getSum() {
    return dice[0] + dice[1];
  }

  public static void rollDice() {
    for (int i = 0; i < 100; i++) {
      Roll a = new Roll();
      if (a.getSum() == 7) {
        System.out.println("Win!");
      } else {
        System.out.println(("Lose!"));
      }
      ;
    }
  }


}
