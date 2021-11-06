package solutions;

public class Exercise05 {


  public static void main(String[] args) {

    printPrimes(100);

//    System.out.println(isPrime(4));
  }

  static void printPrimes(int n){
    for (int i = 2; i < n; i++) {
      if(isPrime(i)){
        System.out.print(i + ", ");
      }
    }
  }


  static boolean isPrime(int x){
    for (int i = 2; i < x - 1; i++) {
      if(x % i == 0){
        return false;
      }
    }
    return true;
  }

}
