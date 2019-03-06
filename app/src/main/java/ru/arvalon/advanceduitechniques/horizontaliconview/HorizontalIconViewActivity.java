package ru.arvalon.advanceduitechniques.horizontaliconview;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import ru.arvalon.advanceduitechniques.R;

public class HorizontalIconViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontaliconview);

        // Get a List of Drawables
        final Resources res = getResources();
        final List<Drawable> list = new ArrayList<>();
        list.add(getDrawable(R.drawable.a));
        list.add(getDrawable(R.drawable.b));
        list.add(getDrawable(R.drawable.c));
        list.add(getDrawable(R.drawable.d));
        list.add(getDrawable(R.drawable.e));
        list.add(getDrawable(R.drawable.f));
        list.add(getDrawable(R.drawable.g));
        list.add(getDrawable(R.drawable.h));
        list.add(getDrawable(R.drawable.i));
        list.add(getDrawable(R.drawable.j));
        list.add(getDrawable(R.drawable.k));
        list.add(getDrawable(R.drawable.l));
        list.add(getDrawable(R.drawable.m));
        list.add(getDrawable(R.drawable.n));
        list.add(getDrawable(R.drawable.o));
        list.add(getDrawable(R.drawable.p));
        list.add(getDrawable(R.drawable.q));
        list.add(getDrawable(R.drawable.r));
        list.add(getDrawable(R.drawable.s));
        list.add(getDrawable(R.drawable.t));
        list.add(getDrawable(R.drawable.u));
        list.add(getDrawable(R.drawable.v));
        list.add(getDrawable(R.drawable.w));
        list.add(getDrawable(R.drawable.x));
        list.add(getDrawable(R.drawable.y));
        list.add(getDrawable(R.drawable.z));

        final HorizontalIconView view = findViewById(R.id.horizontal_icon_view);
        view.setDrawables(list);
    }
}
