package me.ccrama.redditslide.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;

import com.devspark.robototextview.RobotoTypefaces;

import me.ccrama.redditslide.R;
import me.ccrama.redditslide.SpoilerRobotoTextView;
import me.ccrama.redditslide.Visuals.FontPreferences;

/**
 * Created by carlo_000 on 1/10/2016.
 */
public class TitleTextView extends SpoilerRobotoTextView {
    public TitleTextView(Context c) {
        super(c);
        if (!isInEditMode()) {
            int type = new FontPreferences(getContext()).getFontTypeTitle().getTypeface();
            Typeface typeface;
            if (type >= 0) {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular);
            } else {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular);
            }
            setTypeface(typeface);

        }
    }

    public TitleTextView(Context c, AttributeSet attrs) {
        super(c, attrs);
        if (!isInEditMode()) {
            int type = new FontPreferences(getContext()).getFontTypeTitle().getTypeface();
            Typeface typeface;
            if (type >= 0) {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular); // This is the one that affects title of each post.
            } else {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular);
            }
            setTypeface(typeface);
        }
    }

    public TitleTextView(Context c, AttributeSet attrs, int defStyle) {
        super(c, attrs, defStyle);
        if (!isInEditMode()) {
            int type = new FontPreferences(getContext()).getFontTypeTitle().getTypeface();
            Typeface typeface;
            if (type >= 0) {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular);
            } else {
                typeface = ResourcesCompat.getFont(c, R.font.product_sans_regular);
            }
            setTypeface(typeface);
        }
    }
}
