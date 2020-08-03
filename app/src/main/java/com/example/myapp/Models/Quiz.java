package com.example.myapp.Models;

public class Quiz {
    private int id;
    private String question,reponse1,reponse2,reponse3,reponse4,vrai_reponse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    public String getReponse4() {
        return reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    public String getVrai_reponse() {
        return vrai_reponse;
    }

    public void setVrai_reponse(String vrai_reponse) {
        this.vrai_reponse = vrai_reponse;
    }

    public Quiz() {
    }

    public Quiz(int id, String question, String reponse1, String reponse2, String reponse3, String reponse4, String vrai_reponse) {
        this.id = id;
        this.question = question;
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.vrai_reponse = vrai_reponse;
    }

    public Quiz(String question, String reponse1, String reponse2, String reponse3, String reponse4) {
        this.question = question;
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
    }
}

