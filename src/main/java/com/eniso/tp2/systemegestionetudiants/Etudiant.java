/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author user
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int numéroInscription;
    private String email;
    
    public Etudiant(String Nom,String Prénom,int NuméroInscription,String Email){
         this.nom=Nom;
         this.prenom=Prénom;
         this.numéroInscription= NuméroInscription;
         this.email=Email;
     }
    public String getNom(){ return this.nom;}
    public void setNom(String name){this.nom=name;}
    public String getPrenom(){ return this.prenom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public int getNuméroInscription(){ return this.numéroInscription;}
    public void setNuméroInscription(int numéroInscription){this.numéroInscription=numéroInscription;}
    public String getEmail(){ return this.email;}
    public void setEmail(String email1){this.email=email1;}
    
    public String toString(String nom,String prenom, int numéroInscription,String email){
    
       return "name="+nom+"prenom="+prenom+"numéroInscription="+numéroInscription+"email="+email;
    }
    
}
