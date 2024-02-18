/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants;



/**
 *
 * @author user
 */



import java.util.ArrayList;
public class TP2SystemeGestionEtudiants {
   
    public static void main(String[] args) {
        Etudiant e1=new Etudiant("Ali","Mayara",12345,"alimayara2@gmail.com");
        Etudiant e2=new Etudiant("Nacer","Kharati",15647,"nacerkharati3@gmail.com");
        
        ArrayList <Etudiant> list=new ArrayList();
        list.add(e1);
        list.add(e2);
        SystemeGestionEtudiants s = new SystemeGestionEtudiants(list);
        s.afficherEtudiants();
        s.modifierEmailEtudiant( 12345, "aichamayara2@gmail.com");
        s.supprimerEtudiant( 15647);
        s.afficherEtudiants();
        
        Livre l = new Livre("atomic","jeams",2017,1234567);
        Livre l1 = new Livre("power","mani");
        Livre l2 = new Livre("atomi","jeam",2020);
        Livre l3 = new Livre("atomic","jeams",2016,123456);
        l.Afficher();
        l1.Afficher();
        l2.Afficher();
        l3.Afficher();
        
        
        
        
       
    }
}
