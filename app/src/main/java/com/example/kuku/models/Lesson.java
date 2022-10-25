package com.example.kuku.models;

import android.graphics.drawable.Drawable;

public class Lesson {
    private String title;
    private Drawable icon;
    private String url;

    public Lesson(String title, Drawable icon, String url) {
        this.title = title;
        this.icon = icon;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
