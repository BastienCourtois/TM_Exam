# language: fr
Fonctionnalité: Chercher le shop d'une superstar
	En tant que fan de john cena
	Je souhaite acceder à son shop
	Afin d'acheter des produits à son effigie
	
	Scénario: Chercher avec le nom
		Soit un utilisateur sur la page shop
		Quand il cherche "John Cena"
		Alors il devrait voir le nom "John Cena"
	
	Scénario: Chercher en parcourant les superstars
		Soit un utilisateur sur la page shop
		Quand il va sur la page "superstars"
		Quand il sélectionne "Becky Lynch"
		Alors il devrait voir le nom "Becky Lynch"