package com.example.myapplication;

import static com.example.myapplication.R.*;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView image, image2, image3, image4, image5;
    private CheckBox cB_Burger, cB_Fry, cB_Cola, cB_Cof, cB_Soup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.img_Bur);
        image2 = (ImageView) findViewById(R.id.img_Fry);
        image3 = (ImageView) findViewById(R.id.img_Cola);
        image4 = (ImageView) findViewById(R.id.img_Coffee);
        image5 = (ImageView) findViewById(R.id.img_Soup);


        image.setVisibility(ImageView.GONE);
        image2.setVisibility(ImageView.GONE);
        image3.setVisibility(ImageView.GONE);
        image4.setVisibility(ImageView.GONE);
        image5.setVisibility(ImageView.GONE);

        cB_Burger = findViewById(R.id.cB_Burger);
        cB_Fry = findViewById(R.id.cB_Fry);
        cB_Cola = findViewById(R.id.cB_Cola);
        cB_Cof = findViewById(R.id.cB_Coffee);
        cB_Soup = findViewById(R.id.cB_Soup);

        cB_Burger.setOnCheckedChangeListener(onCheckedChangeListener);
        cB_Fry.setOnCheckedChangeListener(onCheckedChangeListener);
        cB_Cola.setOnCheckedChangeListener(onCheckedChangeListener);
        cB_Cof.setOnCheckedChangeListener(onCheckedChangeListener);
        cB_Soup.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private final CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.getId() == id.cB_Burger) {
                if (isChecked) {
                    image.setVisibility(ImageView.VISIBLE);
                } else {
                    image.setVisibility(ImageView.GONE);
                }
            } else if (buttonView.getId() == id.cB_Fry) {
                if (isChecked) {
                    image2.setVisibility(ImageView.VISIBLE);
                } else {
                    image2.setVisibility(ImageView.GONE);
                }
            } else if (buttonView.getId() == id.cB_Cola) {
                if (isChecked) {
                    image3.setVisibility(ImageView.VISIBLE);
                } else {
                    image3.setVisibility(ImageView.GONE);
                }
            } else if (buttonView.getId() == id.cB_Coffee) {
                if (isChecked) {
                    image4.setVisibility(ImageView.VISIBLE);
                } else {
                    image4.setVisibility(ImageView.GONE);
                }
            } else if (buttonView.getId() == id.cB_Soup) {
                if (isChecked) {
                    image5.setVisibility(ImageView.VISIBLE);
                } else {
                    image5.setVisibility(ImageView.GONE);
                }
            }
        }
    };
}