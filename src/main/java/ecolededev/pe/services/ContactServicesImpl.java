

package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Contact;
import ecolededev.pe.domaine.ContactRepository;
import ecolededev.pe.domaine.Partenaire;
import ecolededev.pe.domaine.PartenaireRepository;


@Service
public class ContactServicesImpl implements IContactServices{
	
	@Autowired
	ContactRepository contactRepository;

	@Override
	public List<Contact> listeContacts(){
		List<Contact> liste = contactRepository.findAll();
			
		return liste;
	}
	
	
}
