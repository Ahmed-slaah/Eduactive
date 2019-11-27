package com.project.semicolon.eduactive;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        TextView textView = view.findViewById(R.id.signiniew);
        TextView textView1 = view.findViewById(R.id.userview);
        TextView textView2 = view.findViewById(R.id.passview);
        CheckBox checkBox = view.findViewById(R.id.cb);
        TextView textView3 = view.findViewById(R.id.forgot_password);
        TextInputEditText editText = view.findViewById(R.id.nametext);
        TextInputEditText editText1 = view.findViewById(R.id.passtext);
        Button btn = view.findViewById(R.id.SIGN_IN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view ;
    }

}
