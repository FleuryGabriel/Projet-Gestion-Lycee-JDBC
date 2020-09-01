package fr.fleury.dao;

import fr.fleury.entity.Departement;

public interface IDepartementDao {

	public int addDepartement(Departement dIn);
	
	public int delDepartement(int dId);
	
	public int modDepartement(Departement dIn);
	
	
	
}
