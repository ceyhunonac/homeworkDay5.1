import Business.Abstracts.LoginService;
import Business.Abstracts.UserService;
import Business.Concretes.LoginManager;
import Business.Concretes.UserManager;
import Core.Adapters.GoogleEmailLoginManagerAdapter;
import Core.Concretes.CheckUserManager;
import Core.Concretes.EmailVerificationManager;
import DataAccess.Abstracts.UserDao;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new GoogleEmailLoginManagerAdapter(),new EmailVerificationManager(),new LoginManager(new HibernateUserDao(),new CheckUserManager(),new EmailVerificationManager()));
        LoginService loginService = new LoginManager(new HibernateUserDao(),new CheckUserManager(),new EmailVerificationManager());
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("ceyhunonac58@gmail.com");
        user1.setFirstName("Ceyhun");
        user1.setLastName("ONAÇ");
        user1.setPassword("69146914");

        System.out.println("-----------LOGIN SERVICE-----------");
        loginService.register(user1.getEmail(),user1.getPassword());
        System.out.println("-----------");
        loginService.login(user1);
        System.out.println("-----------");
        loginService.emailLogin(user1.getEmail());
        System.out.println("-----------USER SERVICE-----------");
        userService.registerSrvc();
        System.out.println("-----------");
        userService.loginSrvc();
        System.out.println("------------------------------------------------------------------------");













        //
    }
}
