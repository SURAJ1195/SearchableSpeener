package com.example.searchablespeener.components.interfaces;

import android.view.View;

/**
 * Created by chetan532 on 28/6/23.
 */

public interface ISpinnerSelectedView {
    View getNoSelectionView();

    View getSelectedView(int position);
}
