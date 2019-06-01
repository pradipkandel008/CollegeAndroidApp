package com.example.collegeapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.collegeapp.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et_first_name, et_last_name, et_phone,et_batch,et_email,et_user_name,et_password;
    Button btn_register,btn_login;
    RadioGroup rg_gender;
    RadioButton rb_male,rb_female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
    }

    public void initViews(){
        et_first_name=(EditText)findViewById(R.id.et_first_name);
        et_last_name=(EditText)findViewById(R.id.et_last_name);
        et_phone=(EditText)findViewById(R.id.et_phone);
        et_email=(EditText)findViewById(R.id.et_email);
        rg_gender=(RadioGroup)findViewById(R.id.rg_gender);
        rb_male=(RadioButton)findViewById(R.id.rb_male);
        rb_female=(RadioButton)findViewById(R.id.rb_female);
        et_batch=(EditText)findViewById(R.id.et_batch);
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
            case R.id.btn_register:
                Intent registerIntent=new Intent(RegisterActivity.this,LoginActivity.class);
                registerIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(registerIntent);
                break;
            case R.id.btn_login:
                Intent loginIntent=new Intent(RegisterActivity.this,LoginActivity.class);
                loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(loginIntent);
                break;
        }
    }
}
