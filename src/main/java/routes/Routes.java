package routes;

public class Routes{
  protected int distance;
  protected String destination;
  protected String destAirport;
  protected String origin;
  protected String originAirport;
  protected int fare;
  protected float time;

  public Routes(String origin, String originAirport, String destination, String destAirport, int distance, int fare, float time){
    this.origin = origin;
    this.originAirport = originAirport;
    this.destination = destination;
    this.destAirport = destAirport;
    this.distance = distance;
    this.fare = fare;
    this.time = time;
  }
  
  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }
  
  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDestAirport() {
    return destAirport;
  }

  public void setDestAirport(String destAirport) {
    this.destAirport = destAirport;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getOriginAirport() {
    return originAirport;
  }

  public void setOriginAirport(String originAirport) {
    this.originAirport = originAirport;
  }

  public int getFare() {
    return fare;
  }

  public void setFare(int fare) {
    this.fare = fare;
  }
}