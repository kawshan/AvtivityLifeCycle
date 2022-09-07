package com.example.avtivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cycle", "onResume: called");
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        Log.d("cykjhasjdfh", "onPause: ");
        super.onPause();
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        Log.d("cycle", "onStop: ");
        super.onStop();
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        Log.d("cycle", "onDestroy: ");
        super.onDestroy();
        Toast.makeText(MainActivity.this,"oncreate called",Toast.LENGTH_SHORT).show();

    }
}