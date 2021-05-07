package Core.Abstracts;

import Entities.Concretes.User;

public interface EmailVerificationService {
    void verififyEmail(User user);
    boolean isEmailVerified(User user);

}
