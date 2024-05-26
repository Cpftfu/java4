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

public class Activity_third_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView txt = new TextView(this);
        txt.setText("НА ПЯТЁРКУ НЕ ЗАХОТЕЛА, ИЗВИНИТЕ!");
        txt.setTextSize(40); // установка размера текста в 40px
        txt.setGravity(Gravity.CENTER); // выравнивание текста по центру экрана

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
        layout.addView(backButton);

        layout.setGravity(Gravity.CENTER); // выравнивание линейного макета по центру экрана

        setContentView(layout);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_third_task.this, MainActivity.class);
                startActivity(intent);
                finish(); // Добавляем finish() для закрытия текущей Activity, если нужно вернуться назад на MainActivity
            }
        });
    }
    }