package com.example.maelchiaverini.alerte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Mael Chiaverini on 23/03/2016.
 */
public class HomeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_alerte_main);

        final ImageButton homeButton = (ImageButton) findViewById(R.id.buttonChangeHome);
        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent secondeActivite = new Intent(HomeActivity.this, AlerteMain.class);
                startActivity(secondeActivite);
            }
        });
    }
}
