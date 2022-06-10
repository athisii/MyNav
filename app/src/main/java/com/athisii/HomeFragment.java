package com.athisii;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.athisii.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

        // Used when no args needs to be passed.
//      binding.playButton.setOnClickListener(view -> Navigation.fidNavController(view).navigate(R.id.action_homeFragment_to_gameFragment));

        // To pass type-safe arguments you always used Direction class.
        binding.playButton.setOnClickListener(view -> Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToGameFragment()));

        setHasOptionsMenu(true);
        return binding.getRoot();
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.options_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //item.id = fragmentId
        return NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(requireView()))
                || super.onOptionsItemSelected(item);
    }
}