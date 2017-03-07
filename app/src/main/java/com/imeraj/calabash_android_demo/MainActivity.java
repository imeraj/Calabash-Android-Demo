package com.imeraj.calabash_android_demo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginPressed(View view) {
        showAlert();
    }

    public void showAlert() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Calabash-Android-Demo")
                .setMessage("Stay tuned!")
                .setPositiveButton("Ok", null)
                .show();
    }

}
