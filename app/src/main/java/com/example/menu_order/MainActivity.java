package com.example.menu_order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
private Spinner spnMenu;
private Button btnSearch;
private ListView lstItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      setupViews();
      btnSearch.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });
    }

    private void setupViews() {
        spnMenu=findViewById(R.id.spinner);
        btnSearch=findViewById(R.id.btnSearch);
        lstItems=findViewById(R.id.lstltems);

    }

}