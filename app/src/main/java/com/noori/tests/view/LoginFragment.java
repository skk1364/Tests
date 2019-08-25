package com.noori.tests.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.noori.tests.R;
import com.noori.tests.view.component.TextViewNormal;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @BindView(R.id.link_signup)
    TextViewNormal btnRegister;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View loginView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind( this ,loginView);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goto SignUp fragment:
                LoginRegisterActivity activity = (LoginRegisterActivity) getActivity();
                activity.addFragmentToMainLayout(activity.signUpView);
            }
        });
        return loginView;
    }

}
