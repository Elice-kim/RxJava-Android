package com.rxandroid.elice.rxandroid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rxandroid.elice.rxandroid.R;
import com.rxandroid.elice.rxandroid.data.LoginData;
import com.rxandroid.elice.rxandroid.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.idEditText)
    EditText idEditText;
    @BindView(R.id.passwordEditText)
    EditText passwordEditText;
    @BindView(R.id.loginButton)
    Button loginBtn;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        loginPresenter = new LoginPresenter();
        loginPresenter.setView(this);

    }

    @OnClick(R.id.loginButton)
    void loginButtonClicked() {
        if (isNotValid()) {
            return;
        }
        requestLogin();
    }

    private boolean isNotValid() {
        return false;
    }

    private void requestLogin() {

        LoginData.Request request = new LoginData.Request();
        request.userEmail = idEditText.getText().toString().trim();
        request.userPassword = passwordEditText.getText().toString().trim();

        loginPresenter.loginRequest(request);
    }

    public void onRequestComplete(){
        Toast.makeText(this, "로그인 완료", Toast.LENGTH_SHORT).show();
    }

    public void onRequestFail(){
        Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show();
    }
}
