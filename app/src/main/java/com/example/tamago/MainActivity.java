package com.example.tamago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int eggHealth = 100;
    TextView eggHealthTv;
    ImageView eggIv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eggHealthTv = findViewById(R.id.eggTv);
        eggIv = findViewById(R.id.eggIv);
        btn = findViewById(R.id.button);

        eggIv.setOnClickListener(v->{
            if(eggHealth>0){
                eggHealthTv.setText(String.valueOf(--eggHealth));
                compareHealth(eggHealth);
            }
        });

        btn.setOnClickListener(v->{
            eggHealth = 100;
            eggHealthTv.setText(String.valueOf(eggHealth));
            eggIv.setImageResource(R.drawable.egg);
        });
    }

    private void compareHealth(int eggHealth) {
        switch (eggHealth){
            case 80: eggIv.setImageResource(R.drawable.eggbreak1); break;
            case 50: eggIv.setImageResource(R.drawable.eggbreak2); break;
            case 10: eggIv.setImageResource(R.drawable.eggbreak3); break;
            case 0 : eggIv.setImageResource(R.drawable.eggbreaked); break;
        }
    }
}