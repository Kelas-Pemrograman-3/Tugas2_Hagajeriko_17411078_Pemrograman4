package com.haga.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tampilan extends AppCompatActivity {

    TextView Vdata;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        Vdata = (TextView) findViewById(R.id.viewnpm);

        Intent data = getIntent();
        String Npm = data.getStringExtra("Npm");
        String Nama = data.getStringExtra("Nama");

        Vdata.setText(Npm +"\n" + Nama);


    }

    @Override
    public void onBackPressed() {

        Intent back = new Intent(Tampilan.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}

