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
  public String toString(){
    return 
      "First Name: " + this.fname + 
      "\nLast Name: " + this.lname + 
      "\nEmail: " + this.email;
  }

  public class UserFactory{
  }
}