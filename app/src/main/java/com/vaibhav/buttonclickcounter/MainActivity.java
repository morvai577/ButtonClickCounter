package com.vaibhav.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables referring to widgets
    private EditText userInput;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
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
            }
        };
        button.setOnClickListener(ourOnClickListener); // Uses ourOnClickListener whenever the button is clicked

    }


}
