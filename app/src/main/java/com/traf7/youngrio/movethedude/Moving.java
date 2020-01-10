package com.traf7.youngrio.movethedude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Moving extends AppCompatActivity {

    ImageButton up, down, left, right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moving);

        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        final ImageView image = findViewById(R.id.dude);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ViewGroup.MarginLayoutParams)image.getLayoutParams()).topMargin -= 1;
                image.requestLayout();
                ((ViewGroup.MarginLayoutParams)image.getLayoutParams()).bottomMargin += 1;
                image.requestLayout();
            }
        });
    }
}
