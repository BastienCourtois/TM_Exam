# language: fr
Fonctionnalité: Consulter une superstar
	En tant qu'expert de catch
	Je souhaite consulter la page d'une superstar
	Afin d'en apprendre un peu plus que ce que je sais déjà)
	
	@toto
	Scénario: Chercher avec le nom
		Soit un utilisateur sur la page superstars
		Quand il cherche la superstar "John Cena"
		Alors il devrait voir le nom "John Cena"
	
	Scénario: Chercher en parcourant les superstars
		Soit un utilisateur sur la page superstars
		Quand il sélectionne la superstar "John Cena"
		Alors il devrait voir le nom "John Cena"