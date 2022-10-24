package com.example.kuku.ui.dashboard;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuku.R;
import com.example.kuku.models.Lesson;

import java.util.ArrayList;

public class LessonAdaptor extends RecyclerView.Adapter<LessonAdaptor.ViewHolder>{
    private ArrayList<Lesson>  lessons;
    Context context;
    private View view;

    public LessonAdaptor(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.lesson_tile,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitle.setText(lessons.get(position).getTitle());
//        holder.txtUrl.setText(lessons.get(position).getUrl());
        holder.icon.setImageURI(Uri.parse(lessons.get(position).getIcon()));
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
//        TextView txtUrl;
        ImageView icon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.lessonTitle);
//            txtUrl=itemView.findViewById(R.id.lessonUrl);
            icon=itemView.findViewById(R.id.lessonIcon);
        }
    }

    public void setLessons(ArrayList<Lesson> lessons){
        this.lessons=lessons;
        notifyDataSetChanged();
    }
}
