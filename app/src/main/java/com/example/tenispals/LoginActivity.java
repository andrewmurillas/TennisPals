package com.example.tenispals;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditEmail;
    private EditText mEditPassword;
    private Button mLoginButton;
    private Button mSignUpShortcut;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEditEmail = findViewById(R.id.edit_email);
        mEditPassword = findViewById(R.id.edit_password);
        mLoginButton = findViewById(R.id.login_button);
        mSignUpShortcut = findViewById(R.id.sign_up_shortcut);
    }

    @Override
    public void onClick(View v) {
        if(v == mLoginButton){

        }else{

        }
    }
}
