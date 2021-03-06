package com.example.healthcareandnutritionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NutritionTips extends AppCompatActivity {
    private Toolbar toolbar;

    TextView general_Nutrition, nutrition_Children, nutrition_Men, nutrition_Women, nutritionTips_Hair, nutritionTips_skin, weight_Gain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_tips);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, MainActivity.class));
                finish();
            }
        });



        general_Nutrition = findViewById(R.id.generalNutritionTips);
        nutrition_Children = findViewById(R.id.nutritionTips_Children);
        nutrition_Men = findViewById(R.id.nutritionTips_Men);
        nutrition_Women = findViewById(R.id.nutritionTips_Women);
        nutritionTips_Hair = findViewById(R.id.nutritionTips_Hair);
        nutritionTips_skin = findViewById(R.id.nutritionTips_Skin);
        weight_Gain = findViewById(R.id.weightGainTips);

        general_Nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, GeneralNutrition.class));
                finish();
            }
        });


        nutrition_Children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForChildren.class));
                finish();
            }
        });


        nutrition_Men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForMen.class));
                finish();
            }
        });


        nutrition_Women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForWomen.class));
                finish();
            }
        });


        nutritionTips_Hair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForHealthyHair.class));
                finish();
            }
        });


        nutritionTips_skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForHealthySkin.class));
                finish();
            }
        });


        weight_Gain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionTips.this, NutritionTipsForGainingWeight.class));
                finish();
            }
        });

    }
}
