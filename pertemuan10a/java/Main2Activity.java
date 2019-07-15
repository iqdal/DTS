package com.poliban.asus.pertemuan10a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void inter(View v){
        startActivity(new Intent(Main2Activity.this,MainActivity.class));
    }
    public void exter(View v){
        startActivity(new Intent(Main2Activity.this,Project2.class));
    }
}
