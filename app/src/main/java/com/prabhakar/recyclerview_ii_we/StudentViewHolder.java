package com.prabhakar.recyclerview_ii_we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView name;
    private TextView id;
    private TextView dob;
    private TextView address;
    private ClickListener clickListener;
    private CardView card;

    public StudentViewHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initView(itemView);
    }


    private void initView(View itemView) {
        image = itemView.findViewById(R.id.img);
        name = itemView.findViewById(R.id.name);
        id = itemView.findViewById(R.id.id);
        dob = itemView.findViewById(R.id.dob);
        address = itemView.findViewById(R.id.address);
        card = itemView.findViewById(R.id.card);
    }

    public void setData(StudentModel studentModel) {
        image.setImageResource(studentModel.getImg());
        name.setText(studentModel.getName());
        id.setText(studentModel.getId());
        dob.setText(studentModel.getDob());
        address.setText(studentModel.getAddress());
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClicked(studentModel, getAdapterPosition());
            }
        });
    }
}
