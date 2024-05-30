// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import Users.Users;
import Destination.Destination;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Users user = new Users("John", "Doe", "johndoe@example.com", "password");
    System.out.println("user\n"+user);
    Users user1 = new Users.UserBuilder("Jane", "Doe").setEmail("janedoe@example.com").setPassword("password").build();
    System.out.println("user1\n"+user1);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}