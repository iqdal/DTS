package com.poliban.asus.pertemuan10a;

import android.os.Environment;
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

import static android.os.Environment.getExternalStorageDirectory;

public class Project2 extends AppCompatActivity {
    public static final String Filename="pertemuan10a.txt";
    Button buat,ubah,hapus,baca;
    TextView bacateks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);
        buat=findViewById(R.id.buat2);
        ubah=findViewById(R.id.ubah2);
        hapus=findViewById(R.id.hapus2);
        baca=findViewById(R.id.baca2);
        bacateks=findViewById(R.id.textView2);
    }

    public void buatFile(View v){
        String isiFile="Coba isi data File Text";
        String state=Environment.getExternalStorageState();
        if (!Environment.MEDIA_MOUNTED.equals(state)){
            return;
        }
        File file =new File(getExternalFilesDir(null),Filename);
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
        File file =new File(getExternalFilesDir(null),Filename);
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
        File sdcard=getExternalFilesDir(null);
        File file =new File(getExternalFilesDir(null),Filename);
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
        File file=new File(getExternalFilesDir(null),Filename);
        if (file.exists()){
            file.delete();
        }

    }
}
