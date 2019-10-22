package com.example.fastdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button callBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callBtn = findViewById(R.id.callBtn);
        callBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent callTO = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:800"));
        startActivity(callTO);
    }
}
