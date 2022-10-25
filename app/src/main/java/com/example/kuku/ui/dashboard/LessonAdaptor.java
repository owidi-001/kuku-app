package com.example.kuku.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        holder.txtUrl.setText(lessons.get(position).getUrl());
        holder.icon.setImageDrawable(lessons.get(position).getIcon());

        // Handle button click
//        url=lessons.get(position).getUrl();
    }

//    public static void openWebView(String url, View view){
//        WebView webView = view.findViewById(R.id.web_view);
//        webView.loadUrl(url);
//        webView.setWebViewClient(new WebViewClient());
//    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        TextView txtUrl;
        ImageView icon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle=itemView.findViewById(R.id.lessonTitle);
            txtUrl=itemView.findViewById(R.id.lessonUrl);
            icon=itemView.findViewById(R.id.lessonIcon);

            // Button click handles
            Button button = itemView.findViewById(R.id.btn_read);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Opening "+ txtUrl.getText() +" for read",Toast.LENGTH_LONG).show();
                    // Handle navigate to another fragment onclick
                }
            });

        }
    }

    public void setLessons(ArrayList<Lesson> lessons){
        this.lessons=lessons;
    }
}
