package ecolededev.pe.domaine;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Partenaires")
public class Partenaire {
	@Id
	@GeneratedValue
	@Column(name="idPartenaire")
	private Long idPartenaire;
	@Column(name="partenaire")
	private String partenaire;
	@Column(name="description")
	private String description;
	@OneToMany
	private List<Convention> listeConventions; 

//	Construteur
	public Partenaire() {};
	public Partenaire(String partenaire, String description) {
		this.partenaire = partenaire;
		this.description = description;
	}

	//	Getteurs
	public String getPartenaire()	{ return partenaire; }
	public String getDescription()	{ return description; }

//	Setters
	public void setPartenaire(String partenaire)	{ this.partenaire = partenaire; }
	public void setDescription(String description)	{ this.description = description; }
	
//	Autres
	@Override
	public String toString() {
		return "Partenaire [" + idPartenaire + " partenaire=" + partenaire + ", description=" + description + "]";
	} // toString
	public Long getIdPartenaire() {
		return idPartenaire;
	}
	public void setIdPartenaire(Long idPartenaire) {
		this.idPartenaire = idPartenaire;
	}
	public List<Convention> getListeConventions() {
		return listeConventions;
	}
	public void setListeConventions(List<Convention> listeConventions) {
		this.listeConventions = listeConventions;
	}

	
	
}
