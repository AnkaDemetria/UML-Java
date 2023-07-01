package com.play;

public class Motclef {
    private int poids;
    private String mot;

    public Motclef(String mot, int poids) {
        this.mot = mot;
        this.poids = poids;
    }

    public double pertinence(String) {
        
    }
    
    public int getName() {
            return poids;
        }
    
    public void setPoids(int poids) {
        this.poids = poids;
    }
    public String getMot() {
            return mot;
        }
    
    public void setMot(String mot) {
        this.mot = mot;
    }
}