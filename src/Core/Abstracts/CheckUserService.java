package Core.Abstracts;

public interface CheckUserService {
    boolean checkEmail(String email);

    boolean checkPassword(String password);

    boolean checkFirstName(String firstName);

    boolean checkLastName(String lastName);
}
