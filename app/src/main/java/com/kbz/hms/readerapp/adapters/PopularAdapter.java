package com.kbz.hms.readerapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.views.holders.PopupularViewHolder;

public class PopularAdapter extends RecyclerView.Adapter<PopupularViewHolder> {

    @NonNull
    @Override
    public PopupularViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_popular, viewGroup, false);

        return new PopupularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopupularViewHolder popupularViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
