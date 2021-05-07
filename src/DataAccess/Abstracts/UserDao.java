package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {
    void Add(User user);
    void delete(User user);
    void update(User user);
    User get(int id);
    List<User> getAll();


}
