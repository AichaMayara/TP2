/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author user
 */
    public class Livre {
    private String titre;
    private String auteur;
    public int anneeDepublication;
    public int isbn;
    
    public String getTitre(){return this.titre;}
    public void setTitre( String titre1){this.titre=titre1;}
    public String getAuteur(){ return this.auteur;}
    public void setAuteur( String auteur1){this.auteur=auteur1;}
    

    
   public Livre(String titre,String auteur,int anneeDepublication,int isbn){
          this.titre=titre;
          this.auteur=auteur;
          this.anneeDepublication=anneeDepublication;
          this.isbn=isbn;
          
   
   
   }
   public Livre(){
        this.titre="atomic";
        this.auteur="jeams";
        this.anneeDepublication=2017;
         this.isbn=12345679;
   }
   public Livre(String titre12,String auteur12){
        this.titre=titre12;
        this.auteur=auteur12;
        this.anneeDepublication=2015;
         this.isbn=1234;
   }
   public Livre(String titre2,String auteur2 ,int annee2){
        this.titre=titre2;
        this.auteur=auteur2;
        this.anneeDepublication=annee2;
         this.isbn=12345679;
   }
   public void Afficher(){
    
       System.out.println ("le titre de livre est= "+titre+" l'auteur= "+auteur+" anneeDepublication est = " +anneeDepublication+ "isbn =" +isbn);
    }
}
    

