package com.example.tugassesi3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.load.model.Model;
import com.example.tugassesi3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class ItemFragment extends Fragment {
    private RecyclerView recyclerView;
    private LayoutInflater inflater;
    private ViewGroup container;

    private ActivityMainBinding mBinding;

    private List<String> nbaTeamsItemName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.f1_teams_main, container, false);

        recyclerView = view.findViewById(R.id.rv_f1_teams);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new TeamAdapter(initData(),getContext()));




        return view;
    }

    private List<Model> initData() {




        return ;
    }
}