package com.example.a0516_hw;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Spinner Mfood, food2, drink  ;
    private TextView txv_Mfood ;

    private String[] FoodMain;
    private String[] Food;
    private String[] Drink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txv_Mfood = (TextView) findViewById(R.id.order_food1);


        Mfood = (Spinner) findViewById(R.id.food_Main);
        food2 = (Spinner) findViewById(R.id.food2);
        drink = (Spinner) findViewById(R.id.Drink);

        FoodMain = getResources().getStringArray(R.array.strMFood);
        Food = getResources().getStringArray(R.array.strFood2);
        Drink = getResources().getStringArray(R.array.strDrink);

        drink.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txv_Mfood.setText("主餐：" + FoodMain[position] +"\n"
                        + "副餐：" + Food[position] +"\n" + "飲料：" + Drink[position] );
                Toast.makeText(MainActivity.this, "主餐：" + FoodMain[position]+"\n"
                                + "副餐：" + Food[position] +"\n"
                                + "飲料：" + Drink[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}