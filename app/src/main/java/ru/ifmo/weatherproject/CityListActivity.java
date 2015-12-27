package ru.ifmo.weatherproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


/**
 * Отображает список городов
 */
public class CityListActivity extends ActionBarActivity
        implements CityListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);
    }

    @Override
    public void onItemSelected(String id) {
        Intent detailIntent = new Intent(this, CityDetailActivity.class);
        detailIntent.putExtra(CityDetailFragment.ARG_CITY_ID, id);
        startActivity(detailIntent);
    }
}
