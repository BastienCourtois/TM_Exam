# language: fr
Fonctionnalité: Consulter un champion
	En tant qu'ancien fan de catch
	Je souhaite m'informer des champions actuels
	Afin d'être remis au goût du jour
	
	Scénario: Chercher qui est le champion
		Soit un utilisateur sur la page superstars
		Quand il sélectionne le champion "Universal Champion"
		Alors il devrait voir le nom "Brock Lesnar"
	
	Scénario: Chercher quel titre à une superstar
		Soit un utilisateur sur la page superstars
		Quand il sélectionne "Brock Lesnar"
		Alors il devrait voir le titre "Universal Champion"