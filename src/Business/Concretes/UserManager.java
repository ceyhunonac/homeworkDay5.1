package Business.Concretes;

import Business.Abstracts.LoginService;
import Business.Abstracts.UserService;
import Core.Abstracts.EmailAdapterService;
import Core.Abstracts.EmailVerificationService;
import Entities.Concretes.User;

import java.util.List;

public class UserManager implements UserService {


    private EmailAdapterService emailAdapterService;
    private EmailVerificationService emailVerificationService;
    private LoginService loginService;

    public UserManager(EmailAdapterService emailAdapterService, EmailVerificationService emailVerificationService,LoginService loginService) {
        this.emailAdapterService = emailAdapterService;
        this.emailVerificationService = emailVerificationService;
        this.loginService = loginService;
    }

    @Override
    public void register(String email,String password) {
       loginService.register(email,password);
    }

    @Override
    public void login(User user) {
        loginService.login(user);
    }

    @Override
    public void registerSrvc() {
        emailAdapterService.registerWith();
    }

    @Override
    public void loginSrvc() {
        emailAdapterService.loginWith();
    }
}
