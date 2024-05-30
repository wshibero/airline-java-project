// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import Users.Users;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Users user = new Users("John", "Doe", "johndoe@example.com", "password");
    System.out.println(user);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}