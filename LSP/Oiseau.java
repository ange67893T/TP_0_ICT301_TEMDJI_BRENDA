// Mauvais exemple : Violation du principe de substitution

class Oiseau {
    protected String nom;
    
    public Oiseau(String nom) {
        this.nom = nom;
    }
    
    public void voler() {
        System.out.println(nom + " vole dans le ciel");
    }
    
    public void manger() {
        System.out.println(nom + " mange des graines");
    }
}

class Aigle extends Oiseau {
    public Aigle() {
        super("Aigle");
    }
    
    @Override
    public void voler() {
        System.out.println("L'aigle plane majestueusement");
    }
}

class Pingouin extends Oiseau {
    public Pingouin() {
        super("Pingouin");
    }
    
    @Override
    public void voler() {
        // Problème : Un pingouin ne peut pas voler !
        throw new UnsupportedOperationException("Les pingouins ne volent pas !");
    }
}

// Problème : Si on utilise un Oiseau de manière générique
class Voliere {
    public void faireVolerOiseau(Oiseau oiseau) {
        oiseau.voler(); // Cela va planter avec un Pingouin !
    }
}
