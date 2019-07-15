package com.poliban.asus.pertemuan10a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static final String Filename="pertemuan10a.txt";
    Button buat,ubah,hapus,baca;
    TextView bacateks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buat=findViewById(R.id.buat);
        ubah=findViewById(R.id.ubah);
        hapus=findViewById(R.id.hapus);
        baca=findViewById(R.id.baca);
        bacateks=findViewById(R.id.textView);
    }
    public void buatFile(View v){
        String isiFile="Coba isi data File Text";
        File file =new File(getFilesDir(),Filename);
        FileOutputStream outputStream=null;
        try{
            file.createNewFile();
            outputStream=new FileOutputStream(file,true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ubahFile(View v){
        String ubah="update isi data File Text";
        File file =new File(getFilesDir(),Filename);
        FileOutputStream outputStream=null;
        try{
            file.createNewFile();
            outputStream=new FileOutputStream(file,false);
            outputStream.write(ubah.getBytes());
            outputStream.flush();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void bacaFile(View v){
        File sdcard=getFilesDir();
        File file =new File(getFilesDir(),Filename);
        if(file.exists()){
         StringBuilder teks= new StringBuilder();

        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line =br.readLine();

            while (line !=null){
                teks.append(line);
                line=br.readLine();
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        bacateks.setText(teks.toString());
        }
        else {
            bacateks.setText("File tidak ada");
        }
    }
    public void hapusFile(View v){
        File file=new File(getFilesDir(),Filename);
        if (file.exists()){
            file.delete();
        }

    }
}
