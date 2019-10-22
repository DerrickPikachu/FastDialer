package com.example.fastdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
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
        Intent callTO = new Intent(ContactsContract.Intents.Insert.ACTION);

        callTO.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        callTO.putExtra(ContactsContract.Intents.Insert.NAME, "客服專線");
        callTO.putExtra(ContactsContract.Intents.Insert.PHONE, "800");

        startActivity(callTO);
    }
}
