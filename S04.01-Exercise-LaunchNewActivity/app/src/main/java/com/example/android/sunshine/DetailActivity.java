package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.sunshine.R;

/**
 * Created by kshim on 7/2/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}