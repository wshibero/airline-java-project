package airlines;

public class PassengerPlane extends Airplane{
  private int maxCrew;
  private int maxPassengers;
  private int maxCargo;
  public PassengerPlane(String model, int capacity, int maxSpeed, int maxAlt, int fuel, String fuelType, String range, int maxCrew, int maxPassengers, int maxCargo){
    super(model, capacity, maxSpeed, maxAlt, fuel, fuelType, range);
    this.maxCrew = maxCrew;
    this.maxPassengers = maxPassengers;
    this.maxCargo = maxCargo;
  }
  
  public int getMaxCrew() {
    return maxCrew;
  }

  public void setMaxCrew(int maxCrew) {
    this.maxCrew = maxCrew;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public int getMaxCargo() {
    return maxCargo;
  }

  public void setMaxCargo(int maxCargo) {
    this.maxCargo = maxCargo;
  }
}