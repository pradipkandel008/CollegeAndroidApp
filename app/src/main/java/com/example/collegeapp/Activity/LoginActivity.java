package com.example.collegeapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.collegeapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et_user_name,et_password;
    Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    public void initViews(){
        et_user_name=(EditText)findViewById(R.id.et_user_name);
        et_password=(EditText)findViewById(R.id.et_password);
        btn_login=(Button)findViewById(R.id.btn_login);
        btn_register=(Button)findViewById(R.id.btn_register);
        btn_login.setOnClickListener(this);
        btn_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                Intent loginIntent=new Intent(LoginActivity.this,DashboardActivity.class);
                loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(loginIntent);
                break;

            case R.id.btn_register:
                Intent registerIntent=new Intent(LoginActivity.this,RegisterActivity.class);
                registerIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(registerIntent);
                break;
        }

    }
}
