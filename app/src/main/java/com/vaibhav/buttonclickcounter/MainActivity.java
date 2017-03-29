package com.vaibhav.buttonclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables referring to widgets
    private EditText userInput;
    private Button button;
    private TextView textView;
    private int numTimesClicked = 0; // Keeps track of clicks


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(""); // Initialise textView with empty string
        textView.setMovementMethod(new ScrollingMovementMethod()); // Adding scrolling functionality to textView
        View.OnClickListener ourOnClickListener = new View.OnClickListener() { // New object of type View.OnClockListener interface
            @Override
            public void onClick(View v) {
                numTimesClicked = numTimesClicked + 1;
                String result = "\nThe button got tapped " + numTimesClicked + " time";
                if(numTimesClicked != 1) {result += "s";} // this is the same as result = result + "s"
                textView.append(result);
            }
        };
        button.setOnClickListener(ourOnClickListener); // Uses ourOnClickListener whenever the button is clicked

    }


}
