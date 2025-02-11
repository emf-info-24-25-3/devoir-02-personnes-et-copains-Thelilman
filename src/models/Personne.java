package models;

// Classe Personne
class Personne {
        private String nom;
        private String prenom;
        private static final int MAX_COPAINS = 10;
        private Personne[] copains;
        private int nbCopains;
    
        public Personne(String prenom, String nom) {
            this.nom = nom.toUpperCase();
            this.prenom = prenom;
            this.copains = new Personne[MAX_COPAINS];
            this.nbCopains = 0;
        }
    
        public String getNom() {
            return nom;
        }
    
        public String getPrenom() {
            return prenom;
        }
    
        public boolean ajouterCopain(Personne copain) {
            if (nbCopains < MAX_COPAINS) {
                copains[nbCopains] = copain;
                nbCopains++;
                return true;
            }
            return false;
        }
    
        public boolean supprimerCopain(Personne copain) {
            for (int i = 0; i < nbCopains; i++) {
                if (copains[i] == copain) {
                    for (int j = i; j < nbCopains - 1; j++) {
                        copains[j] = copains[j + 1];
                    }
                    copains[nbCopains - 1] = null;
                    nbCopains--;
                    return true;
                }
            }
            return false;
        }
    
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(prenom).append(" ").append(nom).append(" et ses copains  (");
            for (int i = 0; i < nbCopains; i++) {
                sb.append(copains[i].prenom).append(" ").append(copains[i].nom);
                if (i < nbCopains - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
            return sb.toString();
        }
    }
    
    public class devoir02 {
        public static void main(String[] args) {
            executerProgramme();
        }
    
        public static void executerProgramme() {
    
            Personne p1 = new Personne("Alex", "Terrieur");
            Personne p2 = new Personne("John", "Deouf");
            Personne p3 = new Personne("Mac", "haroni");
    
            System.out.println(01);
            System.out.println(02);
            System.out.println(03);
    
            p1.ajouterCopain(p2);
            p1.ajouterCopain(p1);
    
            System.out.println("\nAprès ajout de copains :");
            System.out.println(p1);
        }
    }