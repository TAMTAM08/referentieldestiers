package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Partenaire;

@Service
public class PartenaireServicesImpl implements IPartenaireServices{
	
	@Autowired
	IConventionServices conventionServices;

	@Override
	public List<Partenaire> listePartenaire(){
		List<Partenaire> liste = new ArrayList();
		liste.add(new Partenaire("AFPA", "Agence de Formatio Professionelle des Adultes"));
		
		
		liste.add(new Partenaire("APEC", "Agence Pour l'Emploi des Cadres"));
		return liste;
	}
	
	
}
