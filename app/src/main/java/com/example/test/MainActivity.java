package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.DAO.IPersonDAO;
import com.example.test.DAO.PersonDAOData;
import com.example.test.DTO.Person;

public class MainActivity extends AppCompatActivity {

    Button btn_afficher;
    Button btn_ajouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_afficher = (Button) findViewById(R.id.affichage);
        btn_afficher.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Affichage ok", Toast.LENGTH_LONG).show();
                        Intent activityChangeIntent = new Intent(MainActivity.this, ListPersonActivity.class);
                        MainActivity.this.startActivity(activityChangeIntent);
                    }
                }
        );

        btn_ajouter = (Button) findViewById(R.id.ajouter);
        btn_ajouter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent activityChangeIntent = new Intent(MainActivity.this, InsertPersonActivity.class);
                        MainActivity.this.startActivity(activityChangeIntent);
                    }
                }
        );

    }


}