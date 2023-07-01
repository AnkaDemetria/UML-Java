package com.quizz;

import com.actions.Winable;


public class Quizz implements Winable {

    public double difficulte;
    private double niveau;
    private int score;

    public Quizz(double niveau, int score){
        this.difficulte = 1;
        this.niveau = niveau;
        this.score = score;
    }
   
    // public void ajouteScore(){
        
    // }
    // public double niveau(double niveau){
        
    // }
    // public int score(){
        
    // }


    public double getNiveau() {
            return niveau;
        }
    
    public void setNiveau(double niveau) {
        this.niveau = niveau;
    }
    public double getScore() {
            return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    // pas de set ou get pour difficulte car defaut et public

    @Override
    public void win() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'win'");
    }
}





