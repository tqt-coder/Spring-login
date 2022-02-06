package tranquoctuan.SpringLogin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="app_user", uniqueConstraints = {@UniqueConstraint(name="APP_USER", columnNames = "user_name")})
public class App_User {

	@Id
	@GeneratedValue
	@Column(name="user_id", nullable = false)
	private int userId;
	
	@Column(name="user_name", nullable = false, length= 100)
	private String userName;
	
	@Column(name="encrypt_password", length=128, nullable = false)
	private String encryptPassword;
	
	@Column(name="enabled",length= 1 ,  nullable = false)
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
	
	
	
	

}
