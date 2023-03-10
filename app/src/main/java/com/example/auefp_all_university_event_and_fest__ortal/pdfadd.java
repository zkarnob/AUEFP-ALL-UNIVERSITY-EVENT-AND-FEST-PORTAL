package com.example.auefp_all_university_event_and_fest__ortal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;

import androidx.drawerlayout.widget.DrawerLayout;

import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class pdfadd extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        bottomNavigationView =findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch ((item.getItemId()))
                {
                    case R.id.home:
                        Intent intent=new Intent(pdfadd.this,MainActivity.class);
                        startActivity(intent);
                        return true;
                    case  R.id.placeholder:

                        return  true;

                }
                return false;
            }
        });




    }
}
