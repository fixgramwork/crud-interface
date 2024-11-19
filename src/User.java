import java.time.LocalDate;
import java.time.LocalTime;

public class User {

  private Long id;
  private String email;
  private String name;
  private String password;
  private String createAt;

  public User(String email, String name, String password) {
    this.email = email;
    this.name = name;
    this.password = password;
    this.createAt = LocalDate.now().toString();
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public String getCreateAt() {
    return createAt;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", createAt='" + createAt + '\'' +
            '}';
  }
}
