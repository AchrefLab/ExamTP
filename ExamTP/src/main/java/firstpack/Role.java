package firstpack;

import java.util.Objects;

public class Role {
	private String lerole;
	public Role(String unrole) {
		this.lerole=unrole;
	}
	public boolean equals(Object thisobject) {
		if (this == thisobject) {
			return true;
		}else { return false;}
	}	
	 public int hashCode() {
	        return Objects.hash(lerole);
	   }
	 
}
