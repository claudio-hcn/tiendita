package com.example.tiendita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private String mOrderMessage;
    private int contador2x2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Log.d("coloqueSuCodigoAqui", "se ha pulsado el boton FAB");
                mOrderMessage = getString(R.string.carrito_message);
                displayToast(mOrderMessage);
            }
        });


    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void show2x2order(View view) {
        mOrderMessage = getString(R.string.conector2x2_message);
        displayToast(mOrderMessage);
    }

    public void show3x6Order(View view) {
        mOrderMessage = getString(R.string.conector3x6_message);
        displayToast(mOrderMessage);
    }

    public void show2x6Order(View view) {
        mOrderMessage = getString(R.string.conector2x6_message);
        displayToast(mOrderMessage);
    }


}