package Users;

public class Users{
  private String fname;
  private String lname;
  private String email;
  private String password;

  public Users(String fname, String lname, String email, String password){
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.password = password;
  }

  public Users(UserBuilder builder){
    this.fname = builder.fname;
    this.lname = builder.lname;
    this.email = builder.email;
    this.password = builder.password;
  }
  
  public String toString(){
    return 
      "First Name: " + this.fname + 
      "\nLast Name: " + this.lname + 
      "\nEmail: " + this.email;
  }

  public static class UserBuilder{
    private String fname;
    private String lname;
    private String email;
    private String password;
    public UserBuilder(String fname, String lname){
      this.fname = fname;
      this.lname = lname;
    }
    public UserBuilder setEmail(String email){
      this.email = email;
      return this;
    }
    public UserBuilder setPassword(String password){
      this.password = password;
      return this;
    }public Users build(){
      return new Users(this);
    }
  }
}