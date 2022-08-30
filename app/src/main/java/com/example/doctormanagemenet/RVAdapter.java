package com.example.doctormanagemenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Viewholder> {
    Context context;
    ArrayList<DoctorModel> doctorlist;
    public RVAdapter(Context context, ArrayList<DoctorModel> doctorlist) {
        this.context = context;
        this.doctorlist = doctorlist;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        DoctorModel doctorModel = doctorlist.get(position) ;
        holder.name.setText(doctorModel.getUser().getFullName().toString());
        holder.splist.setText(doctorModel.getSpecialist().toString());
     holder.number.setText(doctorModel.getUser().getPhone().toString());
      holder.fee.setText(doctorModel.getFee().toString());
      Glide.with(context).load(doctorModel.getUser().getMedia()).placeholder(R.drawable.ic_launcher_background).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
       return doctorlist.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
       ImageView imageView;
       TextView name;
       TextView splist;
       TextView number;
       TextView fee;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            name=itemView.findViewById(R.id.name);
            splist=itemView.findViewById(R.id.splist);
            number=itemView.findViewById(R.id.pnumber);
            fee=itemView.findViewById(R.id.fee);

        }
    }
}
