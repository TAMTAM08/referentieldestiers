package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.account.AccountRepository;
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
	public Partenaire findPartenaire (String nom) {
		return partenaireRepository.findOneByPartenaire (nom);	
	}
	
}
