package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.DAO.IPersonDAO;
import com.example.test.DAO.PersonDAOData;
import com.example.test.DTO.Person;

public class InsertPersonActivity extends AppCompatActivity {

    EditText firstName, lastName;
    Button ajout;
    IPersonDAO personDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_person);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);

        personDAO   =new PersonDAOData();
        ajout = (Button) findViewById(R.id.ajouter);
        ajout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        firstName = (EditText) findViewById(R.id.firstName);
                        lastName = (EditText) findViewById(R.id.lastName);
                        ajout = (Button) findViewById(R.id.ajouter);
                        Person person  =new Person(firstName.getText().toString(), lastName.getText().toString(), Color.BLACK);
                        personDAO.addPerson(person);
                        Toast.makeText(getApplicationContext(), "Ajout de: " + person, Toast.LENGTH_LONG).show();
                    }
                });

    }

}
