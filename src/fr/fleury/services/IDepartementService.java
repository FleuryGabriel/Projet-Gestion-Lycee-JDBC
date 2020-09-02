package fr.fleury.services;

import fr.fleury.entity.Departement;

public interface IDepartementService {
	
	public void addDepartement(Departement dIn);
	
	public void delDepartement(int dId);
	
	public void modDepartement(Departement dIn);

}
