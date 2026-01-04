// Bon exemple : Respect du principe de substitution

// Classe de base avec comportements communs
abstract class Oiseau {
    protected String nom;
    
    public Oiseau(String nom) {
        this.nom = nom;
    }
    
    public void manger() {
        System.out.println(nom + " mange des graines");
    }
    
    public abstract void seDeplacer();
}

// Sous-classe pour les oiseaux volants
abstract class OiseauVolant extends Oiseau {
    public OiseauVolant(String nom) {
        super(nom);
    }
    
    public void voler() {
        System.out.println(nom + " vole dans le ciel");
    }
    
    @Override
    public void seDeplacer() {
        voler();
    }
}

// Sous-classe pour les oiseaux non-volants
abstract class OiseauNonVolant extends Oiseau {
    public OiseauNonVolant(String nom) {
        super(nom);
    }
    
    public void marcher() {
        System.out.println(nom + " marche sur le sol");
    }
    
    @Override
    public void seDeplacer() {
        marcher();
    }
}

// Implémentations concrètes
class Aigle extends OiseauVolant {
    public Aigle() {
        super("Aigle");
    }
    
    @Override
    public void voler() {
        System.out.println("L'aigle plane majestueusement");
    }
}

class Pingouin extends OiseauNonVolant {
    public Pingouin() {
        super("Pingouin");
    }
    
    public void nager() {
        System.out.println("Le pingouin nage rapidement");
    }
    
    @Override
    public void seDeplacer() {
        nager();
    }
}

// Maintenant, on peut substituer sans problème
class Habitat {
    public void faireDeplacerOiseau(Oiseau oiseau) {
        oiseau.seDeplacer(); // Fonctionne pour tous les oiseaux !
    }
}
