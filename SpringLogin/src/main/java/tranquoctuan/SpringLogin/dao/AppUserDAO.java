package tranquoctuan.SpringLogin.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tranquoctuan.SpringLogin.entities.App_User;


@Repository
public class AppUserDAO {
	@Autowired
	private EntityManager entityManager ;
	public App_User findUserAccount(String username) {
		try {
			
			String sql = "select e from "+ App_User.class.getName()
					+ " e where e.userName = :userName";
			Query query  = entityManager.createQuery(sql);
			query.setParameter("userName", username);
			return (App_User) query.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
}
