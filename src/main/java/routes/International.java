package routes;

public class International extends Routes{
  private String originCountry;
  private String destCountry;
  private String originContinent;
  private String destContinent;
  public International(String origin, String originCountry, String originContinent, String originAirport, String destination, String destCountry, String destContinent, String destAirport, int distance, int fare, float time){
    super(origin, originAirport, destination, destAirport, distance, fare, time);
    this.originCountry = originCountry;
    this.destCountry = destCountry;
    this.originContinent = originContinent;
    this.destContinent = destContinent;
  }
  
  public String getOriginCountry() {
    return originCountry;
  }
  public void setOriginCountry(String originCountry) {
    this.originCountry = originCountry;
  }
  public String getDestCountry() {
    return destCountry;
  }
  public void setDestCountry(String destCountry) {
    this.destCountry = destCountry;
  }
  public String getOriginContinent() {
    return originContinent;
  }
  public void setOriginContinent(String originContinent) {
    this.originContinent = originContinent;
  }
  public String getDestContinent() {
    return destContinent;
  }
  public void setDestContinent(String destContinent) {
    this.destContinent = destContinent;
  }
}