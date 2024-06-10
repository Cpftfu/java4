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

public class ActivityForGroupData2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt2 = new TextView(this);
        txt2.setText("ВЫ ОТКРЫЛИ ГРУППУ Т50-1-22, Т50-11/1-23");
        txt2.setTextSize(40); // установка размера текста в 40px
        txt2.setGravity(Gravity.CENTER); // выравнивание текста по центру экрана


        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // добавление кнопочки для возврата на основное окошко!
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params2);


        backButton.setGravity(Gravity.CENTER);
        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.VERTICAL);
        layout2.addView(txt2);
        layout2.addView(backButton);

        layout2.setGravity(Gravity.CENTER);

        setContentView(layout2);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ActivityForGroupData2.this, Activity_second_task.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}