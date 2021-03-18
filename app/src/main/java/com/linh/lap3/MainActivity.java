package com.linh.lap3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSet = findViewById(R.id.btnSetName);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nickName();

            }
        });
    }
    public void nickName(){
        TextView editName = findViewById(R.id.editName);
        TextView txtName = findViewById(R.id.txtName);

        txtName.setText(editName.getText());
    }
}