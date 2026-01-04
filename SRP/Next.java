// Bon exemple : Chaque classe a UNE seule responsabilité

// Classe 1 : Gestion des données utilisateur uniquement
class Utilisateur {
    private String nom;
    private String email;
    private String motDePasse;
    
    public Utilisateur(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }
    
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public String getMotDePasse() { return motDePasse; }
}

// Classe 2 : Responsabilité de validation
class ValidateurUtilisateur {
    public boolean validerEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
    
    public boolean validerMotDePasse(String motDePasse) {
        return motDePasse != null && motDePasse.length() >= 8;
    }
}

// Classe 3 : Responsabilité de sauvegarde
class UtilisateurRepository {
    public void sauvegarder(Utilisateur utilisateur) {
        System.out.println("Connexion à la base de données...");
        System.out.println("INSERT INTO utilisateurs VALUES ('" + 
                         utilisateur.getNom() + "', '" + 
                         utilisateur.getEmail() + "')");
        System.out.println("Utilisateur sauvegardé");
    }
}

// Classe 4 : Responsabilité d'envoi d'email
class ServiceEmail {
    public void envoyerEmailBienvenue(Utilisateur utilisateur) {
        System.out.println("Connexion au serveur SMTP...");
        System.out.println("Envoi d'email à " + utilisateur.getEmail());
        System.out.println("Sujet: Bienvenue " + utilisateur.getNom());
    }
}

// Classe 5 : Responsabilité de génération de rapport
class GenerateurRapport {
    public void genererRapport(Utilisateur utilisateur) {
        System.out.println("=== RAPPORT UTILISATEUR ===");
        System.out.println("Nom: " + utilisateur.getNom());
        System.out.println("Email: " + utilisateur.getEmail());
        System.out.println("========================");
    }
}
