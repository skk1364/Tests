package com.noori.tests.view;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.noori.tests.R;

public class LoginRegisterActivity extends AppCompatActivity {
    LoginFragment loginView;
    SignUpFragment signUpView;
    VerificationFragment verificationView;

    Boolean pressBackBtnAgain = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);


        loginView = new LoginFragment();
        signUpView = new SignUpFragment();
        verificationView = new VerificationFragment();

        addFragmentToMainLayout(loginView);
    }


    // method for adding fragments into main container
    public void addFragmentToMainLayout(android.support.v4.app.Fragment fragment) {
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_main, fragment);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (loginView != null && !loginView.isVisible()) {
            addFragmentToMainLayout(loginView);
        }
        if (pressBackBtnAgain) {
            super.onBackPressed();
            return;
        }

        this.pressBackBtnAgain = true;
        Toast.makeText(this, getString(R.string.press_back_btn_agian), Toast.LENGTH_LONG).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                pressBackBtnAgain = false;
            }
        }, 2000);
    }
}

