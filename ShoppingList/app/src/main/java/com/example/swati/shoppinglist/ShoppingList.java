package com.example.swati.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShoppingList extends AppCompatActivity {
    public static final String FOOD_ITEM = "com.example.swati.shoppingList.extra.FoodItem";
    private TextView mShoppingItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
        mShoppingItem = findViewById(R.id.textView_1);

    }


    public void returnFoodItem(View view) {
        Button b = (Button)view;
        String foodItem = b.getText().toString();

        Intent fItemIntent = new Intent();
        fItemIntent.putExtra(FOOD_ITEM, foodItem);
        setResult(RESULT_OK, fItemIntent);

        finish();
    }
}
