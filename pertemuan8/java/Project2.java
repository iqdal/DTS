package com.poliban.asus.pertemuan8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Project2 extends AppCompatActivity {
    Button tambah,kurang,kali,bagi,clr;
    EditText tks1,tks2;
    TextView Tampilkan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);
        tambah=(Button)findViewById(R.id.Tambah);
        kurang=(Button)findViewById(R.id.Kurang);
        kali=(Button)findViewById(R.id.Kali);
        bagi=(Button)findViewById(R.id.Bagi);
        clr=(Button)findViewById(R.id.Bersihkan);
        tks1=(EditText) findViewById(R.id.Angka1);
        tks2=(EditText) findViewById(R.id.Angka2);
        Tampilkan=(TextView) findViewById(R.id.hasil);
    }
    public void klik_Tambah(View vi){
        if (tks1.getText().length()>0&&tks2.getText().length()>0){
            int angka1=Integer.parseInt(tks1.getText().toString());
            int angka2=Integer.parseInt(tks2.getText().toString());
            int hasil = angka1+angka2;
            Tampilkan.setText(Integer.toString(hasil));
        }
        else {
            Toast toast=Toast.makeText(Project2.this,"Masukkan angka Terlebih dulu",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void klik_Kurang(View vi){
        if (tks1.getText().length()>0&&tks2.getText().length()>0){
            int angka1=Integer.parseInt(tks1.getText().toString());
            int angka2=Integer.parseInt(tks2.getText().toString());
            int hasil = angka1-angka2;
            Tampilkan.setText(Integer.toString(hasil));
        }
        else {
            Toast toast=Toast.makeText(Project2.this,"Masukkan angka Terlebih dulu",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void klik_Kali(View vi){
        if (tks1.getText().length()>0&&tks2.getText().length()>0){
            int angka1=Integer.parseInt(tks1.getText().toString());
            int angka2=Integer.parseInt(tks2.getText().toString());
            int hasil = angka1*angka2;
            Tampilkan.setText(Integer.toString(hasil));
        }
        else {
            Toast toast=Toast.makeText(Project2.this,"Masukkan angka Terlebih dulu",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void klik_Bagi(View vi){
        if (tks1.getText().length()>0&&tks2.getText().length()>0){
            int angka1=Integer.parseInt(tks1.getText().toString());
            int angka2=Integer.parseInt(tks2.getText().toString());
            int hasil = angka1/angka2;
            Tampilkan.setText(Integer.toString(hasil));
        }
        else {
            Toast toast=Toast.makeText(Project2.this,"Masukkan angka Terlebih dulu",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void klik_CLR(View vi){

    }
}
