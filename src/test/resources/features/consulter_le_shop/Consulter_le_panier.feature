# language: fr
Fonctionnalité: Consulter le panier
	En tant que directeur de ligue de catch
	Je souhaite observer comment le panier fonctionne
	Afin de m'en inspirer pour le shop de ma ligue
	
	Scénario: Le panier est vide
		Soit un utilisateur sur la page shop
		Quand il va sur la page "panier"
		Alors il devrait voir l'information "Your Shopping Cart is Empty"
		
	Scénario: Le panier a l'article que l'on vient de mettre
		Soit un utilisateur sur la page shop
		Quand il cherche "WWE Team RAW T-Shirt"
		Quand il choisit la taille "M"
		Quand il choisit de "ajouter au panier"
		Quand il va sur la page "panier"
		Alors il ne devrait pas voir l'information "Your Shopping Cart is Empty"