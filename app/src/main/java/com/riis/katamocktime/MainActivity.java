package com.riis.katamocktime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TimeChange timeChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.txt_field);
        // String s = myClass.getDoubleTime().toString();
        // myTextView.setText(s);
        myTextView.setText("Hello World");
    }
}
