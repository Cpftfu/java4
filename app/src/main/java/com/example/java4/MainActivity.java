package com.example.java4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button_for_first = new MaterialButton(this);
        button_for_first.setText("ЗАДАНИЕ 1");

        Button button_for_second = new MaterialButton(this);
        button_for_second.setText("ЗАДАНИЕ 2");

        Button button_for_third = new MaterialButton(this);
        button_for_third.setText("ЗАДАНИЕ 3");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(button_for_first);
        layout.addView(button_for_second);
        layout.addView(button_for_third);

        layout.setGravity(Gravity.CENTER); // выравнивание линейного макета по центру экрана

        setContentView(layout);

        // добавление обработчиков для кнопок
        // для первого задания
        button_for_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_first_task.class);
                startActivity(intent);
            }
        });
        // для второго задания
        button_for_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_second_task.class);
                startActivity(intent);
            }
        });
        //для третьего задания
        button_for_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_third_task.class);
                startActivity(intent);
            }
        });


    }

}
