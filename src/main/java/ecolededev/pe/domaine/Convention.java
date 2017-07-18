package ecolededev.pe.domaine;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "convention")
public class Convention implements java.io.Serializable {
	
	@Id
	@GeneratedValue
	private Long id;

	private String convention;
	private String objet;
	private String status;
	
	@OneToOne(fetch=FetchType.EAGER, targetEntity=Contact.class)
	@JoinColumn(name="convention_id")
	Contact contact;
	
	
	public Convention(String convention, String objet, String status) {
		
		this.convention = convention;
		this.objet = objet;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Conventions [convention=" + convention + ", objet=" + objet + ", status=" + status + "]";
	}
	public String getConvention() {
		return convention;
	}
	public void setConvention(String convention) {
		this.convention = convention;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Convention() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
}
