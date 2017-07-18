package ecolededev.pe.domaine;

import java.util.List;

public class Partenaire {
	
	private String partenaire;
	private String description;
	private List<Convention> conventions; 

	public Partenaire(String partenaire, String description) {
		this.partenaire = partenaire;
		this.description = description;
	}

	public String getPartenaire()	{ return partenaire; }
	
	public String getDescription()	{ return description; }

	@Override
	public String toString() {
		return "Partenaire [partenaire=" + partenaire + ", description=" + description + "]";
	}

	public List<Convention> getConventions() {
		return conventions;
	}

	public void setConventions(List<Convention> conventions) {
		this.conventions = conventions;
	}

	public void setPartenaire(String partenaire) {
		this.partenaire = partenaire;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
