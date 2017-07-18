package ecolededev.pe.home;

import java.util.List;

import ecolededev.pe.domaine.Contact;
import ecolededev.pe.domaine.Convention;
import ecolededev.pe.domaine.Partenaire;

public class HomeForm {
	private List<Partenaire> listePartenaires;
	private List<Convention> listeConventions;
	private List<Contact> listeContacts;

	public List<Convention> getListeConventions() {
		return listeConventions;
	}


	public void setListeConventions(List<Convention> listeConventions) {
		this.listeConventions = listeConventions;
	}


	public List<Contact> getListeContacts() {
		return listeContacts;
	}


	public void setListeContacts(List<Contact> listeContacts) {
		this.listeContacts = listeContacts;
	}


	public List<Partenaire> getListePartenaires() {
		return listePartenaires;
	}

	
	public void setListePartenaires(List<Partenaire> listePartenaires) {
		this.listePartenaires = listePartenaires;
	}
	
	
	
}
