package features.login;

import java.util.Random;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void loginUser(String username, String password) {

        boolean hasErros = new Random().nextInt(100) < 70 ;

    }
}
