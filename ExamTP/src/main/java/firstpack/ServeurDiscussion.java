package firstpack;
import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
public class ServeurDiscussion {
	public ServeurDiscussion() {
		
	}
	public Map <Role, ArrayList<Utilisateur>> mapping_role_utilisateurs;
	public ArrayList<Canal> canaux=new ArrayList<Canal>() ;
	public String nom;
	public Map <Role, ArrayList<Habilitation>> mapping_role_habilitations;
	
}
