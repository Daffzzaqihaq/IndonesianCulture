package com.daffzzaqihaq.indonesianculture;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.daffzzaqihaq.indonesianculture.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaHealth, detailHealth;
    int[] gambarHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaHealth = getResources().getStringArray(R.array.name);
        detailHealth = getResources().getStringArray(R.array.detail);
        gambarHealth = new int[]{R.drawable.wayang, R.drawable.angklung, R.drawable.kris, R.drawable.tarisaman, R.drawable.reog, R.drawable.tarikecak};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarHealth, namaHealth, detailHealth);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);


    }
}
