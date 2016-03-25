package com.example.maelchiaverini.alerte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;

public class AlerteMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerte_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void Valider()
    {
        String num = "0672072712";
        String txt = "Bonjour comment vas tu";
        SmsManager.getDefault().sendTextMessage(num, null, txt, null, null);
    }

    public void Changement(View v)
    {
        Intent i=new Intent(AlerteMain.this,ContactActivity.class);
        startActivity(i);
    }
}