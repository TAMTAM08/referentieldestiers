

package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Contact;


@Service
public class ContactServicesImpl implements IContactServices{

	@Override
	public List<Contact> listeContacts(){
		List<Contact> liste = new ArrayList();
		liste.add(new Contact("TOTO", "René","Chef","Nord","rene.toto@chef.fr",0606060606,0106060606,"Il a toujours raison ",true));
		liste.add(new Contact("TITI", "Jacques","Grouillot","Sud","jacques.titi@chef.fr",0605050505,0106060605,"Il a toujours raison ",true));
		liste.add(new Contact("TATA", "Jacqueline","Responsable","Nord","jacqueline.tata@chef.fr",0606060604,0106060604,"Il a rarement raison ",false));
		liste.add(new Contact("TUTU", "Cyril","Chef","Est","cyril.tutu@chef.fr",0606060603,0106060603,"Il a rarement raison",false));
		liste.add(new Contact("BABA", "Ali","Chef","Ouest","ali.baba@chef.fr",0606060602,0106060602,"Il a  raison ",false));
		liste.add(new Contact("RIRI", "Charles","Chef","Zénith","charles.riri@chef.fr",0606060601,0106060601,"Il a toujours raison ",true));

		return liste;
	}
	
	
}
