package ecolededev.pe.domaine;

import java.util.List;

public class Convention {
	private String convention;
	private String objet;
	private String status;
	private List<Convention> listeConvention;
	
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
	public List<Convention> getListeConvention() {
		return listeConvention;
	}
	public void setListeConvention(List<Convention> listeConvention) {
		this.listeConvention = listeConvention;
	}
	
	
	
	
	
}
