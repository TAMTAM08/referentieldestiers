package ecolededev.pe.services;

	import java.util.ArrayList;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Convention;

	

	@Service
	public class ConventionServicesImpl  implements IConventionServices{
		
	@Autowired
	IContactServices contactservice;
		
		@Override
		public List<Convention> listeConvention(){
			List<Convention> liste = new ArrayList();
				
			liste.add(new Convention("AFPA-001","sujet de la conv","en cours"));
			liste.add(new Convention("AFPA-002", "convention de service 2","En cours" ));
			liste.add(new Convention ("APEC-001", "convention de service 1","Contrat signé"));
			liste.add(new Convention ("APEC-002", "convention de service 1","En cours" ));
			return liste;
		}
		
		
	}





