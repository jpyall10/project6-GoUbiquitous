package com.example.android.sunshine.app;

import android.graphics.Color;

/**
 * Created by Jon on 5/7/2016.
 */
public final class SunshineWatchFaceUtil {
    private static final String TAG = "SunshineWatchFaceUtil";

//    /**
//     * The path for the {@link DataItem} containing {@link SunshineWatchService} configuration.
//     */
//    public static final String PATH_WITH_FEATURE = "/watch_face_config/Digital";


    public static final String COLOR_NAME_DEFAULT_INTERACTIVE_BACKGROUND = "#03A9F4";
    //public static final int COLOR_VALUE_DEFAULT_INTERACTIVE_BACKGROUND = getResources().getColor(R.color.primary);

    /**
     * Name of the default interactive mode background color and the ambient mode background color.
     */
    public static final String COLOR_NAME_DEFAULT_AMBIENT_BACKGROUND = "Black";
    public static final int COLOR_VALUE_DEFAULT_AND_AMBIENT_BACKGROUND =
            parseColor(COLOR_NAME_DEFAULT_AMBIENT_BACKGROUND);

    /**
     * Name of the default interactive mode hour digits color and the ambient mode hour digits
     * color.
     */
    public static final String COLOR_NAME_DEFAULT_AND_AMBIENT_HOUR_DIGITS = "White";
    public static final int COLOR_VALUE_DEFAULT_AND_AMBIENT_HOUR_DIGITS =
            parseColor(COLOR_NAME_DEFAULT_AND_AMBIENT_HOUR_DIGITS);

    public static final String COLOR_NAME_DEFAULT_AND_AMBIENT_HILOW_DIGITS = "Gray";
    public static final int COLOR_VALUE_DEFAULT_AND_AMBIENT_HILOW_DIGITS =
            parseColor(COLOR_NAME_DEFAULT_AND_AMBIENT_HILOW_DIGITS);


    /**
     * Name of the default interactive mode minute digits color and the ambient mode minute digits
     * color.
     */
    public static final String COLOR_NAME_DEFAULT_AND_AMBIENT_MINUTE_DIGITS = "White";
    public static final int COLOR_VALUE_DEFAULT_AND_AMBIENT_MINUTE_DIGITS =
            parseColor(COLOR_NAME_DEFAULT_AND_AMBIENT_MINUTE_DIGITS);

    /**
     * Name of the default interactive mode second digits color and the ambient mode second digits
     * color.
     */
    public static final String COLOR_NAME_DEFAULT_AND_AMBIENT_SECOND_DIGITS = "Gray";
    public static final int COLOR_VALUE_DEFAULT_AND_AMBIENT_SECOND_DIGITS =
            parseColor(COLOR_NAME_DEFAULT_AND_AMBIENT_SECOND_DIGITS);

    public static final String COLOR_NAME_DEFAULT_COLON = "Gray";
    public static final int COLOR_VALUE_DEFAULT_COLON =
            parseColor(COLOR_NAME_DEFAULT_AND_AMBIENT_SECOND_DIGITS);

    private static int parseColor(String colorName) {
        return Color.parseColor(colorName.toLowerCase());
    }

    private SunshineWatchFaceUtil() { }
}