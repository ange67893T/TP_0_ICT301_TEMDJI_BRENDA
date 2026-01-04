# TP_0_ICT301_TEMDJI_BRENDA
# TP_0_ICT301 - Principes SOLID
 
## Informations Étudiant
- **Nom** : TEMDJI
- **Prénom** : BRENDA
- **Matricule** : 23U2416

---

## Introduction aux Principes SOLID

Les principes SOLID sont un ensemble de 5 bonnes pratiques de programmation orientée objet qui permettent de créer des logiciels plus maintenables, flexibles et évolutifs.

---

## 1. SRP - Single Responsibility Principle
**Principe de Responsabilité Unique**

### Définition
Une classe ne doit avoir qu'une seule raison de changer, c'est-à-dire qu'elle ne doit avoir qu'une seule responsabilité.

### Objectif
- Améliorer la lisibilité du code
- Faciliter la maintenance
- Réduire les effets de bord lors des modifications
- Favoriser la réutilisabilité

### Exemple
Au lieu d'avoir une classe `Utilisateur` qui gère à la fois les données, la validation, la sauvegarde et l'envoi d'emails, on sépare ces responsabilités en plusieurs classes : `Utilisateur`, `ValidateurUtilisateur`, `UtilisateurRepository`, `ServiceEmail`.

---

## 2. OCP - Open/Closed Principle
**Principe Ouvert/Fermé**

### Définition
Les entités logicielles (classes, modules, fonctions) doivent être ouvertes à l'extension mais fermées à la modification.

### Objectif
- Permettre d'ajouter de nouvelles fonctionnalités sans modifier le code existant
- Réduire le risque d'introduire des bugs dans le code qui fonctionne déjà
- Favoriser l'utilisation de l'héritage et du polymorphisme

### Exemple
Au lieu d'utiliser des conditions `if/else` pour gérer différents types de clients, on utilise une interface `Client` et on crée des classes concrètes pour chaque type. Pour ajouter un nouveau type, on crée simplement une nouvelle classe sans toucher au code existant.

---

## 3. LSP - Liskov Substitution Principle
**Principe de Substitution de Liskov**

### Définition
Les objets d'une classe dérivée doivent pouvoir remplacer les objets de la classe de base sans altérer la cohérence du programme.

### Objectif
- Garantir la cohérence du comportement dans une hiérarchie de classes
- Éviter les surprises lors de l'utilisation du polymorphisme
- Assurer que les sous-classes respectent le contrat de la classe parente

### Exemple
Au lieu de faire hériter tous les oiseaux d'une classe `Oiseau` avec une méthode `voler()` (ce qui pose problème pour les pingouins), on crée des hiérarchies appropriées : `OiseauVolant` et `OiseauNonVolant`, permettant une substitution cohérente.

---

## 4. ISP - Interface Segregation Principle
**Principe de Ségrégation des Interfaces**

### Définition
Aucun client ne devrait être forcé de dépendre de méthodes qu'il n'utilise pas. Il vaut mieux plusieurs petites interfaces spécifiques qu'une grande interface générale.

### Objectif
- Éviter les dépendances inutiles
- Rendre le code plus flexible et modulaire
- Faciliter l'implémentation des classes

### Exemple
Au lieu d'avoir une interface `AppareilMultifonction` avec toutes les méthodes (imprimer, scanner, faxer, etc.), on crée des interfaces séparées (`Imprimante`, `Scanner`, `Fax`). Chaque classe n'implémente que les interfaces dont elle a réellement besoin.

---

## 5. DIP - Dependency Inversion Principle
**Principe d'Inversion des Dépendances**

### Définition
Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau. Les deux doivent dépendre d'abstractions. Les abstractions ne doivent pas dépendre des détails, mais les détails doivent dépendre des abstractions.

### Objectif
- Réduire le couplage entre les modules
- Faciliter les tests unitaires (injection de mocks)
- Permettre de changer facilement d'implémentation
- Favoriser la réutilisabilité

### Exemple
Au lieu qu'une classe `UtilisateurService` dépende directement de `MySQLDatabase`, elle dépend d'une interface `Database`. On peut alors injecter n'importe quelle implémentation (MySQL, PostgreSQL, MongoDB) sans modifier `UtilisateurService`.

---

## Structure du Projet

```
TP_0_ICT301_Nom_Prenom/
│
├── README.md
├── diagrammes_UML.pdf
│
├── SRP/
│   ├── avant_refactoring.java
│   └── apres_refactoring.java
│
├── OCP/
│   ├── avant_refactoring.java
│   └── apres_refactoring.java
│
├── LSP/
│   ├── avant_refactoring.java
│   └── apres_refactoring.java
│
├── ISP/
│   ├── avant_refactoring.java
│   └── apres_refactoring.java
│
└── DIP/
    ├── avant_refactoring.java
    └── apres_refactoring.java
```

---

## Conclusion

L'application des principes SOLID permet de créer un code :
- **Maintenable** : Plus facile à comprendre et à modifier
- **Flexible** : Facile à étendre avec de nouvelles fonctionnalités
- **Testable** : Possibilité d'écrire des tests unitaires efficaces
- **Réutilisable** : Les composants peuvent être réutilisés dans différents contextes
- **Robuste** : Moins de bugs et d'effets de bord

---

## Références
- Martin, Robert C. "Agile Software Development, Principles, Patterns, and Practices"
- Documentation Anthropic sur les bonnes pratiques de programmation
- Cours ICT 301 - Principes de conception logicielle
