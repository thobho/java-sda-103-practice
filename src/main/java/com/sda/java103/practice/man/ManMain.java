package com.sda.java103.practice.man;

import com.sda.java103.practice.man.Man.Hearth;

public class ManMain {


  public static void main(String[] args) {
    //STATYCZNE POLA
    //odwołanie do pola statycznego
    String dnaProteins = Man.dnaProteins;
    //odwołanie do pola nie-statycznego

    Hearth hearth = new Man.Hearth("Ekg prawidłowe", 500);
    Man agata = new Man("Agata", true, hearth);
    String name1 = agata.name;


    //STATYCZNE METODY
    //wywołanie statyczne metody
    Man.describeHumanSpecies();
    //wywołanie nie-statycznej metody
    String name2 = agata.getName();


    //STATYCZNE KLASY

  }

}
