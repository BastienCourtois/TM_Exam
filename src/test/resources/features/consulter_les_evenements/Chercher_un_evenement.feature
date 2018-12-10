# language: fr
Fonctionnalité: Chercher un evenement
	En tant qu'installeur de ring professionnel
	Je souhaite rechercher quels sont les événements proches de ma région
	Afin de pouvoir travailler
	
	Scénario: Chercher un evenement inexistant
		Soit un utilisateur sur la page evenements
		Quand il cherche la location "Luxembourg"
		Alors il devrait voir l'information "There were no events found, but here are other upcoming events near you."
		
	Scénario: Chercher un evenement existant
		Soit un utilisateur sur la page evenements
		Quand il cherche la location "France"
		Alors il ne devrait pas voir l'information "There were no events found, but here are other upcoming events near you."	