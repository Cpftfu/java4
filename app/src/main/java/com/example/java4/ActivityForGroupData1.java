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

public class ActivityForGroupData1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt1 = new TextView(this);
        txt1.setText("ВЫ ОТКРЫЛИ ГРУППУ Т50-1-20");
        txt1.setTextSize(40); // установка размера текста в 40px
        txt1.setGravity(Gravity.CENTER); // выравнивание текста по центру экрана


        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // добавление кнопочки для возврата на основное окошко!
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params1);


        backButton.setGravity(Gravity.CENTER);
        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.addView(txt1);
        layout1.addView(backButton);

        layout1.setGravity(Gravity.CENTER);

        setContentView(layout1);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityForGroupData1.this, Activity_second_task.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}