package tranquoctuan.SpringLogin.services; 

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tranquoctuan.SpringLogin.bean.App_UserBean;
import tranquoctuan.SpringLogin.dao.AppRoleDAO;
import tranquoctuan.SpringLogin.dao.AppUserDAO;
import tranquoctuan.SpringLogin.entities.App_User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired	
	private AppRoleDAO appRoleDAO;
	
	@Autowired
	private AppUserDAO appUserDAO;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		App_User appUser = this.appUserDAO.findUserAccount(username);
		if(appUser == null) {
			System.out.println("User not found! "+ username);
			throw new UsernameNotFoundException("User "+ username+ "was not found in the database" );
		}
		System.out.println("Found user "+ appUser +" -- "+ appUser.getUserId());
		List<String>roleNames = appRoleDAO.getRolesNames(appUser.getUserId());
		
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		if(roleNames != null) {
			for (String ls : roleNames) {
				//System.out.println(ls);
				GrantedAuthority authority = new SimpleGrantedAuthority(ls);
				grantList.add(authority);
			}
		}
		UserDetails userDetails  = (UserDetails)new User(appUser.getUserName(), appUser.getEncryptPassword(),grantList );
		return userDetails;
	}
	
	
}
