package ru.arvalon.advanceduitechniques.customfont;

import androidx.appcompat.app.AppCompatActivity;
import ru.arvalon.advanceduitechniques.R;

import android.os.Bundle;

public class CustomFontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_font);
        setTitle("Custom font example");
    }
}
