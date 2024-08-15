

EXPLICATION DU FACTORY PATTERN.


Introduction

Le patron de conception "Factory" est utilisé pour créer des objets sans exposer la logique de création au client. Au lieu de créer des objets directement avec le mot-clé new, on utilise une méthode de fabrication pour gérer la création des objets.

Ce patron fournit une interface pour créer des objets dans une superclasse, mais permet aux sous-classes de modifier le type d'objets qui seront créés.

La structure du pattern Factory Method se compose de quatre éléments clés :

-Product: Il s'agit d'une interface ou d'une classe abstraite qui décrit les méthodes à implémenter par le ConcreteProduct.
- Concrete Product(s): Ce sont les classes qui implémentent l'interface Product.
- Creator: Une classe abstraite qui déclare la méthode factory.
- Concrete Creator(s): Des classes qui implémentent la méthode factory et retournent une instance du ConcreteProduct.

Fonctionnement:

l'interface Product (ou la classe abstraite) définit les méthodes que toutes les classes concrètes de produits (Concrete Products) doivent implémenter. Cela permet de maintenir une cohérence dans la manière dont les objets sont manipulés, même si différents types d'objets sont impliqués 2.

Pourquoi il existe?

Le modèle de conception Factory Method existe pour résoudre des problèmes spécifiques liés à la création d'objets .
Dans de nombreux cas, un système peut nécessiter la création dynamique d'objets dont le type n'est pas connu au moment de la compilation. Par exemple, un système de gestion de contenu peut avoir besoin de générer différents types de contenus (articles, vidéos, images) selon les demandes des utilisateurs. La création manuelle de chaque type d'objet serait inefficace et rendrait le code complexe et difficile à gérer.

Ce pattern est particulièrement utile lorsque la création d'un objet nécessite des processus complexes qui ne sont pas appropriés à inclure dans un objet composite ;  par exemple, si on doit créer un objet complexe qui va dépendre de plusieurs services ou configurations spécifiques. Le modèle Factory Method permet alors de centraliser la logique de création de cet objet dans une méthode de fabrique, simplifiant ainsi le code client et rendant le processus de création plus flexible et extensible.
On l'utilise également  lorsque la création de l'objet pourrait conduire à une duplication significative de code, nécessiter des informations non accessibles à l'objet composite, ou ne faire pas partie des préoccupations de l'objet composite. Par exemple, si la création d'un objet nécessite l'accès à des ressources externes ou à des données non disponibles dans l'objet, ou si la logique de création est trop complexe pour être gérée directement par l'objet, le Factory Method permet de déplacer cette logique hors de l'objet, rendant le code plus propre et plus facile à maintenir.


Encapsulation

L'une des principales forces du modèle Factory Method est sa capacité à encapsuler la logique de création d'objets.

En déplaçant cette logique vers des méthodes abstraites ou des interfaces, il est possible de modifier la manière dont les objets sont créés sans affecter le reste du code ce qui réduit le couplage entre les parties du système , et permet la reutilisabilite.

Extensibilité

Le modèle Factory Method facilite l'extension du système avec de nouveaux types d'objets. Grâce à l'utilisation d'interfaces communes et de méthodes abstraites, il est facile d'ajouter de nouvelles classes d'objets sans modifier le code existant.

Ce qui est également propre à ce design pattern, c'est qu contrairement aux constructeurs de classe, les méthodes de la factory peuvent être nommées de manière significative, ce qui améliore la lisibilité et la compréhension du code
Par exemple , supposons que nous développons une application de gestion de contenu qui doit pouvoir traiter différents types de médias (images, vidéos, textes). Au lieu de créer un constructeur unique pour chaque type de média, nous pouvons utiliser le modèle Factory Method pour créer une interface MediaFactory qui sera implémentée par des classes spécifiques pour chaque type de média.

En résumé Le modèle de conception Factory Method est facile à comprendre car il encapsule la logique d'instanciation dans une méthode de fabrique, permettant aux sous-classes de déterminer la classe réelle des objets à créer. Ce modèle est largement utilisé en raison de sa capacité à promouvoir un couplage faible et à améliorer la flexibilité dans la création d'objets.
-----------------------------------------------------------------------------------------------------

Voici les classes et les méthodes utilisées pour illustrer (Mermaid)

![diagram_FactoryDesign](https://github.com/user-attachments/assets/55205268-107e-4257-b3d3-ce37e8c05479)


classDiagram

direction BT
class Cercle {
+ useFigure() void
+ afficher() void
  }
  class Factory {
+ creeFigure(String) Figure
  }
  class Figure {
  <<Interface>>
+ afficher() void
+ useFigure() void
  }
  class Rectangle {
+ useFigure() void
+ afficher() void
  }
  class TestFigure {
+ main(String[]) void
  }

Cercle  ..>  Figure
Rectangle  ..>  Figure 
