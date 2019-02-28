package org.pursuit.unit_04_assessment.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.unit_04_assessment.R;
import org.pursuit.unit_04_assessment.SecondActivity;
import org.pursuit.unit_04_assessment.model.Echinoderms;

public class EchinodermsViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewRV;
    private ImageView imageViewRV;

    public EchinodermsViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewRV = itemView.findViewById(R.id.textview_main_RV);
        imageViewRV = itemView.findViewById(R.id.imageview_main_RV);
    }

    public void onBind(final Echinoderms echinoderms) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToSecond = new Intent(itemView.getContext(), SecondActivity.class);
                intentToSecond.putExtra("animal", echinoderms.getAnimal());
                intentToSecond.putExtra("image", echinoderms.getImage());
                intentToSecond.putExtra("wiki", echinoderms.getWiki());
                itemView.getContext().startActivity(intentToSecond);
            }
        });
    }
}
