package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Partenaire;
import ecolededev.pe.domaine.PartenaireRepository;

@Service
public class PartenaireServicesImpl implements IPartenaireServices{
	
	@Autowired
	PartenaireRepository partenaireRepository;

	@Override
	public List<Partenaire> listePartenaire(){
		List<Partenaire> liste = partenaireRepository.findAll();		
		return liste;
	}

	@Override
	public Partenaire getPartenaire(String partenaire) {
		Partenaire p = partenaireRepository.findOneByPartenaire(partenaire);
		return p;
	}

	
	
}
