package com.sda.java103.practice.files.squarequation;

public class SquareEquastionSolver {

  private float a;
  private float b;
  private float c;

  private float delta;

  public SquareEquastionSolver(float a, float b, float c) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.delta = (float)  Math.pow(b, 2) - 4 * a * c;
  }

  public Float cacluateX1(){
    if(delta < 0){
      return null;
    }else {

    }
    return null;
  }

  public Float caclulateX2(){
    return 0.0f;
  }
}
