import java.util.List;

public interface CrudService<T> {
    T create(T entity); //만들기
    T read(Long id); //읽들이기
    T update(Long id, T entity); //읽기중 고치기
    boolean delete(Long id); //삭제 하기
    List<T> listAll();
}