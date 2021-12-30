package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;



public class FavouriteAcitivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        ListView lV = findViewById(R.id.simpleListView);

        Intent i = getIntent();
        String[] favs = i.getStringArrayExtra("COOL");
        //Log.d("mumu", favs[0]);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_favourites,R.id.textView, favs);
        lV.setAdapter(adapter);
        Intent j = new Intent(this, MainActivity.class);

        lV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                System.out.println(selectedItem+"2");
                j.putExtra("listCity", selectedItem);
                startActivity(j);
            }
        });





    }




}
