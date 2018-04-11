package com.kuncham.karimullagroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserLoginActivity extends AppCompatActivity {
    TextView regsiter;
    Button bt_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        regsiter=(TextView)findViewById(R.id.text2);
        bt_signin=(Button)findViewById(R.id.signin);

        regsiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(UserLoginActivity.this,UserRegistration.class);
                startActivity(i);
            }
        });

        bt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(UserLoginActivity.this,HomePage.class);
                startActivity(i);

            }
        });
    }
}
