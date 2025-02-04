package app;

import app.Application;
import models.Personne;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {
              Personne personne1 = new Personne("Cardoso", "Dylan");
              Personne personne2 = new Personne("Nicolas","Louis");
              Personne personne3 = new Personne("Vorlet","Justin");

              System.out.println("Bonjour "+personne1);
              System.out.println("Bonjour "+ personne2);
              System.out.println("Bonjour "+personne3);
        }
}
