package com.example.tugassesi3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugassesi3.databinding.ActivityMainBinding;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    private final List<String> teamItems1;
    private Context context;

    public TeamAdapter(List<String> teamItems, Context context) {

        this.teamItems1 = teamItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.f1_teams_main,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return new ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(teamItems1.get(position).getImage());
        holder.tv.setText(teamItems1.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return teamItems1.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tv;
        LinearLayout linlayout;


        public ViewHolder(@NonNull View itemview) {
            super(itemview);

            img = itemview.findViewById(R.id.iv_rb);
//            img = itemview.findViewById(R.id.iv_ferrari);
//            img = itemview.findViewById(R.id.iv_merc);

            tv = itemview.findViewById(R.id.tv_rb);

        }
    }
}