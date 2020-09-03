package fr.fleury.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.fleury.entity.Departement;
import fr.fleury.entity.Matiere;
import fr.fleury.entity.Professeur;
import fr.fleury.util.Connecteur;

public class ProfesseurDaoImpl implements IProfesseurDao{
	
	private PreparedStatement ps = null;

	@Override
	public int addProfesseur(Professeur pIn) {
		
		try {
			Connecteur.ouvrirConnexion();
			
			String request = "INSERT INTO professeur (id, nom, prenom, date_aff) VALUES (?, ?, ?, ?);";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, pIn.getId());
			ps.setString(2, pIn.getNom());
			ps.setString(3, pIn.getPrenom());
			ps.setDate(4, pIn.getDate_aff());
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (ps != null) {
					ps.close();
				}

				if (Connecteur.getCx() != null) {
					Connecteur.getCx().close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int delProfesseur(int pId) {
		
		try {
			Connecteur.ouvrirConnexion();
			
			String request = "DELETE FROM professeur WHERE id=?";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, pId);
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (ps != null) {
					ps.close();
				}

				if (Connecteur.getCx() != null) {
					Connecteur.getCx().close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int modProfesseur(Professeur pIn) {

		try {
			Connecteur.ouvrirConnexion();
			
			String request = "UPDATE professeur SET nom=?, prenom=?, date_aff=? WHERE id=?;";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setString(1, pIn.getNom());
			ps.setString(2, pIn.getPrenom());
			ps.setDate(3, pIn.getDate_aff());
			ps.setInt(4, pIn.getId());
			
			int result = ps.executeUpdate();
			
			return result;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (ps != null) {
					ps.close();
				}

				if (Connecteur.getCx() != null) {
					Connecteur.getCx().close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int affecterDeptProfesseur(Professeur pIn, Departement dIn) {
		
		try {
			Connecteur.ouvrirConnexion();
			
			String request = "UPDATE professeur SET id_dep=? WHERE id=?;";
			ps = Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, dIn.getId());
			ps.setInt(2, pIn.getId());
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (ps != null) {
					ps.close();
				}

				if (Connecteur.getCx() != null) {
					Connecteur.getCx().close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int affecterMatProfesseur(Professeur pIn, Matiere mIn) {
		
		try {
			Connecteur.ouvrirConnexion();
			
			String request = "UPDATE professeur SET id_matiere=? WHERE id=?;";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, mIn.getId());
			ps.setInt(2, pIn.getId());
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				if (ps != null) {
					ps.close();
				}

				if (Connecteur.getCx() != null) {
					Connecteur.getCx().close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

}
