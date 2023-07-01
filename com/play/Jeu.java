package com.play;

import java.util.List;

import com.actions.Winable;

public class Jeu implements Winable {

    public List<Question> questions;
    // création array list de questions venant de la classe Question

    public Jeu(List<Question> questions){
        this.questions = questions;
    }

    //public Question questions = new Question();
    // https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/557_java-oriente-objet/2696_modeliser-ses-objets-grace-a-uml/
    
    // public Question tireQuestion(){
    //     return questions;
    // }           
    // https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/557_java-oriente-objet/2696_modeliser-ses-objets-grace-a-uml/
    
    @Override
    public void win() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'win'");
    }
}
