package com.example.java4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class Activity_second_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt = new TextView(this);
        txt.setText("ГРУППЫ Т50");
        txt.setTextSize(50);
        txt.setGravity(Gravity.CENTER);

        Button button1 = new MaterialButton(this);
        button1.setText("Группа Т50-11-23");

        Button button2 = new MaterialButton(this);
        button2.setText("Группа Т50-1-20");

        Button button3 = new MaterialButton(this);
        button3.setText("Группа Т50-1-22, Т50-11/1-23");

        Button button4 = new MaterialButton(this);
        button4.setText("Группа Т50-11/1-22");

        Button button5 = new MaterialButton(this);
        button5.setText("Группа Т50-11-22");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // добавление кнопочки для возврата на основное окошко!
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params);

        backButton.setGravity(Gravity.CENTER);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(txt);
        layout.addView(button1);
        layout.addView(button2);
        layout.addView(button3);
        layout.addView(button4);
        layout.addView(button5);
        layout.addView(backButton);
        layout.setGravity(Gravity.CENTER); // выравнивание линейного макета по центру экрана

        setContentView(layout);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, MainActivity.class);
                startActivity(intent);
                finish(); // добавляем сюда finish для закрытия текущего окошка
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, ActivityForGroupData.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, ActivityForGroupData1.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, ActivityForGroupData2.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, ActivityForGroupData3.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_second_task.this, ActivityForGroupData4.class);
                startActivity(intent);
            }
        });
    }
    }