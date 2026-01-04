// Mauvais exemple : Une classe avec plusieurs responsabilités
public class Utilisateur {
    private String nom;
    private String email;
    private String motDePasse;
    
    public Utilisateur(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }
    
    // Responsabilité 1 : Gestion des données utilisateur
    public String getNom() {
        return nom;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Responsabilité 2 : Validation
    public boolean validerEmail() {
        return email.contains("@") && email.contains(".");
    }
    
    public boolean validerMotDePasse() {
        return motDePasse.length() >= 8;
    }
    
    // Responsabilité 3 : Sauvegarde en base de données
    public void sauvegarderDansDB() {
        System.out.println("Connexion à la base de données...");
        System.out.println("INSERT INTO utilisateurs VALUES ('" + nom + "', '" + email + "')");
        System.out.println("Utilisateur sauvegardé");
    }
    
    // Responsabilité 4 : Envoi d'email
    public void envoyerEmailBienvenue() {
        System.out.println("Connexion au serveur SMTP...");
        System.out.println("Envoi d'email à " + email);
        System.out.println("Sujet: Bienvenue " + nom);
    }
    
    // Responsabilité 5 : Génération de rapport
    public void genererRapport() {
        System.out.println("=== RAPPORT UTILISATEUR ===");
        System.out.println("Nom: " + nom);
        System.out.println("Email: " + email);
        System.out.println("========================");
    }
}
