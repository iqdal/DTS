package com.poliban.asus.pertemuan8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Algo2 extends AppCompatActivity {
    Button ok;
    TextView Tampilkan;
    EditText in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo2);
        in=findViewById(R.id.input);
        Tampilkan=findViewById(R.id.hasil);
        ok=findViewById(R.id.OK);
    }
    public void Tampil(View v){
        int a =Integer.parseInt(in.getText().toString());
        if (a%2==0){
            Tampilkan.setText(a+" adalah Bilangan Genap");
        }
        else Tampilkan.setText(a+" adalah Bilangan Ganjil");
    }
}
