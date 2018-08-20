package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//a variable name for bundle class
        //TextView text1 = new TextView();
        setContentView(R.layout.activity_main);//R is resource class which maps the class with its resources
        Button button ;
        button = (Button) findViewById(R.id.one);
        final TextView text1;
        text1 = (TextView) findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text1.getText().toString();
                if(s.charAt(0)=='W')
                    text1.setText("1");
                else
                    text1.setText(s+"1");
            }
        });
    }
}
