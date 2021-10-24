package com.sda.java103.practice.files.squarequation;

public class SquareEquasion {

  public static void main(String[] args) {
    float a = 1.4f;
    float b = 1.4f;
    float c = 1.4f;

    SquareEquastionSolver solver = new SquareEquastionSolver(a, b, c);

    Float x1 = solver.cacluateX1();
    Float x2 = solver.caclulateX2();


  }

  private static void easySolution() {
    float a = 1.4f;
    float b = 1.4f;
    float c = 1.4f;

    double pow = Math.pow(b, 2);

    float delta = (float) pow - 4 * a * c;

    if(delta < 0){
      System.out.println("....");
    }else {

    }
  }


}
