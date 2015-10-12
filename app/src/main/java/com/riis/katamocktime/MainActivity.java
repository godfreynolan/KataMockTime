package com.riis.katamocktime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

<<<<<<< HEAD:app/src/main/java/com/riis/katamocktime/MainActivity.java

public class MainActivity extends Activity {

    private TimeChange timeChange;
=======

public class MainActivity extends Activity {
    private MyClass myClass;
>>>>>>> origin/master:app/src/main/java/com/riis/katamocktime/MainActivity.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.txt_field);
        // String s = myClass.getDoubleTime().toString();
        // myTextView.setText(s);
<<<<<<< HEAD:app/src/main/java/com/riis/katamocktime/MainActivity.java
        myTextView.setText("Hello World");
=======
        myTextView.setText("bollox");
>>>>>>> origin/master:app/src/main/java/com/riis/katamocktime/MainActivity.java
    }





}
