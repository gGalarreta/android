package features.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.gustavogalarreta.testing_mvp.R;

import features.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {


    private Button btLogin;
    private TextInputLayout tilEmail, tilPassword;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);

        setupViews();
        setupActions();
    }

    private void setupViews(){
        btLogin = findViewById(R.id.bt_login);
        tilEmail = findViewById(R.id.til_email);
        tilPassword = findViewById(R.id.til_password);
    }

    private void setupActions(){
        btLogin.setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            String username = tilEmail.getEditText().getText().toString();
            String password = tilPassword.getEditText().getText().toString();
            presenter.loginUser(username, password);
        }
    };

    @Override
    public void sucessLogin(String username){
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }


}
