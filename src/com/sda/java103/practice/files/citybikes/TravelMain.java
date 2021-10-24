package com.sda.java103.practice.files.citybikes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class TravelMain {


  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(Path.of("historia_przejazdow_2020-01.csv"));

    ArrayList<Travel> travels = new ArrayList<>();

    while (scanner.hasNext()){
      String travelLine = scanner.nextLine();
      Travel travel = processString(travelLine);
      travels.add(travel);
    }

    System.out.println(travels);

  }


  private static Travel processString(String travelString){
    String[] split = travelString.split(",");
    String id = split[0];
    String bikeNumber = split[1];
    String startDate = split[3];
    ///
    return new Travel(id);
  }

}