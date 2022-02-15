package com.example.t20exchange;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView userLoginCardView, agentLoginCardView, agentListCardView, contactCardView, facebookGroupCardView, facebookPageCardView;
    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userLoginCardView = findViewById(R.id.userLoginCardViewId);
        agentLoginCardView = findViewById(R.id.agentLoginCardViewId);
        agentListCardView = findViewById(R.id.agentListCardViewId);
        contactCardView = findViewById(R.id.contactCardViewId);
        facebookGroupCardView = findViewById(R.id.facebookGroupCardViewId);
        facebookPageCardView = findViewById(R.id.facebookPageCardViewId);


        userLoginCardView.setOnClickListener(this);
        agentLoginCardView.setOnClickListener(this);
        agentListCardView.setOnClickListener(this);
        contactCardView.setOnClickListener(this);
        facebookGroupCardView.setOnClickListener(this);
        facebookPageCardView.setOnClickListener(this);


    }

    public void onBackPressed() {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //set title
        alertDialogBuilder.setTitle("T20exchange");
        //Setting message

        alertDialogBuilder.setMessage("Are you sure you want to exit ?");

        //set icon

        alertDialogBuilder.setIcon(R.drawable.logo);

        alertDialogBuilder.setCancelable(false);

        //set positive button
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //exit
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });

      /*alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {

              Toast.makeText(MainDashBoard.this, "You have clicked on cancel button",Toast.LENGTH_SHORT).show();
          }
      });*/

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.userLoginCardViewId){
            Intent intent = new Intent(this, UserLoginActivity.class);
            startActivity(intent);
        }

        if (view.getId() == R.id.agentLoginCardViewId){
            Intent intent = new Intent(this, AgentLoginActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.agentListCardViewId){
            Intent intent = new Intent(this, AgentListActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.contactCardViewId){
            Intent intent = new Intent(this, ContactActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.facebookGroupCardViewId){
            Intent intent = new Intent(this, FacebookGroupActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.facebookPageCardViewId){
            Intent intent = new Intent(this, FacebookPageActivity.class);
            startActivity(intent);
        }

    }
}