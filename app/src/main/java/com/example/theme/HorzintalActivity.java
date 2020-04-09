package com.example.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HorzintalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horzintal);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_a, new FragmentA())
                .add(R.id.container_b, new FragmentB())
                .add(R.id.container_c, new FragmentC())
                .add(R.id.container_d, new FragmentD())
                .commit();
    }
}
