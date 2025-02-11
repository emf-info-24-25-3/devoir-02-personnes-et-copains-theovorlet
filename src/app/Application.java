package app;

import app.Application;
import models.Personne;

public class Application {
      public static void main(String[] args) {
            Personne personne1 = new Personne("Cardoso", "Dylan");
            Personne personne2 = new Personne("Nicolas", "Louis");
            Personne personne3 = new Personne("Vorlet", "Justin");

            personne1.addCopain(personne2);
            personne1.addCopain(personne3);
            personne2.addCopain(personne3);
            System.out.println("Bonjour " + personne1);
            System.out.println("Bonjour " + personne2);
            System.out.println("Bonjour " + personne3);
      }
}
