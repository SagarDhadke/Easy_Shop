package net.uniquecomputer.easyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chaos.view.PinView;


public class MainActivity extends AppCompatActivity {

    Button SumButton;
    PinView pinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SumButton = findViewById(R.id.btnSubmit);
        pinView = findViewById(R.id.firstPinView);


        SumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pin = pinView.getText().toString();
                if (pin.equals("4464")) {
                    pinView.setLineColor(getResources().getColor(R.color.green));
                    Intent intent = new Intent(MainActivity.this, SignIn.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Passcode is correct", Toast.LENGTH_SHORT).show();

                } else {
                    pinView.setLineColor(getResources().getColor(R.color.red));
                    Toast.makeText(MainActivity.this, "Please Enter Your Passcode", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}