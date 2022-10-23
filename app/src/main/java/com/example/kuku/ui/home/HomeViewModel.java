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

        data.add(new Item("Kuroiler","Layers","http://pngimg.com/download/2146",800));
        data.add(new Item("Kienyeji","Breeder","http://pngimg.com/download/2146",800));
        data.add(new Item("High Breed","Layers","http://pngimg.com/download/2146",700));
        data.add(new Item("Americano","Layers","http://pngimg.com/download/2146",1000));
        data.add(new Item("Kuroiler","Broilers","http://pngimg.com/download/2146",800));
        data.add(new Item("Kienyeji","Layers","http://pngimg.com/download/2146",500));
        data.add(new Item("High Breed","eggs","http://pngimg.com/download/2146",20));
        data.add(new Item("Americano","chicks","http://pngimg.com/download/2146",120));

        items.setValue(data);
    }

    LiveData<ArrayList<Item>> getData(){
        return items;
    }

}