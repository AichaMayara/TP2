/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class SystemeGestionEtudiants {
    private ArrayList<Etudiant> list= new ArrayList();
    
    
    public SystemeGestionEtudiants(ArrayList<Etudiant> l){
        this.list=l;
    
    }
    
    
    public void ajouterEtudiant(String nom,String prenom,int numéroInscription,String email){
         
      Etudiant e= new Etudiant(nom,prenom, numéroInscription,email);
      
      list.add(e);                                                     
        }
    public void afficherEtudiants(){
        int nbElement = list.size();
        for(int i=0;i<nbElement;i++ ){
           System.out.println( "le "+i+" Etudiant="+list.get(i).getNom()+   list.get(i).getPrenom()+  list.get(i).getNuméroInscription()+ list.get(i).getEmail());
           }
                                    }
    public void modifierEmailEtudiant(int numéroInscription,String novelEmail) {
              
        int nbElement = list.size();
        for(int i=0;i<nbElement;i++ ){
            if(list.get(i).getNuméroInscription()==numéroInscription){
                   list.get(i).setEmail(novelEmail);
            }
        }
    
         }       
    public void supprimerEtudiant(int numéroInscription){
        int nbElement = list.size();
        for(int i=0;i<nbElement;i++ ){
            if(list.get(i).getNuméroInscription()==numéroInscription){
                   list.remove(i);
            }
        }
    
        
    }       
 
    
}
