// Bon exemple : Interfaces ségrégées (séparées)

// Interfaces spécifiques et petites
interface Imprimante {
    void imprimer(String document);
}

interface Scanner {
    void scanner(String document);
}

interface Fax {
    void faxer(String document);
}

interface Email {
    void envoyerEmail(String email, String document);
}

interface Photocopieuse {
    void photocopier(String document);
}

// Imprimante basique : implémente SEULEMENT ce dont elle a besoin
class ImprimanteBasique implements Imprimante {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression de : " + document);
    }
}

// Scanner simple
class ScannerSimple implements Scanner {
    @Override
    public void scanner(String document) {
        System.out.println("Scan de : " + document);
    }
}

// Appareil multifonction qui combine plusieurs interfaces
class AppareilMultifonction implements Imprimante, Scanner, Photocopieuse, Fax {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression multifonction : " + document);
    }
    
    @Override
    public void scanner(String document) {
        System.out.println("Scan multifonction : " + document);
    }
    
    @Override
    public void photocopier(String document) {
        System.out.println("Photocopie : " + document);
    }
    
    @Override
    public void faxer(String document) {
        System.out.println("Envoi fax : " + document);
    }
}

