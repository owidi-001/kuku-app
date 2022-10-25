package com.example.kuku.ui.dashboard;

import android.graphics.drawable.Drawable;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kuku.models.Lesson;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Lesson>> lessons;

    public DashboardViewModel() {
        lessons = new MutableLiveData<>();
        ArrayList<Lesson> data = new ArrayList<Lesson>();

        data.add(new Lesson("Breeds of Chicken", loadImages("https://cdn4.iconfinder.com/data/icons/chicken-soft/512/chickens-512.png"), "https://example.com"));
        data.add(new Lesson("Breeds of Chicken", loadImages("https://cdn4.iconfinder.com/data/icons/chicken-soft/512/chickens-512.png"), "https://example.com"));
        data.add(new Lesson("Chicken Health", loadImages("https://cdn0.iconfinder.com/data/icons/health-chicken-pox/500/asp1496b_5_medical_stethoscope_icon_outline_vector_thin_line-512.png"), "https://example.com"));
        data.add(new Lesson("Feeding Chicken", loadImages("https://cdn3.iconfinder.com/data/icons/garden-and-farm/64/chicken-food-animal-feed-feeding-farm-512.png"),"https://example.com"));
        data.add(new Lesson("Housing for Chicken", loadImages("https://cdn2.iconfinder.com/data/icons/animal-in-there-home-mix/168/chicken-in-coop_chicken_coop_agriculture_animal_cage_bird_domestic_farm_farming_hen_home_food-512.png"), "https://example.com"));

        lessons.setValue(data);
    }

    LiveData<ArrayList<Lesson>> getData(){
        return lessons;
    }

    //    Convert urls to drawables
    public static Drawable loadImages(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            System.out.println("Image is set");
            return d;
        } catch (Exception e) {
            return null;
        }
    }
}