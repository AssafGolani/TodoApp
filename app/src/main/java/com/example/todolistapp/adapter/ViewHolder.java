package com.example.todolistapp.adapter;

import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolistapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    CheckBox task;

    public ViewHolder(View itemView) {
        super(itemView);
        this.task = itemView.findViewById(R.id.checkbox);
    }
}
