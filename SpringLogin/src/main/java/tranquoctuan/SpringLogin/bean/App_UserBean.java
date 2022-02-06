package tranquoctuan.SpringLogin.bean;

public class App_UserBean {
	private int userId;
	private String userName;
	private String encryptPassword;
	private boolean enabled;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEncryptPassword() {
		return encryptPassword;
	}
	public void setEncryptPassword(String encryptPassword) {
		this.encryptPassword = encryptPassword;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public App_UserBean(int userId, String userName, String encryptPassword, boolean enabled) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.encryptPassword = encryptPassword;
		this.enabled = enabled;
	}
	public App_UserBean() {
		super();
	}
	
}
