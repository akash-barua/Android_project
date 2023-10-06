package com.example.modelapp2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modelapp2.R;
import com.example.modelapp2.model.Countrymodel;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>
{
    private ArrayList<Countrymodel>counties;



    public CountryAdapter(ArrayList<Countrymodel> counties) {
        this.counties = counties;
    }

    @NonNull
    @Override
    public CountryViewhHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater = LayoutInflater.from(parent.getContext());
        View view = layoutinflater.inflate(R.layout.recyleview_item,parent,false);
        return new CountryViewhHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
    holder.textview.setText(counties.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return counties.size();
    }
}
 class CountryViewhHolder extends RecyclerView.ViewHolder{
    TextView textView;
    public CountryViewhHolder(@NonNull View itemview){
        super(itemview);
        textView=itemview.findViewById(R.id.country_textView);

    }
 }
