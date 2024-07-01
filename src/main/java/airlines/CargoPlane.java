package airlines;

public class CargoPlane extends Airplane{
  private int maxCrew;
  private int maxWeight;
  public CargoPlane(String model, int capacity, int maxSpeed, int maxAlt, int fuel, String fuelType, String range, int maxCrew, int maxWeight){
    super(model, capacity, maxSpeed, maxAlt, fuel, fuelType, range);
    this.maxCrew = maxCrew;
    this.maxWeight = maxWeight;
  }
  public int getMaxCrew() {
    return maxCrew;
  }
  public void setMaxCrew(int maxCrew) {
    this.maxCrew = maxCrew;
  }
  public int getMaxWeight() {
    return maxWeight;
  }
  public void setMaxWeight(int maxWeight) {
    this.maxWeight = maxWeight;
  }
}