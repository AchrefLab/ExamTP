package firstpack;

public class Message {
	private Utilisateur auteur;
	private String Text;
	private Destinataire destinataire;
	
	void setAuteur(Utilisateur aut) {
		this.auteur=aut;
	}
	Utilisateur getAuteur() {
		return this.auteur;
	}
	void setText(String Texte) {
		this.Text=Texte;
	}
	String getText() {
		return this.Text;
	}
	void setDestinataire(Destinataire dest) {
		this.destinataire=dest;
	}
	Destinataire getDestinataire() {
		return this.destinataire;
	}
	
}
