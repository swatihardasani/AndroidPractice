package com.example.swati.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   public static final int FOOD_ITEM_REQUEST = 1;
   private TextView mAddFoodItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddFoodItem = findViewById(R.id.textView_1);
    }

    public void showList(View view) {

        Intent intent = new Intent(this, ShoppingList.class);
        startActivityForResult(intent, FOOD_ITEM_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        if (requestCode == FOOD_ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(ShoppingList.FOOD_ITEM);
                mAddFoodItem.setText(reply);
                Log.d(reply,"madarjat");
            }
        }

    }

}
