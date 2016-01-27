package com.vb.aptiquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class TestActivity extends AppCompatActivity implements OnClickListener{

    BootstrapButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        b1=(BootstrapButton)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(BootstrapButton)findViewById(R.id.button2);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v==b1)
        {
            this.finish();
            Intent in =new Intent(this,AptitudeTestMenu.class);
            startActivity(in);
        }
        else
        {
            this.finish();
            Intent in =new Intent(this,VerbalTestMenu.class);
            startActivity(in);
        }
    }
}
