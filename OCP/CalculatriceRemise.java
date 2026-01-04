// Mauvais exemple : Modification nécessaire à chaque nouveau type

class CalculatriceRemise {
    public double calculerRemise(String typeClient, double montant) {
        if (typeClient.equals("NORMAL")) {
            return montant * 0.0; // Pas de remise
        } 
        else if (typeClient.equals("BRONZE")) {
            return montant * 0.05; // 5% de remise
        } 
        else if (typeClient.equals("ARGENT")) {
            return montant * 0.10; // 10% de remise
        } 
        else if (typeClient.equals("OR")) {
            return montant * 0.15; // 15% de remise
        }
        // Pour ajouter un nouveau type (PLATINE), il faut MODIFIER cette classe
        // else if (typeClient.equals("PLATINE")) {
        //     return montant * 0.20;
        // }
        
        return 0;
    }
    
    public double calculerPrixFinal(String typeClient, double montant) {
        double remise = calculerRemise(typeClient, montant);
        return montant - remise;
    }
}
