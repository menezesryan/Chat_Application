package com.example.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.chat_application.databinding.ActivityOtpactivityBinding;
import com.google.firebase.auth.FirebaseAuth;

public class OTPActivity extends AppCompatActivity {

    private ActivityOtpactivityBinding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth = FirebaseAuth.getInstance();
        String phone = getIntent().getStringExtra("number");

        Toast.makeText(getApplicationContext(), phone, Toast.LENGTH_SHORT).show();

    }
}