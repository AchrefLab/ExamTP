package firstpack;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	public Utilisateur() {
		
	}
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	void setServeurs(List<ServeurDiscussion> servers) {
		this.serveurs=servers;
	}
	List<ServeurDiscussion> getServeurs(){
		return this.serveurs;
	}
	
	void setPrenom(String prn) {
		this.prenom=prn;
	}
	String getPrenom() {
		return this.prenom;
	}
	
	void setNom(String n) {
		this.nom=n;
	}
	String getNom() {
		return this.nom;
	}
	
	void setLogin(String log) {
		this.login=log;
	}
	String getLogin() {
		return this.login;
	}
	
	void setMotdePasse(String mdp) {
		this.motDePasse=mdp;
	}
	String getMotdePasse() {
		return this.motDePasse;
	}
	
	void setMail(String ml) {
		this.mail=ml;
	}
	String getMail() {
		return this.mail;
	}
}
