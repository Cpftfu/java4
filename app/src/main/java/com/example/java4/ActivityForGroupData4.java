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

public class ActivityForGroupData4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt4 = new TextView(this);
        txt4.setText("ВЫ ОТКРЫЛИ ГРУППУ Т50-11-22");
        txt4.setTextSize(40); // установка размера текста в 40px
        txt4.setGravity(Gravity.CENTER); // выравнивание текста по центру экрана


        LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // добавление кнопочки для возврата на основное окошко!
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params4);


        backButton.setGravity(Gravity.CENTER);
        LinearLayout layout4 = new LinearLayout(this);
        layout4.setOrientation(LinearLayout.VERTICAL);
        layout4.addView(txt4);
        layout4.addView(backButton);

        layout4.setGravity(Gravity.CENTER);

        setContentView(layout4);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(ActivityForGroupData4.this, Activity_second_task.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}