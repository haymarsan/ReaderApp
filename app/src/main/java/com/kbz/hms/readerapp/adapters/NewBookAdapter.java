package com.kbz.hms.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.views.holders.NewBookViewHolder;

public class NewBookAdapter extends RecyclerView.Adapter<NewBookViewHolder> {
    @NonNull
    @Override
    public NewBookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view =inflater.inflate(R.layout.view_item_new, viewGroup, false);

        return new NewBookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewBookViewHolder newBookViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
