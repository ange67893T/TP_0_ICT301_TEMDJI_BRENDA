public class MySQLDatabase {
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
    
    public void insert(String data) {
        System.out.println("INSERT INTO table VALUES ('" + data + "')");
    }
    
    public void disconnect() {
        System.out.println("Déconnexion de MySQL");
    }
}

// Classe de haut niveau qui dépend directement de MySQLDatabase
class UtilisateurService {
    private MySQLDatabase database; // Dépendance directe !
    
    public UtilisateurService() {
        this.database = new MySQLDatabase(); // Couplage fort !
    }
    
    public void sauvegarderUtilisateur(String nom, String email) {
        database.connect();
        database.insert(nom + "," + email);
        database.disconnect();
    }
}

    

