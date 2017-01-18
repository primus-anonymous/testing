package com.neocaptainnemo.atms.ui;

import android.support.annotation.NonNull;

import com.neocaptainnemo.atms.model.AtmNode;

import java.util.List;

interface IView {

    /**
     * Delivers list of atms to display.
     *
     * @param atmNodes - atms to be displayed.
     */
    void onGotAtms(@NonNull List<AtmNode> atmNodes);

    /**
     * Shows intermediate progress.
     */
    void showProgress();

    /**
     * Hides intemediate progress.
     */
    void hideProgress();

    /**
     * Shows user-friendly error nessage.
     *
     * @param errorMsg - message displayed to user.
     */
    void showError(@NonNull String errorMsg);

    /**
     * Shows plz zoom further info dialog.
     */
    void showZoomInFurther();

    /**
     * Hides plz zoom further info dialog.
     */
    void hideZoomInFurther();

    /**
     * Shows map tab and hides list and settings tabs.
     */
    void showMap();

    /**
     * Shows list tab and hides map and settings tabs.
     */
    void showList();

    /**
     * Shows settings tab and hides map and list tabs.
     */
    void showSettings();
}