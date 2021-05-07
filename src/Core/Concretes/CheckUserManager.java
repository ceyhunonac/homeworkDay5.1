package Core.Concretes;

import Core.Abstracts.CheckUserService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUserManager implements CheckUserService {
    @Override
    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (!email.isEmpty() && matchFound) {
            return true;
        } else {
            throw new ArithmeticException("Bu e-posta geçerli değil.Başka e-posta deneyiniz");
        }

    }
    @Override
    public boolean checkPassword(String password) {
        if (password.length() >= 6) {
            return true;
        } else {
            throw new ArithmeticException("Şifre uzunluğu 6 karakter veya 6 karakterden daha uzun olmalıdır");
        }
    }

    @Override
    public boolean checkFirstName(String firstName) {
        if (firstName.length()>=2) {
            return true;
        }else{
            throw new ArithmeticException("İsim uzunluğu 2 karakter veya 2 karakterden daha uzun olmalıdır");
        }
    }

    @Override
    public boolean checkLastName(String lastName) {
        if (lastName.length()>=2) {
            return true;
        } else {
            throw new ArithmeticException("Soyadı uzunluğu 2 karakter veya 2 karakterden daha uzun olmalıdır");
        }
    }
}
