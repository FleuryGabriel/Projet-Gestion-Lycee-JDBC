package fr.fleury.entity;

import java.util.List;

public class Departement {

	// Attributs

	private int id;
	private String nom;
	private List<Etudiant> etudiants;
	private List<Professeur> professeurs;

	// Constructeur

	public Departement() {
		super();
	}

	public Departement(String nom) {
		super();
		this.nom = nom;
	}

	public Departement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	// Getters et setters
	
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

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	
	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + ", étudiants=" + etudiants + ", professeurs=" + professeurs + "]";
	}

	
}
