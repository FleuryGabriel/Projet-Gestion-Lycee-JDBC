package fr.fleury.services;

import fr.fleury.dao.IMatiereDao;
import fr.fleury.dao.MatiereDaoImpl;
import fr.fleury.entity.Matiere;

public class MatiereServiceImpl implements IMatiereService{

	IMatiereDao mDao = new MatiereDaoImpl();
	
	@Override
	public void addMatiere(Matiere mIn) {

		int verif = mDao.addMatiere(mIn);
		
		if(verif==1) {
			System.out.println("L'ajout de la mati�re s'est bien pass�, ses caract�ristiques sont : ");
			System.out.println(mIn.toString());
		}else{
			System.out.println("Erreur lors de l'ajout de la mati�re");
		}
		
	}

	@Override
	public void delMatiere(int mId) {

		int verif = mDao.delMatiere(mId);
		
		if (verif==1) {
			System.out.println("La mati�re num�ro "+mId+" a bien �t� supprim�e");
		}else {
			System.out.println("Erreur lors de la suppression de la matiere");
		}
		
	}

	@Override
	public void modMatiere(Matiere mIn) {

		int verif = mDao.modMatiere(mIn);
		
		if(verif==1) {
			System.out.println("La modification s'est bien pass�e, la mati�re est d�sormais : ");
			System.out.println(mIn.toString());
		}else {
			System.out.println("Erreur lors de la modification de la matiere");
		}
		
	}

}
