package Business.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserService {
   void login(User user);
    void register(String email,String password);
    void loginSrvc();
    void registerSrvc();
}
