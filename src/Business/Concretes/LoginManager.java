package Business.Concretes;

import Business.Abstracts.LoginService;
import Core.Abstracts.CheckUserService;
import Core.Abstracts.EmailVerificationService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class LoginManager implements LoginService {
    private UserDao userDao;
    private CheckUserService checkUserService;
    private EmailVerificationService emailVerificationService;

    public LoginManager(UserDao userDao, CheckUserService checkUserService, EmailVerificationService emailVerificationService) {
        this.userDao = userDao;
        this.checkUserService = checkUserService;
        this.emailVerificationService = emailVerificationService;
    }


    @Override
    public void emailLogin(String email) {
        for (User user : userDao.getAll()) {
            if (user.getEmail() == email) {
                System.out.println("E-Posta adresi ile kayıtlı hesap vardır.Başka eposta deneyiniz");
            }else{
                return;
            }
        }
    }

    @Override
    public void login(User user) {
        this.emailLogin(user.getEmail());
        if (!checkUserService.checkEmail(user.getEmail())) {
            return;
        }
        System.out.println("Email Doğrulaması Başarıyla Gerçekleşmiştir.");
        if (!checkUserService.checkFirstName(user.getFirstName())) {
            return;
        }
        System.out.println("Şifre Doğrulaması Başarıyla Gerçekleşmiştir.");
        if (!checkUserService.checkPassword(user.getPassword())) {
            return;
        }
        System.out.println("İsim Doğrulaması Başarıyla Gerçekleşmiştir.");
        if (!checkUserService.checkLastName(user.getLastName())) {
            return;
        }
        System.out.println("Soyadı Doğrulaması Başarıyla Gerçekleşmiştir.");
        emailVerificationService.verififyEmail(user);
        emailVerificationService.isEmailVerified(user);
        userDao.Add(user);
        System.out.println(
                "Değerli " + user.getFirstName() + " " + user.getLastName() + " kayıt işleminiz başarıyla gerçekleşmiştir.");
    }

    @Override
    public void register(String email, String password) {
        if (!checkUserService.checkEmail(email)) {
            return;
        }
        if (!checkUserService.checkPassword(password)) {
            return;
        }
        for (User user : userDao.getAll()) {
            if (email == user.getEmail() && password == user.getPassword()) {
                System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla giriş yapıldı");
                return;
            }else {
                throw new ArithmeticException("Hatalı e-posta adresi yada parola girildi.Lütfen tekrar deneyiniz.");
            }
        }
    }
}
