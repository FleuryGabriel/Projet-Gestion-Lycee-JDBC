package fr.fleury.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.fleury.entity.Matiere;
import fr.fleury.util.Connecteur;

public class MatiereDaoImpl implements IMatiereDao{
	
	private PreparedStatement ps = null;

	@Override
	public int addMatiere(Matiere mIn) {

		try {
			Connecteur.ouvrirConnexion();
			
			String request = "INSERT INTO matiere (id, nom_matiere) VALUES (?, ?);";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, mIn.getId());
			ps.setString(2, mIn.getNom());
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				if (ps!=null) {
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
	public int delMatiere(int mId) {

		try {
			Connecteur.ouvrirConnexion();
			
			String request = "DELETE FROM matiere WHERE id=?;";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setInt(1, mId);
			
			int result = ps.executeUpdate();
			
			return result;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (ps!=null) {
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
	public int modMatiere(Matiere mIn) {

		try {
			Connecteur.ouvrirConnexion();
			
			String request = "UPDATE matiere SET nom_matiere=? WHERE id=?;";
			ps=Connecteur.getCx().prepareStatement(request);
			ps.setString(1, mIn.getNom());
			ps.setInt(2, mIn.getId());
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (ps!=null) {
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
