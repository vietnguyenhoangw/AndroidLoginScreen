package com.uigitdev.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    RelativeLayout login_button;
    TextView register_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setType();
        loginOnClick();
        registerOnClick();
    }

    private void setType() {
        login_button = findViewById(R.id.login_button);
        register_text_view = findViewById(R.id.register_text_view);
    }

    private void registerOnClick() {
        register_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, getString(R.string.you_are_not_a_member_register), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loginOnClick() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }
}
