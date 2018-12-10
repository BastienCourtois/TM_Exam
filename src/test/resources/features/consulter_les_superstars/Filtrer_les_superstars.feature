# language: fr
Fonctionnalité: Filtrer les superstars
	En tant que General Manager de Raw
	Je souhaite filtrer les superstars
	Afin de savoir qui je peux recruter
	
	Scénario: Recherche réussit
		Soit un utilisateur sur la page superstars
		Quand il filtre les superstars de "WWE NXT"
		Quand il selectionne la première superstar
		Alors il devrait voir l'image "WWE NXT logo"
	
	Scénario: Recherche non réussit
		Soit un utilisateur sur la page superstars
		Quand il filtre les superstars de "RAW"
		Quand il selectionne la première superstar
		Alors il ne devrait pas voir l'image "WWE NXT logo"