package me.ccrama.redditslide;

import android.content.Context;

/**
 * Created by carlo_000 on 10/7/2015.
 */
class StartupStrings {
    public static String[] startupStrings(Context context) {
        return new String[]{
                context.getString(R.string.startup_cats),
                context.getString(R.string.startup_banana),
                context.getString(R.string.startup_vine)
        };
    }
}
