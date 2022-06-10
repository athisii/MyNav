package com.athisii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.athisii.databinding.FragmentGameBinding;


public class GameFragment extends Fragment {
    private FragmentGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false);
        binding.submitButton.setOnClickListener(view -> {
            if (binding.maleRadio.isChecked()) {

                // No argument pass
                // Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_maleFragment);

                // To pass type-safe args from source --> des fragment.
                Navigation.findNavController(view).navigate(GameFragmentDirections.actionGameFragmentToMaleFragment("MALE"));
            } else {
                Navigation.findNavController(view).navigate(GameFragmentDirections.actionGameFragmentToFemaleFragment("FEMALE"));
            }

        });
        return binding.getRoot();
    }
}