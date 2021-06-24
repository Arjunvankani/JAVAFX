package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity<bt_nextscreen, send> extends AppCompatActivity {





    public void sendNow(View view){
        Toast.makeText( this, "Your phone's  secure data from Samsung cloud  of  data will be send this to our server..." +
                "Please contact Samsung care " ,Toast.LENGTH_LONG ).show();

    }
    public void reciveNow(View view){
        Toast.makeText( this, "You will be HACK !!...",Toast.LENGTH_LONG ).show();
    }
    public void deletNow(View view){
        Toast.makeText( this, " Can't deleting Data from App...",Toast.LENGTH_LONG ).show();
    }


/*
    send = (Button) findViewById(R.id.send);

     send.setOnClickListener(new <activity_main> OnClickListener() {

        @Override
        public void onClick(View view) {
            // TODO Auto-generated method stub
            Intent intent = new Intent(activity_main.this,second.class);
            startActivity(intent);
        }
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }


}
