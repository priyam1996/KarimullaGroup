package com.kuncham.karimullagroup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DealerLoginActivity extends AppCompatActivity {

    TextView regsiter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealer_login);

        regsiter=(TextView)findViewById(R.id.text2);

        regsiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(DealerLoginActivity.this,DealerRegistration.class);
                startActivity(i);
            }
        });
    }
}
