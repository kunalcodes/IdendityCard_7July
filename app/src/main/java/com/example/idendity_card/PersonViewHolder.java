package com.example.idendity_card;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvCompany;
    private TextView mTvAge;
    private TextView mTvProfession;
    private CardView mCvCardView;
    private ItemClickListener itemClickListener;


    public PersonViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        intiViews(itemView);

    }

    private void intiViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProfession);
        mCvCardView = itemView.findViewById(R.id.cvCardView);
    }

    public void setData(Person person) {
        mIvImage.setImageResource(person.getImage());
        mTvCompany.setText(person.getCompany());
        mTvAge.setText(person.getAge());
        mTvProfession.setText(person.getProfession());
        mCvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),person);
            }
        });
    }
}
