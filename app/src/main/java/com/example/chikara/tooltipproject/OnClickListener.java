package com.example.chikara.tooltipproject;

import android.support.annotation.NonNull;

public interface OnClickListener {

    /**
     * Called when a Tooltip has been clicked.
     *
     * @param tooltip The Tooltip that was clicked.
     */
    void onClick(@NonNull Tooltip tooltip);
}
