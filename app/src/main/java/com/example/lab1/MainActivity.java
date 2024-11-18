package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView groupText;
    TextView fioText;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button hideTextBtn = findViewById(R.id.hide_text);
        Button hideImageBtn = findViewById(R.id.hide_image);
        groupText = findViewById(R.id.group_text);
        fioText = findViewById(R.id.fio_text);
        image = findViewById(R.id.image);

        hideTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                groupText.setVisibility(groupText.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                fioText.setVisibility(fioText.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
            }
        });

        hideImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(image.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
            }
        });
    }
}