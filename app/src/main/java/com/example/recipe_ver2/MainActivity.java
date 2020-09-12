package com.example.recipe_ver2;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    TabLayout tabLayout;
    Button btn_korea;

    FrameLayout simpleFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = findViewById(R.id.scrollView);
        scrollView.setVerticalFadingEdgeEnabled(true);


        tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);

        //Create a new tab named "Country"
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("Country");
        tabLayout.addTab(firstTab);  // add the tab at in the TabLayout

        //Create a new tab named "Type"
        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Type");
        tabLayout.addTab(secondTab);

        //Create a new tab named "Top10"
        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("Top10");
        tabLayout.addTab(thirdTab);

        //Create a new tab named "My page"
        TabLayout.Tab fourthTab = tabLayout.newTab();
        fourthTab.setText("My page");
        tabLayout.addTab(fourthTab);

        

        btn_korea = findViewById(R.id.btn_korean);
        btn_korea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setContentView(R.layout.activity_korean);
            }
        });



        




    }
}