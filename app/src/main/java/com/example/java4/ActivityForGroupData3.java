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

public class ActivityForGroupData3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt3 = new TextView(this);
        txt3.setText("ВЫ ОТКРЫЛИ ГРУППУ Т50-11/1-22");
        txt3.setTextSize(40); // установка размера текста в 40px
        txt3.setGravity(Gravity.CENTER); // выравнивание текста по центру экрана


        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // добавление кнопочки для возврата на основное окошко!
        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params3);


        backButton.setGravity(Gravity.CENTER);
        LinearLayout layout3 = new LinearLayout(this);
        layout3.setOrientation(LinearLayout.VERTICAL);
        layout3.addView(txt3);
        layout3.addView(backButton);

        layout3.setGravity(Gravity.CENTER);

        setContentView(layout3);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ActivityForGroupData3.this, Activity_second_task.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}