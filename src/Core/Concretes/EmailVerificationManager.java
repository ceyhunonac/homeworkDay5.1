package Core.Concretes;

import Core.Abstracts.EmailVerificationService;
import Entities.Concretes.User;

public class EmailVerificationManager implements EmailVerificationService {

    @Override
    public void verififyEmail(User user) {
        System.out.println(user.getEmail() + " bu e-postaya doğrulama linki gönderilmiştir.Linke tıklayıp doğrulama işlemini tamamlayınız");
    }

    @Override
    public boolean isEmailVerified(User user) {
        System.out.println("Değerli " + user.getFirstName() + " e-posta adresiniz başarıyla doğrulanmıştır : " + user.getEmail());
        return true;
    }
}
