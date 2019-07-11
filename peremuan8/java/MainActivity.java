package com.poliban.asus.pertemuan8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ok;
    TextView Hasil;
    EditText in;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.opsi,menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=(Button)findViewById(R.id.button);
        Hasil=(TextView)findViewById(R.id.hasil);
        in=(EditText) findViewById(R.id.input);
    }
    public void In(View v){
        Hasil.setText(in.getText());
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu2){
            startActivity(new Intent(this,Project2.class));
        }
        else if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this,MainActivity.class));
        }
        else if (item.getItemId()==R.id.menu3){
            startActivity(new Intent(this,Algo2.class));
        }
        return true;

    }
}
