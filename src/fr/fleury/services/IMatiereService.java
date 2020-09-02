package fr.fleury.services;

import fr.fleury.entity.Matiere;

public interface IMatiereService {
	
	public void addMatiere(Matiere mIn);
	
	public void delMatiere(int mId);
	
	public void modMatiere(Matiere mIn);

}
