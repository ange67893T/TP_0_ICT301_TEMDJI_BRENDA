// Abstraction (interface)
interface Database {
    void connect();
    void insert(String data);
    void disconnect();
}

// Implémentations concrètes (bas niveau)
class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
    
    @Override
    public void insert(String data) {
        System.out.println("MySQL INSERT: " + data);
    }
    
    @Override
    public void disconnect() {
        System.out.println("Déconnexion MySQL");
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connexion à PostgreSQL...");
    }
    
    @Override
    public void insert(String data) {
        System.out.println("PostgreSQL INSERT: " + data);
    }
    
    @Override
    public void disconnect() {
        System.out.println("Déconnexion PostgreSQL");
    }
}

class MongoDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connexion à MongoDB...");
    }
    
    @Override
    public void insert(String data) {
        System.out.println("MongoDB INSERT: " + data);
    }
    
    @Override
    public void disconnect() {
        System.out.println("Déconnexion MongoDB");
    }
}

// Classe de haut niveau qui dépend de l'abstraction (interface)
class UtilisateurService {
    private Database database; // Dépendance vers l'abstraction !
    
    // Injection de dépendance via le constructeur
    public UtilisateurService(Database database) {
        this.database = database;
    }
    
    public void sauvegarderUtilisateur(String nom, String email) {
        database.connect();
        database.insert(nom + "," + email);
        database.disconnect();
    }
}
