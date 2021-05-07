package GoogleEmail.Concretes;

import GoogleEmail.Abstracts.GoogleEmailService;

public class GoogleEmailManager implements GoogleEmailService {
    @Override
    public void login() {
        System.out.println("Google hesabınız ile başarıyla giriş yapılmıştır");
    }

    @Override
    public void register() {
        System.out.println("Google hesabınız ile başarıyla kayıt olunmuştur");
    }
}
