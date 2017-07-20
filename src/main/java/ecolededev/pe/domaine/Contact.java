package ecolededev.pe.domaine;

import javax.persistence.*;

@Entity
@Table(name="Contacts")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="idContact")
	private Long idContact;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="fonction")
	private String fonction;
	@Column(name="direction")
	private String direction;
	@Column(name="mail")
	private String mail;
	@Column(name="mobile")
	private int mobile;
	@Column(name="fixe")
	private int fixe;
	@Column(name="commentaire")
	private String commentaire;
	@Column(name="pe")
	private boolean pe;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getFixe() {
		return fixe;
	}
	public void setFixe(int fixe) {
		this.fixe = fixe;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public boolean isPe() {
		return pe;
	}
	public void setPe(boolean pe) {
		this.pe = pe;
	}
	public Contact() {};
	public Contact(String nom, String prenom, String fonction, String direction, String mail, int mobile, int fixe,
			String commentaire, boolean pe) {
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.direction = direction;
		this.mail = mail;
		this.mobile = mobile;
		this.fixe = fixe;
		this.commentaire = commentaire;
		this.pe = pe;
	}
	
	@Override
	public String toString() {
		return "Contact [" + idContact + " nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction + ", direction=" + direction
				+ ", mail=" + mail + ", mobile=" + mobile + ", fixe=" + fixe + ", commentaire=" + commentaire + ", pe="
				+ pe + "]";
	}
	

}
