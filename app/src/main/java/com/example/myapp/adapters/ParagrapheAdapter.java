package com.example.myapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.Models.Paragraphe;
import com.example.myapp.R;

import java.util.List;

public class ParagrapheAdapter extends RecyclerView.Adapter<ParagrapheAdapter.MyViewHolder> {

    private List<Paragraphe> ParagrapheList;
    private View.OnClickListener mClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titre;

        public MyViewHolder(View view) {
            super(view);
            titre = (TextView) view.findViewById(R.id.titreparagraphe);
        }
    }


    public ParagrapheAdapter(List<Paragraphe> ParagrapheList) {
        this.ParagrapheList=ParagrapheList;
    }

    @Override
    public ParagrapheAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_paragraphe, parent, false);
        RecyclerView.ViewHolder holder = new ParagrapheAdapter.MyViewHolder(itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onClick(view);
            }
        });

        return new ParagrapheAdapter.MyViewHolder(itemView);
    }
    public void setClickListener(View.OnClickListener callback) {
        mClickListener = callback;
    }
    @Override
    public void onBindViewHolder(ParagrapheAdapter.MyViewHolder holder, int position) {
        Paragraphe Paragraphe = ParagrapheList.get(position);
        holder.titre.setText(Paragraphe.getTitre());
    }

    @Override
    public int getItemCount() {
        return ParagrapheList.size();
    }

}
