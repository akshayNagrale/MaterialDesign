package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout parent;
    private MaterialButton show;
    private FloatingActionButton fab;
    ImageView imgView;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.button);
        parent = findViewById(R.id.parent);
        fab = findViewById(R.id.fab);
        imgView = findViewById(R.id.imgView);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onImageClick();
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickFab();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });
    }

    private void onImageClick() {
        Toast.makeText(this, "Dog Image Clicked", Toast.LENGTH_SHORT).show();
    }

    private void clickFab() {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }

    private void showSnackBar() {
        Snackbar.make(parent,"This is SnackBar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    public void action1(View view) {
        Toast.makeText(this, "Action One Clicked", Toast.LENGTH_SHORT).show();

    }

    public void action2(View view) {
        Toast.makeText(this, "Action two Clicked", Toast.LENGTH_SHORT).show();
    }
}
