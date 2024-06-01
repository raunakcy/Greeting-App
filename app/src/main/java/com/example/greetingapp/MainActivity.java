package com.example.greetingapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnClick;
    TextView txtTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtName = findViewById(R.id.edtName);
        btnClick = findViewById(R.id.btnClick);
        txtTitle = findViewById(R.id.txtTitle);



        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edtName.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome " +input+ " to the World", Toast.LENGTH_SHORT).show();
            }
        });
    }
}