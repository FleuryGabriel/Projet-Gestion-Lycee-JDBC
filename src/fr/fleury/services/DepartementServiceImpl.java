package fr.fleury.services;

import fr.fleury.dao.DepartementDaoImpl;
import fr.fleury.dao.IDepartementDao;
import fr.fleury.entity.Departement;

public class DepartementServiceImpl implements IDepartementService{
	
	IDepartementDao dDao = new DepartementDaoImpl();
			
			
	@Override
	public void addDepartement(Departement dIn) {
		
		int verif = dDao.addDepartement(dIn);
		
		if(verif==1) {
			System.out.println("L'ajout s'est bien déroulé, département ajouté : ");
			System.out.println(dIn.toString());
		}else {
			System.out.println("Erreur lors de l'ajout du département");
		}
		
	}

	@Override
	public void delDepartement(int dId) {
		
		int verif = dDao.delDepartement(dId);
		
		if(verif==1) {
			System.out.println("Le département numéro "+dId+" a bien été supprimé");
		}else {
			System.out.println("Erreur lors de la suppression du département");
		}

	}

	@Override
	public void modDepartement(Departement dIn) {
		
		int verif = dDao.modDepartement(dIn);
		
		if(verif==1) {
			System.out.println("Le département a bien été modifié, voici ses nouvelles valeurs : ");
			System.out.println(dIn.toString());
		}else {
			System.out.println("Erreur lors de la modification du département");
		}
		
	}

}
