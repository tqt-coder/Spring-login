package tranquoctuan.SpringLogin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name="user_role", uniqueConstraints = {@UniqueConstraint(name="USER_ROLE_UK", columnNames = {"user_id","role_id"})})
public class User_Role {
	
	@Id
	@GeneratedValue
	@Column(name="id", nullable = false)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable = false)
	private App_User userId;
	
	@ManyToOne(fetch  = FetchType.LAZY)
	@JoinColumn(name="role_id",nullable = false)
	private App_Role roleId;
	
	
}
