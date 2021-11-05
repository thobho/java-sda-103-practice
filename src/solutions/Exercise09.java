package solutions;

public class Exercise09 {

  public static void main(String[] args) {
    printWave(100);
  }

  private static void printWave(int n) {
    printSimpleLine(0, n);
    printComplexLine(1, 4, 2, n);
    printComplexLine(2, 2, 4, n);
    printSimpleLine(3, n);
  }

  static void printComplexLine(int spacesBefore, int firstDistance, int secondDistance, int n) {
    printSpaces(spacesBefore);

    int distanceCounter = 0;
    int acutalDistance = firstDistance;

    for (int i = 0; i < n - spacesBefore; i++) {
      if(distanceCounter == 0){
        System.out.print("*");
      } else {
        System.out.print(" ");
      }

      distanceCounter++;

      if(distanceCounter == acutalDistance){
        distanceCounter = 0;
        if(firstDistance == acutalDistance){
          acutalDistance = secondDistance;
        }else {
          acutalDistance = firstDistance;
        }
      }
    }
    System.out.println();
  }






  static void printSimpleLine(int spacesBefore, int n){
    printSpaces(spacesBefore);

    for (int i = 0; i < n - spacesBefore; i++) {
      if(i % 6 == 0){
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  private static void printSpaces(int spacesBefore) {
    for (int i = 0; i < spacesBefore; i++) {
      System.out.print(" ");
    }
  }
}
