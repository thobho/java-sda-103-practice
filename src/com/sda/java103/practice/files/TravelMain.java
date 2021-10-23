package com.sda.java103.practice.files;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TravelMain {


  public static void main(String[] args) {

    String line = "0,85249351,57912,2019-09-15 11:10:11,2020-01-10 08:43:21,Waniliowa / Cynamonowa,Waniliowa / Cynamonowa";

    String[] split = line.split(",");

    String startDate = split[3];

    System.out.println(startDate);
  }
}
