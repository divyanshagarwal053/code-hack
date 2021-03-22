package com.example.techirrigator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // private EditText number,message;
    //   private Button On,Off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);

        /*       On = findViewById(R.id.button1);
        Off = findViewById(R.id.button2);
        On.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.putExtra("address", "9782789259");
                sendIntent.putExtra("sms_body", "ON MOTOR");
                sendIntent.setType("vnd.android_dir/mms-sms");
                startActivity(sendIntent);
            }
        });

        Off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.putExtra("address", "9782789259");
                sendIntent.putExtra("sms_body", "OFF MOTOR");
                sendIntent.setType("vnd.android_dir/mms-sms");
                startActivity(sendIntent);
            }
        });            */



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.share) {
            //further logic
            return true;
        }
        if (id==R.id.weather) {
            Intent intentprofile=new Intent(MainActivity.this,Weather.class);

            startActivity(intentprofile);



            //Intent intentProfile=new Intent(MainActivity.this, cityFinder.class);
            //startActivity(intentProfile);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendSMS1(View view) {
        String message1 = "ON MOTOR";
        //   String message2 = "OFF MOTOR";
        String number = "9680863538";

        SmsManager mySmsManager = SmsManager.getDefault();
        mySmsManager.sendTextMessage(number, null, message1, null, null);
        //   mySmsManager.sendTextMessage(number, null, message2, null, null);

    }
    public void sendSMS2(View view) {
        // String message1 = "ON MOTOR";
        String message2 = "OFF MOTOR";
        String number = "9680863538";

        SmsManager mySmsManager = SmsManager.getDefault();
        //  mySmsManager.sendTextMessage(number, null, message1, null, null);
        mySmsManager.sendTextMessage(number, null, message2, null, null);

    }
 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.share) {
            //further logic
            return true;
        }
        if (id==R.id.weather) {
            Intent intentprofile=new Intent(MainActivity.this,Weather.class);
            startActivity(intentprofile);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }           */
}