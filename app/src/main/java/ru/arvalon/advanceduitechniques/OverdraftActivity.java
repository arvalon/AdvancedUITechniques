package ru.arvalon.advanceduitechniques;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Overdraft Example.
 * Don't forget turn on "Show overdraft areas" in Developer options -> Debug GPU overdraft
 */
public class OverdraftActivity extends AppCompatActivity {

    private static final String[] SAMPLE_ITEMS = {
            "You don't want",
            "To work harder than necessary",
            "So don't make the device",
            "Fill pixels again",
            "And again",
            "And again",
            "Take the time",
            "To increase efficiency",
            "And make the app better"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdraft);

        final ListView listView = findViewById(R.id.list);

        listView.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                SAMPLE_ITEMS));
    }
}