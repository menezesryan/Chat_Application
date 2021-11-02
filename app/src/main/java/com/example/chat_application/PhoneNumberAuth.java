package com.example.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chat_application.databinding.ActivityPhoneNumberAuthBinding;

public class PhoneNumberAuth extends AppCompatActivity {

    ActivityPhoneNumberAuthBinding binding;     //binding acts in place of findViewById(). so we can directly use xml id instead of creating objects here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneNumberAuth.this, OTPActivity.class);
                intent.putExtra("number", binding.phoneNumber.getText().toString());
                startActivity(intent);
            }
        });
    }
}