package ecolededev.pe.home;

import java.util.ArrayList;
import java.util.List;

import ecolededev.pe.domaine.Contact;
import ecolededev.pe.domaine.Convention;
import ecolededev.pe.domaine.Partenaire;

public class HomeForm {
	private String partenaire;
	private List<Partenaire> listePartenaires = new ArrayList<>();
	private List<Convention> listeConventions = new ArrayList<>();
	private List<Contact> listeContacts =  new ArrayList<>();
	private Partenaire objetPartenaire = new Partenaire();

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


	public String getPartenaire() {
		return partenaire;
	}


	public void setPartenaire(String partenaire) {
		this.partenaire = partenaire;
	}


	public Partenaire getObjetPartenaire() {
		return objetPartenaire;
	}


	public void setObjetPartenaire(Partenaire objetPartenaire) {
		this.objetPartenaire = objetPartenaire;
	}
	
	
	
}
