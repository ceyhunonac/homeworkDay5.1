package Business.Abstracts;

import Entities.Concretes.User;

public interface LoginService {
    void emailLogin(String email);
    void login(User user);
    void register(String email,String password);

}
