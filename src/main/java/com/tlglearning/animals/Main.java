package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Wolf> wolves = new ArrayList<>();
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);
    for(Wolf w: wolves){
      System.out.println();
      System.out.println(w.getClass().getName());
      w.hunt();
      w.vocalize();
      if (w instanceof Dog) {
        ((Dog) w).rollOver();
      }
//      if (w instanceof Dog) {
//        ((Dog) w).whoAmI();
//      } else{
//        Wolf.whoAmI();
//      }
    }
  }
}
