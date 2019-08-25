package com.noori.tests.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.noori.tests.R;
import com.noori.tests.view.component.ButtonNormal;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    @BindView(R.id.btn_register)
    ButtonNormal btnRegister;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View signUpView = inflater.inflate(R.layout.fragment_sign_up, container, false);
        ButterKnife.bind(this, signUpView);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goto Verification fragment:
                LoginRegisterActivity activity = (LoginRegisterActivity) getActivity();
                activity.addFragmentToMainLayout(activity.verificationView);
            }
        });

        return signUpView;
    }

}
