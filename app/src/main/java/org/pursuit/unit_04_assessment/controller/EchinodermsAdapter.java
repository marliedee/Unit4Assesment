package org.pursuit.unit_04_assessment.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.unit_04_assessment.R;
import org.pursuit.unit_04_assessment.model.Echinoderms;
import org.pursuit.unit_04_assessment.view.EchinodermsViewHolder;

import java.util.List;

public class EchinodermsAdapter extends RecyclerView.Adapter<EchinodermsViewHolder> {
    @NonNull
    private List<Echinoderms> echinodermsList;

    public EchinodermsAdapter(List<Echinoderms> echinodermsList) {
        this.echinodermsList = echinodermsList;
    }

    @NonNull
    @Override
    public EchinodermsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.echinoderms_list_view, viewGroup, false);
        return new EchinodermsViewHolder(childView);
    }


    @Override
    public void onBindViewHolder(@NonNull EchinodermsViewHolder echinodermsViewHolder, int i) {
        echinodermsViewHolder.onBind(echinodermsList.get(i));
    }

    @Override
    public int getItemCount() {
        return echinodermsList.size();
    }
}
