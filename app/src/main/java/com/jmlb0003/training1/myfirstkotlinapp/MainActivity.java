package com.jmlb0003.training1.myfirstkotlinapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputEditText = (EditText) findViewById(R.id.inputEditText);
        final Button button = (Button) findViewById(R.id.showTextButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final String textToShow = inputEditText.getText().toString();
                Toast.makeText(MainActivity.this, textToShow, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
