// Mauvais exemple : Interface trop large

// Interface "obèse" avec trop de méthodes
interface AppareilMultifonction {
    void imprimer(String document);
    void scanner(String document);
    void faxer(String document);
    void envoyerEmail(String email, String document);
    void photocopier(String document);
}

// Une imprimante basique doit implémenter TOUTES les méthodes
class ImprimanteBasique implements AppareilMultifonction {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression de : " + document);
    }
    
    @Override
    public void scanner(String document) {
        // Problème : Cette imprimante ne peut pas scanner !
        throw new UnsupportedOperationException("Fonction scanner non disponible");
    }
    
    @Override
    public void faxer(String document) {
        // Problème : Cette imprimante ne peut pas faxer !
        throw new UnsupportedOperationException("Fonction fax non disponible");
    }
    
    @Override
    public void envoyerEmail(String email, String document) {
        // Problème : Cette imprimante ne peut pas envoyer d'email !
        throw new UnsupportedOperationException("Fonction email non disponible");
    }
    
    @Override
    public void photocopier(String document) {
        // Problème : Cette imprimante ne peut pas photocopier !
        throw new UnsupportedOperationException("Fonction photocopie non disponible");
    }
}
