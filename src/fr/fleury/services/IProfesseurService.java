package fr.fleury.services;

import fr.fleury.entity.Departement;
import fr.fleury.entity.Matiere;
import fr.fleury.entity.Professeur;

public interface IProfesseurService {

	public void addProfesseur(Professeur pIn);
	
	public void delProfesseur(int pId);
	
	public void modProfesseur(Professeur pIn);
	
	public void affecterDeptProfesseur(Professeur pIn, Departement dIn);
	
	public void affecterMatProfesseur(Professeur pIn, Matiere mIn);
	
}
