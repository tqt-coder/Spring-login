package tranquoctuan.SpringLogin.bean;

public class App_RoleBean {
	private int roleId;
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
	public App_RoleBean(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public App_RoleBean() {
		super();
	}
	

}
