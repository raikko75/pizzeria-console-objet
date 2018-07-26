package fr.pizzeria.model;

public class Pizza {
/**
 * @author formationBR
 * objet Pizza 
 */
	
	// variable d'instances
	public int id=0;
	public String code;
	public String libelle;
	public double prix;
	public Pizza(int id, String code, String libelle, double prix) {
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	// retourne id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// retourne code

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	// retourne libelle

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	// retourne le prix

	public double getPrix() {
		return prix;
	}
	

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Pizza(String code, String libelle, double prix) {
		
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	public void nombrePizza()
	{
		this.id = id++;
	}
}
