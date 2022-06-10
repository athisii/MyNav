package com.athisii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class FemaleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        var args = FemaleFragmentArgs.fromBundle(requireArguments());
        Toast.makeText(getContext(), "You are: " + args.getGender(), Toast.LENGTH_LONG).show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_female, container, false);
    }
}