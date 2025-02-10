package models;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Personne {
       private int MAX_COPAINS = 10;
       private List<Personne> copains;
       private String nom;
       private String prenom;

       public Personne(String nom, String prenom) {
              this.nom = nom;
              this.prenom = prenom;
              this.copains = new ArrayList<>();
       }

       public void addCopain (Personne copain){
              if (copains.size()<MAX_COPAINS) {
                     copains.add(copain);
                     System.out.println("Vous avez ajouté "+copain+" à vos copains!!");
              }
              else{
                     System.out.println("Stop tu n'as plus le droit de te faire des amis car tu es trop pauvre");
              }
       }
       public void removeCopain(Personne copain){
              if (copains.contains(copain)) {
                     copains.remove(copain);
                     System.out.println("Vous avez enlevé "+copain+" de vos amis. Bien fait pour lui.");
              }
              else{
                     System.out.println("Comment veux tu enlever "+copain+" de tes copains si se n'est pas ton copain ?");
              }
       }
       public String getNom() {
              return nom;
       }

       public String getPrenom() {
              return prenom;
       }
       public List<Personne> getCopains(){
              return copains;
       }
       public String toString() {
              StringBuilder lesAmis = new StringBuilder( prenom + " " + nom.toUpperCase());
              if (copains.isEmpty()) {
                   lesAmis.append(" et ses copains ()");
              }else{
                     for (Personne i :copains){
                            lesAmis.append(" ,");
                            lesAmis.append(i);
                     }
              }

              return lesAmis.toString();
       }
}
