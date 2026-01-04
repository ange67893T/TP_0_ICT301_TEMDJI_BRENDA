// Bon exemple : Extension sans modification

// Interface de base
interface Client {
    double calculerRemise(double montant);
}

// Implémentations concrètes
class ClientNormal implements Client {
    public double calculerRemise(double montant) {
        return montant * 0.0; // Pas de remise
    }
}

class ClientBronze implements Client {
    public double calculerRemise(double montant) {
        return montant * 0.05; // 5% de remise
    }
}

class ClientArgent implements Client {
    public double calculerRemise(double montant) {
        return montant * 0.10; // 10% de remise
    }
}

class ClientOr implements Client {
    public double calculerRemise(double montant) {
        return montant * 0.15; // 15% de remise
    }
}

// NOUVEAU type ajouté sans modifier le code existant
class ClientPlatine implements Client {
    public double calculerRemise(double montant) {
        return montant * 0.20; // 20% de remise
    }
}

// Calculatrice qui utilise le polymorphisme
class CalculatriceRemise {
    public double calculerPrixFinal(Client client, double montant) {
        double remise = client.calculerRemise(montant);
        return montant - remise;
    }
}
