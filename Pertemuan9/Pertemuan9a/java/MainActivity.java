package com.poliban.asus.pertemuan9a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ok;
    TextView hsl;
    EditText nim,nama,kampus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=findViewById(R.id.tampil);
        nim=findViewById(R.id.nim);
        nama=findViewById(R.id.nama);
        kampus=findViewById(R.id.kampus);
        hsl=findViewById(R.id.Tampilkan);
    }
    public  void HASIL(View v){
        hsl.setText("Hasil :\n"+nim.getText()+"\n"+nama.getText()+"\n"+kampus.getText()+"\n");
    }
}
