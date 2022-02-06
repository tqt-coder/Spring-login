package tranquoctuan.SpringLogin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tranquoctuan.SpringLogin.entities.User_Role;
import tranquoctuan.SpringLogin.entities.App_Role;
import tranquoctuan.SpringLogin.entities.App_User;

@Repository
public class AppRoleDAO {
	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<String> getRolesNames(int userId){
		String sql = "select ur.roleId.roleName from "+ User_Role.class.getName() + " ur where ur.userId.userId = : userId";
		Query query = entityManager.createQuery(sql,String.class);
		query.setParameter("userId", userId);
		return query.getResultList();
	}
}
