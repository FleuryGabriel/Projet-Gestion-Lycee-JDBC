package fr.fleury.services;

import fr.fleury.entity.Departement;
import fr.fleury.entity.Etudiant;

public interface IEtudiantService {
	
	public void addEtudiant(Etudiant eIn);
	
	public void delEtudiant(int eId);
	
	public void modEtudiant(Etudiant eIn);
	
	public void affDeptEtudiant(Etudiant eIn, Departement dIn);

}
