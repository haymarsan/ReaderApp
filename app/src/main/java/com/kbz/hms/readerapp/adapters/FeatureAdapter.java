package com.kbz.hms.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.views.holders.FeatureViewHolder;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureViewHolder> {
    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_feature, viewGroup, false);
        return new FeatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureViewHolder featureViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
