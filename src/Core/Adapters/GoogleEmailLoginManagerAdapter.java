package Core.Adapters;

import Core.Abstracts.EmailAdapterService;
import GoogleEmail.Concretes.GoogleEmailManager;

public class GoogleEmailLoginManagerAdapter implements EmailAdapterService {
    @Override
    public void loginWith() {
        GoogleEmailManager googleLoginManager = new GoogleEmailManager();
        googleLoginManager.register();
    }

    @Override
    public void registerWith() {
        GoogleEmailManager googleLoginManager = new GoogleEmailManager();
        googleLoginManager.login();
    }
}
