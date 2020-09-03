package fr.fleury.main;

import java.sql.Date;

import fr.fleury.entity.Departement;
import fr.fleury.entity.Etudiant;
import fr.fleury.entity.Matiere;
import fr.fleury.entity.Professeur;
import fr.fleury.services.DepartementServiceImpl;
import fr.fleury.services.EtudiantServiceImpl;
import fr.fleury.services.IDepartementService;
import fr.fleury.services.IEtudiantService;
import fr.fleury.services.IMatiereService;
import fr.fleury.services.IProfesseurService;
import fr.fleury.services.MatiereServiceImpl;
import fr.fleury.services.ProfesseurServiceImpl;

public class ClassTest {

	public static void main(String[] args) {

		//Test des méthodes relatives aux départements
		
		Departement d1 = new Departement(4, "Gryffondor");
		Departement d2 = new Departement(5, "Serpentard");
		Departement d3 = new Departement(6, "Poufsouffle");
		
		IDepartementService dService = new DepartementServiceImpl();
		
		dService.addDepartement(d1);
		dService.addDepartement(d2);
		dService.addDepartement(d3);
		
		dService.delDepartement(5);
		
		d3.setNom("Serdaigle");
		dService.modDepartement(d3);
		
		
		//Test des méthodes relatives aux matières
		
		Matiere m1 = new Matiere(6, "Enchantement");
		Matiere m2 = new Matiere(7, "Potions");
//		
		IMatiereService mService = new MatiereServiceImpl();
		
		mService.addMatiere(m1);
		mService.addMatiere(m2);
		
		mService.delMatiere(6);
		
		m1.setNom("Balais");
		mService.modMatiere(m1);
		
		//Test des méthodes relatives aux étudiants
		
		Etudiant e1 = new Etudiant(1, "Potter", "Harry");
		Etudiant e2 = new Etudiant(2, "Granger", "Hermione");
		Etudiant e3 = new Etudiant(3, "Chang", "Cho");
		
		IEtudiantService eService = new EtudiantServiceImpl();
		
		eService.addEtudiant(e1);
		eService.addEtudiant(e2);
		eService.addEtudiant(e3);
		
		eService.delEtudiant(2);
		
		
		e3.setNom("Cheng");
		eService.modEtudiant(e3);
		
		eService.affDeptEtudiant(e1, d1);
		eService.affDeptEtudiant(e2, d1);
		eService.affDeptEtudiant(e3, d2);

		
		//Test des méthodes relatives aux Professeurs
		
		new Date(1988-10-03);
		Professeur p1 = new Professeur(3, "Dumbledor", "Albus", Date.valueOf("1988-10-03"));
		Professeur p2 = new Professeur(4, "McGonagal", "Minerva", Date.valueOf("1989-01-02"));
		Professeur p3 = new Professeur(5, "Rogue", "Severus", Date.valueOf("1999-05-18"));
		
		IProfesseurService pService = new ProfesseurServiceImpl();
		
		pService.addProfesseur(p1);
		pService.addProfesseur(p2);
		pService.addProfesseur(p3);
		
		pService.delProfesseur(2);
		
		p3.setDate_aff(Date.valueOf("1999-12-18"));
		pService.modProfesseur(p3);
		
		pService.affecterDeptProfesseur(p1, d1);
		pService.affecterDeptProfesseur(p2, d1);
		pService.affecterDeptProfesseur(p3, d2);
		
		pService.affecterMatProfesseur(p1, m1);
		pService.affecterMatProfesseur(p3, m2);
		
		
	}

}
