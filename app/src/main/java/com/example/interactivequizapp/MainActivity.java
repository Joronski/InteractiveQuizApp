package com.example.interactivequizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String result = "Toronto";
    private Button choice1;
    private Button choice2;
    private Button choice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);

        choice1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice1.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice2.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });

        choice3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if(choice3.getText().equals(result))
                    showToastMessage(true);
                else
                    showToastMessage(false);
            }
        });
    }

    private void showToastMessage(boolean showToastMessage) {
        if(showToastMessage)
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
    }
}