package com.sda.java103.practice.citybikes;

import java.time.Duration;
import java.time.LocalDateTime;

public class BikeTravel {
  private String id;
  private String bikeNumber;
  private LocalDateTime travelStart;
  private LocalDateTime travelEnd;
  private String startStation;
  private String endStation;

  public BikeTravel(String id) {
    this.id = id;
  }

  public BikeTravel(String id, String bikeNumber, LocalDateTime travelStart, LocalDateTime travelEnd, String startStation, String endStation) {
    this.id = id;
    this.bikeNumber = bikeNumber;
    this.travelStart = travelStart;
    this.travelEnd = travelEnd;
    this.startStation = startStation;
    this.endStation = endStation;
  }

  public Duration getDurationOfTravel(){
    //this.travelEnd (-) this.travelStart
    return null;
  }
}