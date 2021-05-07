package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

   public List<User> users;

   public HibernateUserDao(){
       this.users = new ArrayList<User>();
   }
    @Override
    public void Add(User user) {
       this.users.add(user);
       System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı veritabanına eklenmiştir.");
    }

    @Override
    public void delete(User user) {
        this.users.remove(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı veritabandan silinmiştir.");
    }
    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı veritabanda güncellenmiştir.");
    }

    @Override
    public User get(int id) {
       return this.users.get(id);

    }

    @Override
    public List<User> getAll() {
        return this.users;

    }
}
