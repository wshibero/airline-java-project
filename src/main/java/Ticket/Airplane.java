package Ticket;

public class Airplane{
  private String tailNo;
  private int fclass;
  private int bclass;
  private int eclass;
  private String airline;
  public Airplane(String tailNo, int fclass, int bclass, int eclass, String airline){
    this.tailNo = tailNo;
    this.fclass = fclass;
    this.bclass = bclass;
    this.eclass = eclass;
    this.airline = airline;
  }
  public String toString(){
    return 
      "Tail No: " + this.tailNo + 
      "\nFirst Class: " + this.fclass + 
      "\nBusiness Class: " + this.bclass + 
      "\nEconomy Class: " + this.eclass + 
      "\nAirline: " + this.airline;
  }
  public Airplane(AirplaneBuilder builder){
    this.tailNo = builder.tailNo;
    this.fclass = builder.fclass;
    this.bclass = builder.bclass;
    this.eclass = builder.eclass;
    this.airline = builder.airline;
  }
  public static class AirplaneBuilder{
    private String tailNo;
    private int fclass;
    private int bclass;
    private int eclass;
    private String airline;
    public AirplaneBuilder(String tailNo, String airline){
      this.tailNo = tailNo;
      this.airline = airline;
    }
    public AirplaneBuilder setMaxClass(int fclass, int bclass, int eclass){
      this.fclass = fclass;
      this.bclass = bclass;
      this.eclass = eclass;
      return this;
    }
    public Airplane build(){
      return new Airplane(this);
    }
  }
}