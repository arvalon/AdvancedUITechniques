package ru.arvalon.advanceduitechniques;

import androidx.appcompat.app.AppCompatActivity;
import ru.arvalon.advanceduitechniques.customfont.CustomFontActivity;
import ru.arvalon.advanceduitechniques.horizontaliconview.HorizontalIconViewActivity;
import ru.arvalon.advanceduitechniques.viewholderpattern.ViewHolderPatternActivity;

import android.content.Intent;
import android.os.Bundle;

// TODO: 06.03.2019 Toolbar back button on non-main activity

/**
 * Advanced UI Techniques
 * @author arvalon
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.overdraft_button).setOnClickListener(v ->
                startActivity(new Intent(this,OverdraftActivity.class)));

        findViewById(R.id.view_holder_button).setOnClickListener(v ->
                startActivity(new Intent(this, ViewHolderPatternActivity.class)));

        findViewById(R.id.custom_font_button).setOnClickListener(v ->
                startActivity(new Intent(this, CustomFontActivity.class)));

        findViewById(R.id.span_button).setOnClickListener(v ->
                startActivity(new Intent(this,SpanActivity.class)));

        findViewById(R.id.horizontal_icon_view_button).setOnClickListener(v ->
                startActivity(new Intent(this, HorizontalIconViewActivity.class)));
    }
}
