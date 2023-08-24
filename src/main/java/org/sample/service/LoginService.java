package org.sample.service;


import org.sample.Entity.Login;
import org.sample.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginrepo;
	
	public Login getLogin(String login_id, String password ) {
		
		Login login= loginrepo.findByLogin_id(login_id);   
		
		if(login==null ){
			System.out.println("inside if");
			return null;
		}
		else if(login.getLogin_id()!=login_id && login.getPassword()!=password) {
			return login;
		}
		else
			{
			System.out.println(login.getLogin_id());
			return login;
			}
}

}
