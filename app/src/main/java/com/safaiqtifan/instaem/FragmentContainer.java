package com.safaiqtifan.instaem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class FragmentContainer extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__fragment_container);

        fragmentManager = getSupportFragmentManager();

        if (findViewById(R.id.container) != null) {

            if (savedInstanceState != null){

                return;

            }

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            LoginScreen loginScreen = new LoginScreen();

            fragmentTransaction.add(R.id.container, loginScreen, null);
            fragmentTransaction.commit();

        }
    }
}