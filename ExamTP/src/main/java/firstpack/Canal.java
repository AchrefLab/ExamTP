package firstpack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Canal implements Comparable ,Destinataire {
	public Canal() {
		
	}
	private Map<Role, ArrayList<Utilisateur>> mapping_role_utilisateur;
	private int ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role, ArrayList<Habilitation>> mapping_role_habilitations;
	private List<Message> historique;
	
	public void ecrireMessage(Utilisateur sam, Message mess)  throws ActionNonAutoriseeException {
		if (mess!=null) {
			historique.add(mess);
		}else {
			throw new ActionNonAutoriseeException("AddError");
		}
	}
	public int CompareTo(Canal can) {
		return Integer.compare(ordre, can.ordre);
	}
	
	/************************/
	void setOrdre(int ord) {
		this.ordre=ord;
	}
	int getordre() {
		return this.ordre;
	}
	void setWebhooks(List<Webhook> weblist) {
		this.webhooks=weblist;
	}
	List<Webhook> getWebhooks(){
		return this.webhooks;
	}
	
	void setMapRolUtilisateur(Map<Role, ArrayList<Utilisateur>> unmap) {
		this.mapping_role_utilisateur=unmap;
	}
	Map<Role, ArrayList<Utilisateur>> getMapRolUtilisateur(){
		return this.mapping_role_utilisateur;
	}
	void setMapRolHabilitation(Map<Role, ArrayList<Habilitation>> unhabil) {
		this.mapping_role_habilitations=unhabil;
	}
	Map<Role, ArrayList<Habilitation>> getMapRolHabilitation(){
		return this.mapping_role_habilitations;
	}
	void setHistorique(List<Message> hist) {
		this.historique=hist;
	}
	List<Message> getHistorique(){
		return historique;
	}
	
	
}
