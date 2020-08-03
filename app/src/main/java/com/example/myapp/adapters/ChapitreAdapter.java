package com.example.myapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.Models.Chapitre;
import com.example.myapp.R;

import java.util.List;

public class ChapitreAdapter extends RecyclerView.Adapter<ChapitreAdapter.MyViewHolder> {

        private List<Chapitre> chapitreList;
    private View.OnClickListener mClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView titre;

            public MyViewHolder(View view) {
                super(view);
                titre = (TextView) view.findViewById(R.id.titreparagraphe);
            }
        }


        public ChapitreAdapter(List<Chapitre> chapitreList) {
            this.chapitreList=chapitreList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_chapitre, parent, false);
            RecyclerView.ViewHolder holder = new MyViewHolder(itemView);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickListener.onClick(view);
                }
            });

            return new MyViewHolder(itemView);
        }
    public void setClickListener(View.OnClickListener callback) {
        mClickListener = callback;
    }
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Chapitre chapitre = chapitreList.get(position);
            holder.titre.setText(chapitre.getTitre());
        }

        @Override
        public int getItemCount() {
            return chapitreList.size();
        }

}
