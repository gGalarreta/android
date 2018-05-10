package features.login;

public interface LoginContract {


    interface View{
    }

    interface Presenter{

        void loginUser(String username, String password);
    }
}
