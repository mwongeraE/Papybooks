package com.example.mwongera.papybooks;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by mwongera on 3/27/16.
 */
public class BaseAppIntro extends AppIntro{

    private int mScrollDurationFactor = 1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base_intro, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_factor1:
                mScrollDurationFactor = 1;
                break;
            case R.id.action_factor2:
                mScrollDurationFactor = 2;
                break;
            case R.id.action_factor4:
                mScrollDurationFactor = 4;
                break;
            case R.id.action_factor6:
                mScrollDurationFactor = 6;
                break;

        }
        setScrollDurationFactor(mScrollDurationFactor);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void init(Bundle savedInstanceState) {

    }

    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {

    }

    @Override
    public void onSlideChanged() {

    }
}
