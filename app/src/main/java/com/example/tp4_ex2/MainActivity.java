package com.example.tp4_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragment = getSupportFragmentManager();
                SimpleDialogFragment simpleDialogFragment = SimpleDialogFragment.newInstance(R.layout.card);
                simpleDialogFragment.show(fragment, "fragment_simple_dialog");
            }
        });

        findViewById(R.id.btnPaypal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragment = getSupportFragmentManager();
                SimpleDialogFragment simpleDialogFragment = SimpleDialogFragment.newInstance(R.layout.paypal);
                simpleDialogFragment.show(fragment, "fragment_simple_dialog");
            }
        });
    }
}