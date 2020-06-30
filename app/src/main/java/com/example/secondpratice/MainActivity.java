package com.example.secondpratice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText loguser, logpass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loguser = findViewById(R.id.user);
        logpass = findViewById(R.id.password);
        btn = findViewById(R.id.login_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = loguser.getText().toString();
                String password = logpass.getText().toString();
                if (username.isEmpty()){
                    Toast.makeText(MainActivity.this, "Username empty", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Password empty", Toast.LENGTH_SHORT).show();
                }
                else if (username.equals("admin") && password.equals("admin")) {

                    startActivity(new Intent(MainActivity.this, welcome2.class));
                } else {
                    Toast.makeText(MainActivity.this, "Invaild Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



