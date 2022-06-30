package com.example.urusov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class urus_2 extends AppCompatActivity {
private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=(ImageButton) findViewById(R.id.root_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent intent=new Intent(this, urus_3.class);
        startActivity(intent);
    }


    public void startNewActivity(View v){
        Intent intent=new Intent(this, urus_4.class);

        startActivity(intent);
    }
}