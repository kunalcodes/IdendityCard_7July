package com.example.idendity_card;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvCompany;
    private TextView mTvAge;
    private TextView mTvProfession;


    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        intiViews(itemView);

    }

    private void intiViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProfession);
    }

    public void setData(Person person) {
        mIvImage.setImageResource(person.getImage());
        mTvCompany.setText(person.getCompany());
        mTvAge.setText(person.getAge());
        mTvProfession.setText(person.getProfession());
    }
}
