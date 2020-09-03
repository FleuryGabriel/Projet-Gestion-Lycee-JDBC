package fr.fleury.services;

import fr.fleury.dao.EtudiantDaoImpl;
import fr.fleury.dao.IEtudiantDao;
import fr.fleury.entity.Departement;
import fr.fleury.entity.Etudiant;

public class EtudiantServiceImpl implements IEtudiantService {

	IEtudiantDao eDao = new EtudiantDaoImpl();

	@Override
	public void addEtudiant(Etudiant eIn) {

		int verif = eDao.addEtudiant(eIn);

		if (verif == 1) {
			System.out.println("L'ajout de l'�tudiant suivant s'est bien pass� : ");
		} else {
			System.out.println("Erreur lors de l'ajout de l'�tudiant");
		}
	}

	@Override
	public void delEtudiant(int eId) {

		int verif = eDao.delEtudiant(eId);
		
		if(verif==1) {
			System.out.println("L'�tudiant num�ro "+eId+" a bien �t� supprim�");
		}else {
			System.out.println("Erreur lors de la suppression de l'�tudiant");
		}
	}

	@Override
	public void modEtudiant(Etudiant eIn) {
		int verif = eDao.modEtudiant(eIn);
		
		if(verif==1) {
			System.out.println("L'�tudiant a bien �t� modifi�");
		}else {
			System.out.println("Erreur lors de la modification de l'�tudiant");
		}
	}

	@Override
	public void affDeptEtudiant(Etudiant eIn, Departement dIn) {
		int verif = eDao.affecterdeptEtudiant(eIn, dIn);
		
		if(verif==1) {
			System.out.println("L'�tudiant a bien �t� affect� au d�partement");
		}else {
			System.out.println("Erreur lors de l'affectation du d�partement � l'�tudiant");
		}
	}

}
