package com.rxandroid.elice.rxandroid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.rxandroid.elice.rxandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscription;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.idEditText)
    EditText idEditText;
    @BindView(R.id.passwordEditText)
    EditText passwordEditText;

    private Subscription subscription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.loginButton)
    void loginButtonClicked() {
        if (isNotValid()) {
            return;
        }
        requestLogin();
    }

    private boolean isNotValid() {
        return true;
    }

    private void requestLogin() {
    }

}
