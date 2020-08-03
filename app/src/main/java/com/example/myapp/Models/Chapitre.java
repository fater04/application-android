package com.example.myapp.Models;

public class Chapitre {

    private int id;
    private String titre;

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


    public Chapitre(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Chapitre(String titre) {
        this.titre = titre;
    }
}
