package com.vaibhav.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables referring to widgets
    private EditText userInput;
    private TextView textView;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "TextContents"; // This constant is required to save the contents of textView widget


    @Override
    protected void onCreate(Bundle savedInstanceState) { // onCreate method automatically starts once the activity is started
        Log.d(TAG, "onCreate: in"); // in means when the method has started

        super.onCreate(savedInstanceState); // Used to change the state of the editable text widgets
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        userInput.setText(""); // Initialise userInput with empty string
        Button button = (Button) findViewById(R.id.button); // Created a local variable for Button
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(""); // Initialise textView with empty string
        textView.setMovementMethod(new ScrollingMovementMethod()); // Adding scrolling functionality to textView
        View.OnClickListener ourOnClickListener = new View.OnClickListener() { // New object of type View.OnClockListener interface
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString(); // getText used to retrieve value from userInput, note this returns an editable text and then we convert it to string with .toString
                // The following 2 lines are an alternative way to achieve the same thing as the above line
                /* Editable e = userInput.getText();
                String result = e.toString(); */
                result = result + "\n";
                textView.append(result);
                userInput.setText(""); //Clear text after it has been addded to textView
            }
        };
        button.setOnClickListener(ourOnClickListener); // Uses ourOnClickListener whenever the button is clicked
        Log.d(TAG, "onCreate: out"); // out means we are leaving the onCreate method

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onStart: in");
        super.onRestoreInstanceState(savedInstanceState);
        String savedString = savedInstanceState.getString(TEXT_CONTENTS); // Used to restore the contents of textView widget
        textView.setText(savedString); // Restore contents
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onStart: in");
        super.onRestart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onStart: in");
        outState.putString(TEXT_CONTENTS, textView.getText().toString()); // Used to save the contents of textView widget into the TEXT_CONTENTS constant
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onStart: out");

    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onStart: in");
        super.onPause();
        Log.d(TAG, "onStart: out");
    }


    @Override
    protected void onResume() {
        Log.d(TAG, "onStart: in");
        super.onResume();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStart: in");
        super.onStop();
        Log.d(TAG, "onStart: out");
    }


}
