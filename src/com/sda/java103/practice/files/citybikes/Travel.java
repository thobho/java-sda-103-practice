package com.sda.java103.practice.files.citybikes;

import java.time.LocalDateTime;

public class Travel {
  private String id;
  private String bikeNumber;
  private LocalDateTime travelStart;
  private LocalDateTime travelEnd;
  private String startStation;
  private String endStation;

  public Travel(String id) {
    this.id = id;
  }

  public Travel(String id, String bikeNumber, LocalDateTime travelStart, LocalDateTime travelEnd, String startStation, String endStation) {
    this.id = id;
    this.bikeNumber = bikeNumber;
    this.travelStart = travelStart;
    this.travelEnd = travelEnd;
    this.startStation = startStation;
    this.endStation = endStation;
  }
}