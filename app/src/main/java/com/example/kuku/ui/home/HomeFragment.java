package com.example.kuku.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuku.R;
import com.example.kuku.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        RecyclerView recyclerView = root.findViewById(R.id.itemList);

        ItemAdaptor adapter = new ItemAdaptor(getContext());

        homeViewModel.getData().observe(getViewLifecycleOwner(), adapter::setItems);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(root.getContext(),
                        2,
                        GridLayoutManager.VERTICAL,
                        false
                )

        );

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}