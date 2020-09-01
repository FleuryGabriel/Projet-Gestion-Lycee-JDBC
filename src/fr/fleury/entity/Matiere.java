package fr.fleury.entity;

import java.util.List;

public class Matiere {
	
	//Attribut
	
	private int id;
	private String nom;
	
	private List<Professeur> professeurs;
	
	//Constructeurs
	public Matiere() {
		super();
	}

	public Matiere(String nom) {
		super();
		this.nom = nom;
	}

	public Matiere(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	
	//Getters et setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	//toString
	@Override
	public String toString() {
		return "Matiere [id=" + id + ", nom=" + nom + ", professeurs=" + professeurs + "]";
	}
	
	

}
