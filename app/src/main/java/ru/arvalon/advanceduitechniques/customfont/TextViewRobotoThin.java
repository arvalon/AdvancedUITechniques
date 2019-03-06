package ru.arvalon.advanceduitechniques.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * TextView that displays the Roboto Thin font.
 *
 * @author Ian G. Clifton
 */
public class TextViewRobotoThin extends AppCompatTextView {

    /**
     * This is the name of the font file within the assets folder
     */
    private static final String FONT_LOCATION = "roboto_thin.ttf";

    private static Typeface sTypeface;

    public TextViewRobotoThin(Context context) {
        super(context);
        setTypeface(getTypeface(context));
    }

    public TextViewRobotoThin(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(getTypeface(context));
    }

    public TextViewRobotoThin(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(getTypeface(context));
    }

    /**
     * Returns the Typeface for Roboto Thin
     *
     * @param context Context to access the app's assets
     * @return Typeface for Roboto Thin
     */
    public static Typeface getTypeface(Context context) {
        if (sTypeface == null) {
            sTypeface = Typeface.createFromAsset(context.getAssets(), FONT_LOCATION);
        }
        return sTypeface;
    }
}
