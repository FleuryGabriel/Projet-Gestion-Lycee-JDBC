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
			System.out.println("L'ajout de l'étudiant suivant s'est bien passé : ");
		} else {
			System.out.println("Erreur lors de l'ajout de l'étudiant");
		}
	}

	@Override
	public void delEtudiant(int eId) {

		int verif = eDao.delEtudiant(eId);
		
		if(verif==1) {
			System.out.println("L'étudiant numéro "+eId+" a bien été supprimé");
		}else {
			System.out.println("Erreur lors de la suppression de l'étudiant");
		}
	}

	@Override
	public void modEtudiant(Etudiant eIn) {
		int verif = eDao.modEtudiant(eIn);
		
		if(verif==1) {
			System.out.println("L'étudiant a bien été modifié");
		}else {
			System.out.println("Erreur lors de la modification de l'étudiant");
		}
	}

	@Override
	public void affDeptEtudiant(Etudiant eIn, Departement dIn) {
		int verif = eDao.affecterdeptEtudiant(eIn, dIn);
		
		if(verif==1) {
			System.out.println("L'étudiant a bien été affecté au département");
		}else {
			System.out.println("Erreur lors de l'affectation du département à l'étudiant");
		}
	}

}
