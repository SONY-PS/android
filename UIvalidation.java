package com.example.valui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
        EditText username;
        EditText age;
        EditText phone;
        EditText pass;
        Button b1;
        Pattern USERNAME_PATTERN=Pattern.compile("^[A-Za-z]\\w{5,30}$");
        Pattern PASSWORD_PATTERN =Pattern.compile("^" +
                "(?=.*[@#$%^&+=])" +
                "(?=\\S+$)" +
                ".{4,}" +
                "$");
        Pattern AGE_PATTERN= Pattern.compile("^" +
                "(?=\\S+$)" +
                "[0-9]{1,2}" +
                "$");
        Pattern PHONE_PATTERN=Pattern.compile("^(0|91)?[7-9][0-9]{9}$");
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                username=findViewById(R.id.Name);
                age=findViewById(R.id.age);
                phone=findViewById(R.id.phone);
                pass=findViewById(R.id.Password);
                b1=findViewById(R.id.button);
                b1.setOnClickListener(new View.OnClickListener() {
                        private Object Empty;

                        @Override
                        public void onClick(View v) {
                                String inpName=username.getText().toString();
                                String inpAge=age.getText().toString();
                                String inpPh=phone.getText().toString();
                                String inpPass=pass.getText().toString();
                                if(inpName.isEmpty()){
                                        Toast.makeText(MainActivity.this, "Name Field is Empty", Toast.LENGTH_SHORT).show();

                                }
                                if(inpAge.isEmpty()){
                                        Toast.makeText(MainActivity.this, "Age field is Empty", Toast.LENGTH_SHORT).show();
                                }
                                if(inpPh.isEmpty()){
                                        Toast.makeText(MainActivity.this, "Phone field is Empty", Toast.LENGTH_SHORT).show();
                                }
                                if(inpPass.isEmpty()){
                                        Toast.makeText(MainActivity.this, "Pass field is Empty", Toast.LENGTH_SHORT).show();
                                }
                                if (!USERNAME_PATTERN.matcher(inpName).matches()){
                                        username.setError("Enter alphabets [6-30 characters]");
                                }
                                if (!AGE_PATTERN.matcher(inpAge).matches()) {
                                        age.setError("Incorrect Age");
                                }
                                if (!PHONE_PATTERN.matcher(inpPh).matches()){
                                        phone.setError("Contains only 10 digits");
                                }
                                if (!PASSWORD_PATTERN.matcher(inpPass).matches()){
                                        pass.setError("Password is too weak");
                                }
                                else{
                                        Toast.makeText(MainActivity.this, "Success",
                                                Toast.LENGTH_SHORT).show();
                                }
                        }
                });

        }
}
