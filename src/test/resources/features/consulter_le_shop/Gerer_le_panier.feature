# language: fr
Fonctionnalité: Gerer le panier
	En tant qu'acheteur compulsif
	Je souhaite pouvoir gèrer mon panier
	Afin de réguler mes pulsions
		
	Scénario: On ajoute un article présent 
		Soit un utilisateur sur la page shop
		Quand il cherche "WWE Team RAW T-Shirt"
		Quand il choisit la taille "M"
		Quand il choisit de "ajouter au panier"
		Quand il va sur la page "panier"
		Quand il ajoute une quantité de l'article déjà présent
		Alors il devrait voir la quantité "2"
		
	Scénario: On retire l'article présent
		Soit un utilisateur sur la page shop
		Quand il cherche "WWE Team RAW T-Shirt"
		Quand il choisit la taille "M"
		Quand il choisit de "ajouter au panier"
		Quand il va sur la page "panier"
		Quand il retire l'article présent
		Alors il devrait voir l'information "Your Shopping Cart is Empty"