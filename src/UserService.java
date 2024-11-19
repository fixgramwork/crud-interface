import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService implements CrudService<User> {
  private List<User> users = new ArrayList<>();//DB
  private Long nextId = 1L;

  @Override
  public User create(User entity) {
    entity.setId(nextId++);
    users.add(entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return users.stream() //stream으로 바꿔서
            .filter(user -> user.getId().equals(id)) //필터를 쉬우는데 getid가 id랑 같으면
            .findFirst() //찾아서
            .orElse(null); //아니면 null값을 출력하겠다.
  }

  @Override
  public User update(Long id, User entity) {
    Optional<User> findUser =  users.stream()
                                      .filter(user -> user.getId().equals(id))
                                      .findFirst();
    if(findUser.isPresent()){//안에 존재한다면
      User user = findUser.get(); //안에 optional을 벚고 나타난다.
      user.setName(entity.getName());
      user.setEmail(entity.getEmail());
      user.setPassword(entity.getPassword());
      return user;
    }
    return null;
  }

  @Override
  public boolean delete(Long id) {
    users.removeIf(user -> user.getId().equals(id));
    return true;
  }

  @Override
  public List<User> listAll() {
    return new ArrayList<>(users);

  }
}
