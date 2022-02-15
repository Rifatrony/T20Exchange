package com.example.t20exchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class AgentListActivity extends AppCompatActivity implements View.OnClickListener {

    ConstraintLayout constraintLayout1, constraintLayout2, constraintLayout3, constraintLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_list);

        this.setTitle("AGENT LIST");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        constraintLayout1 = findViewById(R.id.constrainLayoutSupplierList);
        constraintLayout2 = findViewById(R.id.constrainLayoutMasterList);
        constraintLayout3 = findViewById(R.id.constrainLayoutAdminList);
        constraintLayout4 = findViewById(R.id.constrainLayoutCustomerService);


        constraintLayout1.setOnClickListener(this);
        constraintLayout2.setOnClickListener(this);
        constraintLayout3.setOnClickListener(this);
        constraintLayout4.setOnClickListener(this);

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

        if (view.getId()==R.id.constrainLayoutSupplierList){
            Intent intent = new Intent(this,SuperListActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.constrainLayoutMasterList){
            Intent intent = new Intent(this,MasterAgentActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.constrainLayoutAdminList){
            Intent intent = new Intent(this,AdminListActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.constrainLayoutCustomerService){
            Intent intent = new Intent(this,CustomerServiceActivity.class);
            startActivity(intent);
        }

    }
}