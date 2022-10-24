package com.example.kuku.ui.dashboard;

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
import com.example.kuku.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView recyclerView=root.findViewById(R.id.lessonView);

        LessonAdaptor lessonAdaptor=new LessonAdaptor(getContext());

        dashboardViewModel.getData().observe(getViewLifecycleOwner(), lessonAdaptor::setLessons);

        System.out.println(dashboardViewModel.getData().toString());

        recyclerView.setLayoutManager(new GridLayoutManager(root.getContext(), 1,
        GridLayoutManager.VERTICAL,false));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}