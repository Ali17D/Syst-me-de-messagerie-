package TP_2;

public class Message {
	private Etudiant etdE;
	private Etudiant etdR;
	private String titre;
	public Message(Etudiant etdE, Etudiant etdR, String titre) {
		super();
		this.etdE = etdE;
		this.etdR = etdR;
		this.titre = titre;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant getEtdE() {
		return etdE;
	}
	public void setEtdE(Etudiant etdE) {
		this.etdE = etdE;
	}
	public Etudiant getEtdR() {
		return etdR;
	}
	public void setEtdR(Etudiant etdR) {
		this.etdR = etdR;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

}