package com.example.auefp_all_university_event_and_fest__ortal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class zero extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero);
        button=(Button) findViewById(R.id.tomain);

    }
    public void tomain(View view)
    {
       Intent intent=new Intent(zero.this, imageupactivity.class);
       startActivity(intent);
    }

}