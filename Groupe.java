package TP_2;

import java.util.List;

public class Groupe {
	String titre;
	static List<Etudiant> listeETDG;
	static List<String> listeMsg;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public static List<Etudiant> getListeETDG() {
		return listeETDG;
	}

	public static void setListeETDG(List<Etudiant> listeETDG) {
		Groupe.listeETDG = listeETDG;
	}

	public static List<String> getListeMsg() {
		return listeMsg;
	}

	public static void setListeMsg(List<String> listeMsg) {
		Groupe.listeMsg = listeMsg;
	}

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groupe(String titre) {
		super();
		this.titre = titre;
	}
}
