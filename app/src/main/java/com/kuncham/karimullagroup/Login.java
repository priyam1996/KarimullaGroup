package com.kuncham.karimullagroup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button dealer,user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dealer=(Button)findViewById(R.id.bt_dealer);
        user=(Button)findViewById(R.id.bt_user);

        dealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Login.this,DealerLoginActivity.class);
                startActivity(i);

            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Login.this,UserLoginActivity.class);
                startActivity(i);

            }
        });

    }
}
