package Route;

public class Route{
  private String destTown;
  private String destCountry;
  private String destContinent;
  private String originTown;
  private String originCountry;
  private String originContinent;
  private int cost;
  public Route(String originTown, String destTown, int cost, String originCountry, String destCountry,  String originContinent, String destContinent){
    this.destTown = destTown;
    this.destCountry = destCountry;
    this.destContinent = destContinent;
    this.originTown = originTown;
    this.originCountry = originCountry;
    this.originContinent = originContinent;
    this.cost = cost;
  }
  public Route(RouteBuilder builder){
    this.destTown = builder.destTown;
    this.destCountry = builder.destCountry;
    this.destContinent = builder.destContinent;
    this.originTown = builder.originTown;
    this.originCountry = builder.originCountry;
    this.originContinent = builder.originContinent;
    this.cost = builder.cost;
  }
  public static class RouteBuilder{
    private String destTown;
    private String destCountry;
    private String destContinent;
    private String originTown;
    private String originCountry;
    private String originContinent;
    private int cost;
    public RouteBuilder(String originTown, String destTown, int cost){
      this.destTown = destTown;
      this.originTown = originTown;
      this.cost = cost;
    }
    public RouteBuilder setDestCountry(String destCountry, String destContinent){
      this.destCountry = destCountry;
      this.destContinent = destContinent;
      return this;
    }
    public RouteBuilder setOriginCountry(String originCountry, String originContinent){
      this.originCountry = originCountry;
      this.originContinent = originContinent;
      return this;
    }
    public Route build(){
      return new Route(this);
    }
  }
  public String toString(){
    return 
      "Origin Town: " + this.originTown +
      "\nDestination Town: " + this.destTown +
      "\nCost: " + this.cost;
  }
}