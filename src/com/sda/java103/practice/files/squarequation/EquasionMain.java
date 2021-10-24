package com.sda.java103.practice.files.squarequation;

import java.util.Scanner;

public class EquasionMain {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    float c = scanner.nextFloat();

    var squareEquastionSolver = new SquareEquastionSolver(a, b, c);

    squareEquastionSolver.cacluateX1();
    squareEquastionSolver.cacluateX1();

  }

}
