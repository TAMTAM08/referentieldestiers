package ecolededev.pe.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
@Table(name = "partenaire")
public class Partenaire implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String partenaire;
	private String description;
	
	public Partenaire() {
	}

	@ManyToMany(fetch=FetchType.EAGER)
	 @JoinTable(name="partenaire_convention")
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
