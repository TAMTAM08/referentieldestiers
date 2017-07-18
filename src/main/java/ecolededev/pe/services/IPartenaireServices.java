package ecolededev.pe.services;


import java.util.List;

import ecolededev.pe.domaine.Partenaire; 

public interface IPartenaireServices {

	public List<Partenaire> listePartenaire();
	public Partenaire getPartenaire(String partenaire);
	
	
}
