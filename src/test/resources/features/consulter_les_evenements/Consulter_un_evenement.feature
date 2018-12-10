# language: fr
Fonctionnalité: Consulter un evenement
	En tant que femme de fan de catch
	Je souhaite consulter un evenement
	Afin de savoir dans quoi je m'embarque
	
	Scénario: Consulter le lieu
		Soit un utilisateur sur la page evenements
		Quand il filtre les evenements avec "Royal Rumble"
		Quand il sélectionne le premier evenement
		Alors il devrait voir le lieu "Phoenix, AZ"
		
	Scénario: Consuler les superstars
		Soit un utilisateur sur la page evenements
		Quand il filtre les evenements avec "Raw"
		Quand il sélectionne le premier evenement
		Alors il devrait voir la superstar "Ronda Rousey"