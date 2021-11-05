package com.sda.java103.practice.man;

public class Man {

  public static String speciesName = "Homo sapiens";
  public static int numberOfHearts = 1;
  public static String dnaProteins = "CATG";

  public String name;
  private boolean isWomen; //true -> człowiek jest kobietą
  private Hearth hearth;


  public Man(String name, boolean isWomen, Hearth hearth) {
    this.name = name;
    this.isWomen = isWomen;
    this.hearth = hearth;
  }

  public static class Hearth {
      private String ekg;
      private int weight;

    public Hearth(String ekg, int weight) {
      this.ekg = ekg;
      this.weight = weight;
    }

    public String getEkg() {
      return ekg;
    }
  }











  //metoda nie-statyczna
  public String getName() {
    return this.name;
  }

  //metoda statyczna, która opisuje gatunek ludzki
  public static void describeHumanSpecies(){
    System.out.println("Nazwa łacinkska: " + speciesName);
    System.out.println("Liczba serc: " + numberOfHearts);
    System.out.println("DNA: " + dnaProteins);
  }
}
