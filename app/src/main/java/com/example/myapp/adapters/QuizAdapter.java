package com.example.myapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.Models.Quiz;
import com.example.myapp.R;

import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.MyViewHolder> {

    private List<Quiz> quizList;
    private View.OnClickListener mClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titre;
        public MyViewHolder(View view) {
            super(view);
            titre = (TextView) view.findViewById(R.id.question_quiz);
        }
    }


    public QuizAdapter(List<Quiz> chapitreList) {
        this.quizList=chapitreList;
    }

    @Override
    public QuizAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.liste_quiz, parent, false);
        RecyclerView.ViewHolder holder = new QuizAdapter.MyViewHolder(itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onClick(view);
            }
        });

        return new QuizAdapter.MyViewHolder(itemView);
    }
    public void setClickListener(View.OnClickListener callback) {
        mClickListener = callback;
    }

    @Override
    public void onBindViewHolder(QuizAdapter.MyViewHolder holder, int position) {
        Quiz quiz = quizList.get(position);
        holder.titre.setText(quiz.getQuestion());
    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }

}
