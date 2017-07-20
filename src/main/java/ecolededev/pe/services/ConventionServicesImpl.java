package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Convention;
import ecolededev.pe.domaine.ConventionRepository;
import ecolededev.pe.domaine.PartenaireRepository;



@Service
public class ConventionServicesImpl  implements IConventionServices{

	@Autowired 
	ConventionRepository conventionRepository;

	@Override
	public List<Convention> listeConvention(){
		List<Convention> liste = conventionRepository.findAll();
		return liste;
	}


}





