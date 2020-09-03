package fr.fleury.services;

import fr.fleury.dao.IProfesseurDao;
import fr.fleury.dao.ProfesseurDaoImpl;
import fr.fleury.entity.Departement;
import fr.fleury.entity.Matiere;
import fr.fleury.entity.Professeur;

public class ProfesseurServiceImpl implements IProfesseurService{
	
	IProfesseurDao pDao = new ProfesseurDaoImpl();

	@Override
	public void addProfesseur(Professeur pIn) {

		int verif = pDao.addProfesseur(pIn);
		
		if(verif==1) {
			System.out.println("L'ajout s'est bien déroulé");
		}else {
			System.out.println("Erreur lors de l'ajout");
		}
		
	}

	@Override
	public void delProfesseur(int pId) {

		int verif = pDao.delProfesseur(pId);
		
		if(verif==1) {
			System.out.println("La suppression s'est bien déroulée");
		}else {
			System.out.println("Erreur lors de la suppression");
		}
	}

	@Override
	public void modProfesseur(Professeur pIn) {
		int verif = pDao.modProfesseur(pIn);
		
		if(verif==1) {
			System.out.println("La modification s'est bien déroulé");
		}else {
			System.out.println("Erreur lors de la modification");
		}
	}

	@Override
	public void affecterDeptProfesseur(Professeur pIn, Departement dIn) {

		int verif = pDao.affecterDeptProfesseur(pIn, dIn);
		
		if(verif==1) {
			System.out.println("L'affectation s'est bien passée");
		}else {
			System.out.println("Erreur lors de l'affectation");
		}
		
	}

	@Override
	public void affecterMatProfesseur(Professeur pIn, Matiere mIn) {
		
		int verif = pDao.affecterMatProfesseur(pIn, mIn);
		
		if(verif==1) {
			System.out.println("L'affectation s'est bien passée");
		}else {
			System.out.println("Erreur lors de l'affectation");
		}

		
	}

}
