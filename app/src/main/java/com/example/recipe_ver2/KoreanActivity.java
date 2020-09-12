package com.example.recipe_ver2;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.tabs.TabLayout;

public class KoreanActivity extends AppCompatActivity{
    ScrollView scrollView;
    TabLayout tabs;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);
        scrollView = findViewById(R.id.scrollView);
        tabs = findViewById(R.id.tabs);




}}


