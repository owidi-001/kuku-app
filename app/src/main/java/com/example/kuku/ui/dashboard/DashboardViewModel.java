package com.example.kuku.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kuku.models.Lesson;

import java.util.ArrayList;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Lesson>> lessons;

    public DashboardViewModel() {
        lessons = new MutableLiveData<>();
        ArrayList<Lesson> data = new ArrayList<Lesson>();

        data.add(new Lesson("Breeds of Chicken", "https://webstockreview.net/images/clipart-png-chicken.png", "https://webstockreview.net/images/clipart-png-chicken.png"));
        data.add(new Lesson("Chicken Health", "https://webstockreview.net/images/clipart-png-chicken.png", "https://webstockreview.net/images/clipart-png-chicken.png"));
        data.add(new Lesson("Feeding Chicken", "https://webstockreview.net/images/clipart-png-chicken.png", "https://webstockreview.net/images/clipart-png-chicken.png"));
        data.add(new Lesson("Housing for Chicken", "https://webstockreview.net/images/clipart-png-chicken.png", "https://webstockreview.net/images/clipart-png-chicken.png"));

        lessons.setValue(data);
    }

    LiveData<ArrayList<Lesson>> getData(){
        return lessons;
    }
}