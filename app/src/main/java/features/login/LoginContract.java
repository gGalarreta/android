package features.login;

public interface LoginContract {


    interface View{
        void sucessLogin(String username);
    }

    interface Presenter{

        void loginUser(String username, String password);
    }
}
