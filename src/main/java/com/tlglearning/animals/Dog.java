package com.tlglearning.animals;

public class Dog extends Wolf {

  private static final int MY_CONSTANT = initializeValue();
  private final int data = initializeData();

  static {
    System.out.println("Dog initialization block");
  }

  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Second dog initialization block");
  }

  private static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }

  private int initializeData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  public Dog() {
    super();
    System.out.println("Dog constructor");
  }

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  public static void whoAmI() {
    System.out.println("I am a dog.");
  }

  public void rollOver() {
    System.out.println("I'm rolling over! I'm the best dog!");
  }
}
