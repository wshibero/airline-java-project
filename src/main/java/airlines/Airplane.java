package airlines;

public abstract class Airplane{
  protected String model;
  protected String fuelType;
  protected int fuelConsumption;
  protected int maxSpeed;
  protected int maxAlt;
  protected RangeType range;
  
  public Airplane(String model, int capacity, int maxSpeed, int maxAlt, int fuel, String fuelType, String range){
    this.model = model;
    this.fuelType = fuelType;
    this.fuelConsumption = fuel;
    this.maxSpeed = maxSpeed;
    this.maxAlt = maxAlt;
    setRange(range);
  }
  
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public int getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(int fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int getMaxAlt() {
    return maxAlt;
  }

  public void setMaxAlt(int maxAlt) {
    this.maxAlt = maxAlt;
  }

  public RangeType getRange() {
    return this.range;
  }

  public void setRange(String range) {
    if (range.equals("Long")) this.range = RangeType.LONG_RANGE;
    else if (range.equals("Mid")) this.range = RangeType.MID_RANGE;
    else if (range.equals("Short")) this.range = RangeType.SHORT_RANGE;
    else this.range = null;
  }
}