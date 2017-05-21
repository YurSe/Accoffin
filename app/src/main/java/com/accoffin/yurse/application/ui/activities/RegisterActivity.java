package com.accoffin.yurse.application.ui.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.accoffin.yurse.application.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

import static android.util.Patterns.EMAIL_ADDRESS;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final TextView emailTextView = (TextView) findViewById(R.id.activity_register_userNameInput);
        final TextView passwordTextView = (TextView) findViewById(R.id.activity_register_passwordInput);
        final TextView confirmTextView = (TextView) findViewById(R.id.activity_register_confirmPasswordInput);
        final Button signupButton = (Button) findViewById(R.id.activity_register_singUpButton);
        final Button cancelButton = (Button) findViewById(R.id.activity_register_cancelRegiserButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        signupButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!passwordTextView.getText().toString().equals(confirmTextView.getText().toString())) {
                    Toast.makeText(RegisterActivity.this, "Password do not match", Toast.LENGTH_SHORT).show();
                } else if (!EMAIL_ADDRESS.matcher(emailTextView.getText()).matches()) {
                    Toast.makeText(RegisterActivity.this, "Not valid.", Toast.LENGTH_SHORT).show();

                } else {
                    final FirebaseAuth instance = FirebaseAuth.getInstance();
                    instance.createUserWithEmailAndPassword(emailTextView.getText().toString(), passwordTextView.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                        @Override
                        public void onComplete(@NonNull Task<AuthResult> pTask) {
                            if (!pTask.isSuccessful()) {
                                Toast.makeText(RegisterActivity.this, "Strange exeption.", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }
            }
        });

    }
}
