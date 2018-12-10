# language: fr
Fonctionnalité: Filtrer un evenement
	En tant que fan de catch
	Je souhaite filtrer quels sont les événements que je pourrais voir
	Afin de pouvoir planifier mon programme télé
	
	Scénario: Filtrage impossible
		Soit un utilisateur sur la page evenements
		Quand il filtre les dates du "12/31/2018" au "01/01/2019"
		Alors il devrait voir l'information "There were no events found. Please try again."
		
	Scénario: Filtrage possible
		Soit un utilisateur sur la page evenements
		Quand il filtre les dates du "12/29/2018" au "12/30/2019"
		Alors il ne devrait pas voir l'information "There were no events found. Please try again."	