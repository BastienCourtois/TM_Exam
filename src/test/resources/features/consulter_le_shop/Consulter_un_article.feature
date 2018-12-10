# language: fr
Fonctionnalité: Consulter un article
	En tant que père d'un enfant fan de catch
	Je souhaite acceder à un article
	Afin d'avoir des informations avant d'approuver sa lettre au père Noël
	
	Scénario: Chercher avec le nom
		Soit un utilisateur sur la page shop
		Quand il cherche "WWE Team RAW T-Shirt"
		Alors il devrait voir le produit "WWE Team RAW T-Shirt"
	
	Scénario: Chercher un article inexistant
		Soit un utilisateur sur la page shop
		Quand il cherche "t-shirt avec un dinosaure qui chevauche un requin arc-en-ciel"
		Alors il devrait voir l'erreur "We're sorry, no products were found for your search: t-shirt avec des dinosaurs qui chevauchent des raptors arc en ciel "