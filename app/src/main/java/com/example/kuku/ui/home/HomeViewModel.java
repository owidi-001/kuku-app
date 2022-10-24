package com.example.kuku.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kuku.models.Item;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

//    private final MutableLiveData<String> mText;
    private final MutableLiveData<ArrayList<Item>> items;

    public HomeViewModel() {
        items = new MutableLiveData<>();
        ArrayList<Item> data = new ArrayList<Item>();

        data.add(new Item("Kuroiler","Layers","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",800));
        data.add(new Item("Kienyeji","Breeder","https://pngimg.com/uploads/chicken/chicken_PNG2164.png",800));
        data.add(new Item("High Breed","Layers","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",700));
        data.add(new Item("Americano","Layers","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",1000));
        data.add(new Item("Kuroiler","Broilers","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",800));
        data.add(new Item("Kienyeji","Layers","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",500));
        data.add(new Item("High Breed","eggs","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",20));
        data.add(new Item("Americano","chicks","https://pngimg.com/uploads/chicken/chicken_PNG2146.png",120));

        items.setValue(data);
    }

    LiveData<ArrayList<Item>> getData(){
        return items;
    }

}