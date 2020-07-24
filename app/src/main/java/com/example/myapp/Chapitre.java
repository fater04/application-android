package com.example.myapp;

public class Chapitre {

    private int id;
    private String titre, contenue;

    public Chapitre() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public Chapitre(int id, String titre, String contenue) {
        this.id = id;
        this.titre = titre;
        this.contenue = contenue;
    }

    public Chapitre(String titre) {
        this.titre = titre;
    }
}
