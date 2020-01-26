 package com.haga.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    EditText npm;
    EditText nama;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        npm = (EditText)findViewById(R.id.npm);
        nama = (EditText) findViewById(R.id.nama);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Npm = npm.getText().toString();
                String Nama = nama.getText().toString();

                Intent lanjut = new Intent(MainActivity.this,Tampilan.class);
                lanjut.putExtra("Npm", Npm);
                lanjut.putExtra("Nama", Nama);

                startActivity(lanjut);
                finish();

              }
        });

    }
}
