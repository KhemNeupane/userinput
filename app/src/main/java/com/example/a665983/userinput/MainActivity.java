package com.example.a665983.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name, email;
    int favoriteNumber;

    EditText nameInput;
    EditText emailInput;
    EditText favoriteNumberInput;

    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        favoriteNumberInput = (EditText) findViewById(R.id.favoriteNumberInput);

        Spinner mySpinner =(Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter =new ArrayAdapter<String> (MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                favoriteNumber = Integer.valueOf(favoriteNumberInput.getText().toString());

                showToast(name);


            }

        });


    }


private void showToast(String text) {
Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT).show();
 }

}

