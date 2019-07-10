package com.poliban.asus.pertemuan7b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText in;
    private TextView hasil;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in=(EditText)findViewById(R.id.edit);
        hasil=(TextView)findViewById(R.id.hasil);
        ok=(Button)findViewById(R.id.button);
    }
    public void ok(View v){
        hasil.setText(in.getText());
    }
}
