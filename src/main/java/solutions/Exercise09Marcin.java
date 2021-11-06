package solutions;

public class Exercise09Marcin {


  public static void main(String[] args) {

    printWave(2, 2000);

  }

  public static void printWave(int height,int count) {
    int l = height - 1;

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < count; j++) {


        if (j % (height * 2) == l) {
          System.out.print("*");
        } else if (j % (height * 2) == height + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      l--;
      System.out.println();
    }
  }
}
