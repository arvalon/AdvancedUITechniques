package ru.arvalon.advanceduitechniques.viewholderpattern;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import ru.arvalon.advanceduitechniques.R;

public class ViewHolderPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewholder);
        setTitle("View Holder Pattern Example");

        ListView listView = findViewById(R.id.list);
        //listView.setAdapter(new SimpleAdapter(this));
        listView.setAdapter(new BetterAdapter(this));
    }
}
