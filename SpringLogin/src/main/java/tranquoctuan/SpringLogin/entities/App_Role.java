package tranquoctuan.SpringLogin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="app_role", uniqueConstraints = {@UniqueConstraint(name="APP_ROLE_UK", columnNames = "role_name")})
public class App_Role {
	@Id
	@GeneratedValue
	@Column(name="role_id", nullable = false)
	private int roleId;
	
	@Column(name="role_name", nullable = false, length= 100)
	private String roleName;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

}
