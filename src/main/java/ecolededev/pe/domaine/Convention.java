package ecolededev.pe.domaine;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Conventions")
public class Convention {
	@Id
	@GeneratedValue
	@Column(name="idConvention")
	private Long idConvention;
	@Column(name="convention")
	private String convention;
	@Column(name="objet")
	private String objet;
	@Column(name="status")
	private String status;
	@OneToMany
	private List<Contact> listeContacts;

	//	Constructeur
	public Convention() {}
	public Convention(String convention, String objet, String status) {
		this.convention = convention;
		this.objet = objet;
		this.status = status;
	} // Convention

	//	Getteurs
	public String getConvention()	{ return convention; }
	public String getObjet()		{ return objet; }
	public String getStatus()		{ return status; }

	//	Setters
	public void setConvention(String convention)	{ this.convention = convention; }
	public void setObjet(String objet)				{ this.objet = objet; }
	public void setStatus(String status)			{ this.status = status; }

	//	Autres
	@Override
	public String toString() {
		return "Conventions [" + idConvention + " convention=" + convention + ", objet=" + objet + ", status=" + status + "]";
	} // toString

	public Long getIdConvention() {
		return idConvention;
	}

	public void setIdConvention(Long idConvention) {
		this.idConvention = idConvention;
	}

	public List<Contact> getListeContacts() {
		return listeContacts;
	}

	public void setListeContacts(List<Contact> listeContacts) {
		this.listeContacts = listeContacts;
	}


}
