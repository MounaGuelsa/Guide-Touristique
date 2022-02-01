package com.example.guidehom;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;




    class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView place;
        TextView placeName;
        Button share;
        Button visit;

        PlaceViewHolder(View itemView) {
            super(itemView);

            place = itemView.findViewById(R.id.ivPlace);
            placeName = itemView.findViewById(R.id.tvPlaceName);
            share = itemView.findViewById(R.id.btnShare);
            visit = itemView.findViewById(R.id.btnVisit);
        }
}
