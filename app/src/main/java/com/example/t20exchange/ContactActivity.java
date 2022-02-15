package com.example.t20exchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    ConstraintLayout cl1, cl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        this.setTitle("CONTACT");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        cl1 = findViewById(R.id.constrainLayout1);
        cl2 = findViewById(R.id.constrainLayout2);


        cl1.setOnClickListener(this);
        cl2.setOnClickListener(this);


    }


    //Back button on top navbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.constrainLayout1){
            String wpurl = "https://wa.me/+1(214)307-5963?text=";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(wpurl));
            startActivity(intent);
        }
        if (view.getId()==R.id.constrainLayout2){
            String wpurl = "https://wa.me/+1 (848) 290-5843?";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(wpurl));
            startActivity(intent);
        }


    }
}