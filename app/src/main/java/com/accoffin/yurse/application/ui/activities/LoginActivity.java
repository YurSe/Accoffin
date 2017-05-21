package com.accoffin.yurse.application.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.accoffin.yurse.application.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final TextView emailTextView = (TextView) findViewById(R.id.activity_login_userNameInput);
        final TextView passwordTextView = (TextView) findViewById(R.id.activity_login_passwordInput);
        final Button signinButton = (Button) findViewById(R.id.activity_login_singInButton);
        final Button cancelButton = (Button) findViewById(R.id.activity_login_cancelLoginButton);
    }
}
